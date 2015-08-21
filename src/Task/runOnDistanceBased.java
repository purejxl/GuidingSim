package Task;

import Main.GuidingSim;
import Model.Edge;
import Model.Graph;
import Model.Vertex;
import jxl.Workbook;
import jxl.write.*;
import jxl.write.Number;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Wood on 2015/8/19.
 */
public class runOnDistanceBased implements Runnable {
    int numOfPeople;
    int rounds[];

    ArrayList<Graph> graphs;
    ArrayList<Edge> edges;
    ArrayList<Vertex> vertexes;
    DijkstraShortestPath<Vertex, DefaultWeightedEdge> dijkstra;

    String output;
    DecimalFormat df;

    public runOnDistanceBased(ArrayList<Graph> graphs) {
        this.graphs = new ArrayList<>(graphs);
        this.numOfPeople = GuidingSim.numberOfPeople.length;
        this.rounds = GuidingSim.rounds;
        this.output = GuidingSim.DIS_OUTPUT_URL;
        df = new DecimalFormat("##.00");
    }

    @Override
    public void run() {
        try {
            WritableWorkbook workbook = Workbook.createWorkbook(new File(output));
            WritableSheet sheet = workbook.createSheet("結果", 0);  //工作表名稱
            WritableFont myFont = new WritableFont(WritableFont.createFont("微軟正黑體"), 14);
            myFont.setColour(Colour.BLACK);
            WritableCellFormat cellFormat = new WritableCellFormat();
            cellFormat.setFont(myFont); // 指定字型
            cellFormat.setAlignment(Alignment.CENTRE); // 對齊方式

            Label numOfPeople = new Label(0, 0, "人數", cellFormat);

            sheet.addCell(numOfPeople);

            int round;
            double totalDistance = 0;
            double avgDistance;
            double avgDuration;

            for (int i = 0 ; i < rounds.length ; i++) {
                round = this.rounds[i];
                Label timesOfExeLabel = new Label(i+1, 0, "執行" + this.rounds[i] + "次", cellFormat);
                sheet.addCell(timesOfExeLabel);


                for (int j = 0; j < this.numOfPeople; j++) {
                    Graph graph = graphs.get(j);
                    edges = graph.getRoadEdgeList();
                    vertexes = graph.getVertexList();

                    Number numberOfPeopleLabel = new Number(0, j + 1, this.numOfPeople, cellFormat);
                    sheet.addCell(numberOfPeopleLabel);

                    for (int k = 0 ; k < round ; k++) {

                        ArrayList<Double> exeResults = executeDijkstra(graph, round);

                        for (double d : exeResults) {
                            totalDistance += d;
                        }

                        avgDistance = totalDistance / exeResults.size();
                        avgDuration = avgDistance / GuidingSim.getPersonVelocity();

                        Number result = new Number(i+1, j+1, Double.parseDouble(df.format(avgDuration)), cellFormat);
                        sheet.addCell(result);
                        totalDistance = 0;
                    }
                }
                System.out.println(getClass() + " " + round);
            }

            workbook.write();     //寫入
            workbook.close();     //關閉

        } catch (IOException | WriteException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<Double> executeDijkstra(Graph graph, int round) {
        ArrayList<Double> results = new ArrayList<>();
        Random random = new Random();

        for(int i = 0 ; i < round ; i++) {
            int start = random.nextInt(edges.size());
            int end;
            do {
                end = random.nextInt(edges.size());
            } while (start == end);

            dijkstra = new DijkstraShortestPath<>(graph, vertexes.get(start), vertexes.get(end));
            results.add(dijkstra.getPathLength());

        }
        return results;
    }
}
