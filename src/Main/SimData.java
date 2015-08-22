package Main;


import Model.Edge;
import Model.Graph;
import org.jgrapht.alg.DijkstraShortestPath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Wood on 2015/8/22.
 */
public class SimData {
    public static final String START = "start";
    public static final String END = "end";
    public final int nPeople;
    public final int round[];
    public final Graph graph;
    public final ArrayList<HashMap<String, Integer>> randomPosition;
    ArrayList<ArrayList<HashMap<String, Integer>>> randomPositionList;
    public SimData(Graph graph, int nPeople, int round[]) {
        this.graph = graph;
        this.nPeople = nPeople;
        this.round = round;
        this.randomPosition = new ArrayList<>();

        initial();

    }

    void initial() {
        deployPeopleOnGraph(graph, nPeople);
        initialRandomPosition(round, graph.getRoadEdgeList().size());
    }

    /**
     *
     * @param graph the graph
     * @param n the number of people
     *
     */
    private void deployPeopleOnGraph(Graph graph, int n) {
        ArrayList<Edge> edges = graph.getRoadEdgeList();
        int size = edges.size();

        Random r = new Random(System.currentTimeMillis());
        for (int i = 0 ; i < n ; i++) {
            int p = r.nextInt(size);
            edges.get(p).nPeople++;

        }
    }

    private ArrayList<ArrayList<HashMap<String, Integer>>> initialRandomPosition(int round[], int bound) {
        ArrayList<ArrayList<HashMap<String, Integer>>> randomPositionList = new ArrayList<>();
        ArrayList<HashMap<String, Integer>> randomPosition = new ArrayList<>();
        Random random = new Random();

        for (int aRound : round) {
            for (int j = 0; j < aRound; j++) {
                int start = random.nextInt(bound);
                int end;
                do {
                    end = random.nextInt(bound);
                } while (start == end);

                HashMap<String, Integer> positionMap = new HashMap<>();
                positionMap.put(START, start);
                positionMap.put(END, end);

                randomPosition.add(positionMap);
            }
            randomPositionList.add(randomPosition);
        }

        return randomPositionList;
    }
}
