package Task;

import Main.GuidingSim;
import Model.Edge;
import Model.Graph;
import Model.Vertex;
import jxl.Workbook;
import jxl.write.*;
import jxl.write.Number;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by Wood on 2015/8/19.
 */
public class runOnDistanceBased implements Runnable {
    List<Graph> graphs;
    ArrayList<Edge> edges;
    ArrayList<Vertex> vertexes;
    DijkstraShortestPath<Vertex, DefaultWeightedEdge> dijkstra;
    ArrayList<ArrayList<HashMap<String, Integer>>> randomTravelList;
    ArrayList<ArrayList<Integer>> randomDeployPeopleList;

    String output;
    DecimalFormat df;

    public runOnDistanceBased() {
        this.graphs = new ArrayList<>();
        this.output = GuidingSim.DIS_OUTPUT_URL;
        initialData();
        df = new DecimalFormat("##.00");
    }

    @Override
    public void run() {
        try {
            WritableWorkbook workbook = Workbook.createWorkbook(new File(output));
            WritableSheet timeSheet = workbook.createSheet("結果(時間單位)", 1);  //工作表名稱
            WritableSheet distanceSheet = workbook.createSheet("結果(距離單位)", 1);  //工作表名稱
            WritableFont myFont = new WritableFont(WritableFont.createFont("微軟正黑體"), 14);
            myFont.setColour(Colour.BLACK);
            WritableCellFormat cellFormat = new WritableCellFormat();
            cellFormat.setFont(myFont); // 指定字型
            cellFormat.setAlignment(Alignment.CENTRE); // 對齊方式

            timeSheet.addCell(new Label(0, 0, "人數", cellFormat));
            distanceSheet.addCell(new Label(0, 0, "人數", cellFormat));

            double totalDuration = 0;
            double totalDistance = 0;
            double avgDuration;
            double avgDistance;

            for (int i = 0 ; i < randomTravelList.size() ; i++) {
                timeSheet.addCell(new Label(i+1, 0, "執行" + randomTravelList.get(i).size() + "次", cellFormat));
                distanceSheet.addCell(new Label(i+1, 0, "執行" + randomTravelList.get(i).size() + "次", cellFormat));


                for (int j = 0; j < randomDeployPeopleList.size(); j++) {
                    Graph graph = graphs.get(j);
                    edges = graph.getRoadEdgeList();
                    setWeightType(edges, GuidingSim.DISTANSE_BASED);
                    vertexes = graph.getVertexList();


                    Number tNumberOfPeopleLabel = new Number(0, j + 1, randomDeployPeopleList.get(j).size(), cellFormat);
                    Number dNumberOfPeopleLabel = new Number(0, j + 1, randomDeployPeopleList.get(j).size(), cellFormat);
                    timeSheet.addCell(tNumberOfPeopleLabel);
                    distanceSheet.addCell(dNumberOfPeopleLabel);

                    ArrayList<ArrayList<Double>> results = executeDijkstra(graph, randomTravelList.get(i));
                    ArrayList<Double> exeDistanceResults = results.get(0);
                    ArrayList<Double> exeDurationResults = results.get(1);

                    for (double d : exeDurationResults) {
                        totalDuration += d;
                    }

                    for (double d : exeDistanceResults) {
                        totalDistance += d;
                    }

                    avgDuration = totalDuration / exeDurationResults.size();
                    avgDistance = totalDistance / exeDistanceResults.size();

                    Number timeResult = new Number(i+1, j+1, Double.parseDouble(df.format(avgDuration)), cellFormat);
                    Number distanceResult = new Number(i+1, j+1, Double.parseDouble(df.format(avgDistance)), cellFormat);
                    timeSheet.addCell(timeResult);
                    distanceSheet.addCell(distanceResult);

                    totalDuration = 0;
                    totalDistance = 0;
                    exeDistanceResults.clear();
                    exeDurationResults.clear();
                }
            }

            workbook.write();     //寫入
            workbook.close();     //關閉

        } catch (IOException | WriteException e) {
            e.printStackTrace();
        }
    }

    private void setWeightType(ArrayList<Edge> edges, int type) {
        for (Edge edge : edges) {
            edge.setWeightType(type);
        }
    }

    private ArrayList<ArrayList<Double>> executeDijkstra(Graph graph, ArrayList<HashMap<String, Integer>> randomPosition) {
        ArrayList<ArrayList<Double>> results = new ArrayList<>();
        ArrayList<Double> durationResults = new ArrayList<>();
        ArrayList<Double> distanceResults = new ArrayList<>();

        for (HashMap<String, Integer> position : randomPosition) {
            double totalDuration = 0;
            double totalDistance;
            int start = position.get(GuidingSim.START);
            int end = position.get(GuidingSim.END);
            dijkstra = new DijkstraShortestPath<>(graph, vertexes.get(start), vertexes.get(end));
            GraphPath graphPath = dijkstra.getPath();
            for (Object edge : graphPath.getEdgeList()) {
                totalDuration += ((Edge) edge).getDuration();
            }
            durationResults.add(totalDuration);

            totalDistance = dijkstra.getPathLength();
            distanceResults.add(totalDistance);
        }

        results.add(0, distanceResults);
        results.add(1, durationResults);

        return results;
    }

    private void initialData() {
        randomTravelList = GuidingSim.randomTravelList;
        randomDeployPeopleList = GuidingSim.randomDeployPeopleList;
        for (ArrayList<Integer> nList : randomDeployPeopleList) {
            Graph graph = new Graph();
            deployPeopleOnGraph(graph, nList);
            graphs.add(graph);
        }
    }

    /**
     *
     * @param graph the graph
     * @param positionList the number of people
     *
     */
    private void deployPeopleOnGraph(Graph graph, ArrayList<Integer> positionList) {
        ArrayList<Edge> edges = graph.getRoadEdgeList();

        for (int n : positionList) {
            edges.get(n).nPeople++;
        }
    }
}
