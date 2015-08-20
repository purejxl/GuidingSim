import Model.Graph;
import Model.Vertex;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Wood on 2015/8/17.
 */
public class GuidingSim {
    public static final double WALK_SPEED = 1.2; // Unit: m/s
    static int[] numberOfPeople = {50, 200, 400, 600, 800, 1000, 1200, 1400, 1600};
    static int[] exeTimes = {100, 200, 300, 500};


    public static void main(String[] args) {
        new Thread(new SimGuidingTask("./output/result.xls", numberOfPeople, exeTimes)).run();
    }
}
