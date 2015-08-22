package Main;

import Model.Graph;
import Task.runOnDistanceBased;
import Task.runOnTimeBased;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Wood on 2015/8/17.
 */
public class GuidingSim {
    public static final String START = "start";
    public static final String END = "end";
    public static final int DISTANSE_BASED = 1;
    public static final int TIME_BASED = 2;
    public static int[] numberOfPeople = {50, 200, 400, 600, 800, 1000, 1200, 1400, 1600};
    public static int[] rounds = {100, 500, 1000, 1500, 2000, 5000};
    public static String OUTPUT_DIRECTORY = "outputs";
    public static String DIS_OUTPUT_URL = "." + File.separator + OUTPUT_DIRECTORY + File.separator+ "Distance based result.xls";
    public static String TIME_OUTPUT_URL = "." + File.separator + OUTPUT_DIRECTORY + File.separator+ "Time based result.xls";
    public static ArrayList<ArrayList<HashMap<String, Integer>>> randomTravelList;
    public static ArrayList<ArrayList<Integer>> randomDeployPeopleList;

    public static void main(String[] args) {
        GuidingSim guidingSim = new GuidingSim();
        randomTravelList = new ArrayList<>(guidingSim.initialRandomTravel(rounds, Graph.VERTRX_SIZE));
        randomDeployPeopleList = new ArrayList<>(guidingSim.initialRandomDeployedPeople(numberOfPeople, Graph.EDGE_SIZE));
        File dirOutput = new File(OUTPUT_DIRECTORY);
        if (!dirOutput.exists()) {
            boolean isSuccess = dirOutput.mkdir();
            if (isSuccess)
                System.out.println("Create directory successfully");
        }

        guidingSim.execute();

    }

    private void execute() {
        System.out.println("Begin execute the tasks");

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(new runOnDistanceBased());
        executor.execute(new runOnTimeBased());

        executor.shutdown();

        while (true) {
            if (executor.isTerminated()) {
                System.out.println("Finished all threads");
                break;
            }
        }

    }

    /**
     *
     * @return the velocity of a person randomly in a range between 0.89 m/s and 1.5 m/s
     *
     */
    public static double getPersonVelocity() {

        //平均老年人步行的速度是3.2 km/h ~ 3.9 km/h，年輕人則為3.75 km/h ~ 5.43 km/h
//        return randDouble(0.888888889, 1.50833333);
        return 1.4;
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

    private ArrayList<ArrayList<HashMap<String, Integer>>> initialRandomTravel(int round[], int bound) {
        ArrayList<ArrayList<HashMap<String, Integer>>> randomPositionList = new ArrayList<>();
        ArrayList<HashMap<String, Integer>> randomPosition;
        Random random = new Random();

        for (int aRound : round) {
            randomPosition = new ArrayList<>();
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

    private ArrayList<ArrayList<Integer>> initialRandomDeployedPeople(int numOfPeople[], int bound) {
        ArrayList<ArrayList<Integer>> randomPeopleList = new ArrayList<>();
        ArrayList<Integer> randomPosition;
        Random random = new Random();

        for (int aPeople : numOfPeople) {
            randomPosition = new ArrayList<>();
            for (int j = 0; j < aPeople; j++) {
                int position = random.nextInt(bound);


                randomPosition.add(position);
            }
            randomPeopleList.add(randomPosition);
        }

        return randomPeopleList;
    }
}
