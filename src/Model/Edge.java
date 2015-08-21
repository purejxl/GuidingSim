package Model;

import org.jgrapht.graph.DefaultWeightedEdge;

/**
 * Created by Wood on 2015/8/21.
 */
public class Edge extends DefaultWeightedEdge {
    public int nPeople;
    public double length;
    public double width;
    public double area;

    public Edge(double roadLength, double roadWidth) {
        nPeople = 0;
        length = roadLength;
        width = roadWidth;
        area = roadLength * roadWidth;
    }

}
