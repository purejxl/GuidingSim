package Model;

/**
 * Created by Wood on 2015/8/17.
 */
public class Vertex {
    public String id;
    public String label;

    public Vertex(String id, String label){
        this.id = id;
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public String toString() {
//        return "Id: " + id + ",\tLabel: " + label;
        return "Id: " + id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Vertex otherNode = (Vertex) obj;
        if (id == null) {
            return false;
        } else if (!id.equals(otherNode.id))
            return false;

        return true;
    }
}
