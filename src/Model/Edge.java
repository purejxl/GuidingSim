package Model;

import Main.GuidingSim;
import org.jgrapht.graph.DefaultWeightedEdge;

/**
 * Created by Wood on 2015/8/21.
 */
public class Edge extends DefaultWeightedEdge {
    public int nPeople;
    private double distance;
    private double area;
    private int weightType = 0;

    public Edge(double roadLength, double roadWidth) {
        super();
        nPeople = 0;
        distance = roadLength;
        area = roadLength * roadWidth;
    }

    public void setWeightType(int weightType) {
        this.weightType = weightType;
    }

    @Override
    protected double getWeight() {
        switch (weightType) {
            case GuidingSim.DISTANSE_BASED:
                return getDistance();
            case GuidingSim.TIME_BASED:
                return getDuration();
            default:
                return 1D;

        }

    }

    public double getDuration() {
        double density = nPeople / area;
        double speed = GuidingSim.getPersonSpeed(density);
        return distance / speed;
    }

    public double getDistance() {
        return distance;
    }

}
