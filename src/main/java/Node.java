import java.util.ArrayList;
import java.util.Objects;

public class Node {

    private int number;
    private boolean visited;
    private ArrayList<Node> adjacent;

    public Node(int numero) {
        this.number = numero;
        this.visited = false;
        this.adjacent = new ArrayList<>();
    }

    public ArrayList<Node> getAdjacents() {
        return adjacent;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int numero) {
        this.number = numero;
    }

    public boolean isVisited() {
        return visited;
    }

    public void markVisited() {
        this.visited = true;
    }
    public void addAdj(Node adj){
        this.adjacent.add(adj);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return number == node.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
