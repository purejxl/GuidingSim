import Model.Graph;
import Model.Vertex;
import jxl.Workbook;
import jxl.write.*;
import jxl.write.Number;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Wood on 2015/8/19.
 */
public class SimGuidingTask implements Runnable {
    Graph graph;
    ArrayList<DefaultWeightedEdge> edges;
    ArrayList<Vertex> vertexes;
    int numOfPeople[];
    int exeTimes[];
    double increaseWeightPerPeople = GuidingSim.WALK_SPEED;

    Graph copyGraph;
    ArrayList<DefaultWeightedEdge> copyEdges;
    ArrayList<Vertex> copyVertexes;

    String output;
    ArrayList<Double> oriResult;
    ArrayList<Double> copyResult;

    public SimGuidingTask(String output, int numOfPeople[], int exeTimes[]) {
        graph = new Graph();
        edges = graph.getRoadEdgeList();
        vertexes = graph.getVertexList();
        this.numOfPeople = numOfPeople;
        this.exeTimes = exeTimes;
        this.output = output;
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

            oriResult = new ArrayList<>();
            copyResult = new ArrayList<>();

            for (int i = 0 ; i < exeTimes.length ; i++) {
                Label timesOfExeLabel = new Label(i+1, 0, "執行" + exeTimes[i] + "次", cellFormat);
                sheet.addCell(timesOfExeLabel);



                double sum = 0;
                for (int j = 0; j < this.numOfPeople.length; j++) {
                    int num = this.numOfPeople[j];
                    Number numberOfPeopleLabel = new Number(0, j + 1, num, cellFormat);
                    sheet.addCell(numberOfPeopleLabel);

                    copyGraph = new Graph();
                    copyEdges = copyGraph.getRoadEdgeList();
                    copyVertexes = copyGraph.getVertexList();
                    execute(num);

                    for (double d : copyResult) {
                        sum += d;
                    }

                    Number result = new Number(i+1, j+1, sum / copyResult.size(), cellFormat);
                    sheet.addCell(result);
                    System.out.println(copyResult.size());
                    copyResult.clear();
                }
            }

            workbook.write();     //寫入
            workbook.close();     //關閉

        } catch (IOException | WriteException e) {
            e.printStackTrace();
        }
    }

    DijkstraShortestPath<Vertex, DefaultWeightedEdge> copyDijkstra;
    DijkstraShortestPath<Vertex, DefaultWeightedEdge> oriDijkstra;

    private void execute(int numOfPeople) {
        Random random = new Random();

        for(int i = 0 ; i < numOfPeople ; i++) {

            /**Begin- Add people to the path by increase path weighted -Begin*/
            int n = random.nextInt(copyEdges.size());
            DefaultWeightedEdge e = copyEdges.get(n);
            double weight = copyGraph.getEdgeWeight(e);
            double altWeight = weight + increaseWeightPerPeople;
            copyGraph.modifyWeightedEdge(e, altWeight);
            /**End- Add people to the path by increase path weighted -End*/

            int start = random.nextInt(copyEdges.size());
            int end;
            do {
                end = random.nextInt(copyEdges.size());
            } while (start == end);
            copyDijkstra = new DijkstraShortestPath<>(copyGraph, copyVertexes.get(start), copyVertexes.get(end));
            oriDijkstra = new DijkstraShortestPath<>(graph, vertexes.get(start), vertexes.get(end));

            oriResult.add(oriDijkstra.getPathLength());
            copyResult.add(copyDijkstra.getPathLength());
        }
    }
}
