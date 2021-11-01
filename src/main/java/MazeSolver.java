import java.util.LinkedList;

public class MazeSolver {
    public boolean dfs (Node actual, LinkedList<Node> camino){
        actual.markVisited();
        if (actual.getNumber() == 16){
            camino.addFirst(actual);
            return true;
        }
        for (Node adj : actual.getAdjacents()) {
            if (!adj.isVisited()){
                if (dfs(adj,camino)) {
                    camino.addFirst(actual);
                    return true;
                }
            }
        }
        return false;
    }
}
