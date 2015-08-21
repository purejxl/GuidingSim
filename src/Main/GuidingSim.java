package Main;

import Model.Edge;
import Model.Graph;
import Task.runOnDistanceBased;
import Task.runOnTimeBased;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Wood on 2015/8/17.
 */
public class GuidingSim {
    public static int[] numberOfPeople = {50, 200, 400, 600, 800, 1000, 1200, 1400, 1600};
    public static int[] rounds = {100, 200, 300, 500};
    public static String OUTPUT_DIRECTORY = "outputs";
    public static String DIS_OUTPUT_URL = "." + File.separator + OUTPUT_DIRECTORY + File.separator+ "Distance based result.xls";
    public static String TIME_OUTPUT_URL = "." + File.separator + OUTPUT_DIRECTORY + File.separator+ "Time based result.xls";

    public static void main(String[] args) {
        File dirOutput = new File(OUTPUT_DIRECTORY);
        if (!dirOutput.exists())
            dirOutput.mkdir();

        GuidingSim guidingSim = new GuidingSim();
        ArrayList<Graph> graphs = new ArrayList<>();

        guidingSim.initialGraphs(graphs);
        guidingSim.execute(graphs);

    }

    private void initialGraphs(ArrayList<Graph> graphs) {
        for (int n : numberOfPeople) {
            Graph graph = Graph.getNewInstance();

            deployPeopleOnGraph(graph, n);

            graphs.add(graph);
        }
    }

    private void execute(ArrayList<Graph> graphs) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(new runOnDistanceBased(graphs));
        executor.execute(new runOnTimeBased(graphs));

        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        System.out.println("Finished all threads");
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
            Edge edge = edges.get(p);
            edge.nPeople++;
        }
    }

    /**
     *
     * @return the velocity of a person randomly in a range between 0.89 m/s and 1.5 m/s
     *
     */
    public static double getPersonVelocity() {

        //平均老年人步行的速度是3.2 km/h ~ 3.9 km/h，年輕人則為3.75 km/h ~ 5.43 km/h
        return randDouble(0.888888889, 1.50833333);
    }

    /**
     *
     * @param d the density
     * @return the velocity(Unit: meter / sec) of a person considering the crowd density, see{@link #getPersonVelocity()}
     *
     */
    public static double getPersonVelocity(double d) {
        return getVelocityByDensity(getPersonVelocity(), d);
    }

    /**
     *
     * @param v the velocity of a person
     * @param d the density of people in square meter
     * @return the velocity of a person considering the crowd density (Unit: meter / sec)
     *
     */
    private static double getVelocityByDensity(double v, double d) {
        double calculatedVelocity;

        if (d <= 0.75)
            calculatedVelocity = 1.4;
        else if (0.75 < d && d<= 4.2)
            calculatedVelocity =  0.0412 * Math.pow(d, 2) - 0.59 * d + 1.867;
        else
            calculatedVelocity =  0.1;

        return Math.min(v, calculatedVelocity);
    }

    private static double randDouble(double min, double max) {

        Random rand = new Random();

        return min + ((max - min) * rand.nextDouble());
    }
}
