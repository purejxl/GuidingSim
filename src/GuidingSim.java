import Model.Graph;
import Model.Vertex;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Wood on 2015/8/17.
 */
public class GuidingSim {
    public static final double WALK_SPEED = 1.2; // Unit: m/s
    static int[] numberOfPeople = {50, 200, 400, 600, 800, 1000, 1200, 1400, 1600};
    static int[] exeTimes = {100, 200, 300, 500};

    public static String OUTPUT_DIRECTORY = "outputs";
    public static String OUTPUT_URL = "." + File.separator + OUTPUT_DIRECTORY + File.separator+ "result.xls";

    public static void main(String[] args) {
        File dirOutput = new File(OUTPUT_DIRECTORY);
        if (!dirOutput.exists())
            dirOutput.mkdir();

        new Thread(new SimGuidingTask(OUTPUT_URL, numberOfPeople, exeTimes)).run();
    }
}
