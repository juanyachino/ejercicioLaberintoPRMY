import java.util.LinkedList;

public class main {

    public static void main(String[] args){

        // creo 16 nodos
        Node start = new Node(1);
        Node nodo2 = new Node(2);
        Node nodo3 = new Node(3);
        Node nodo4 = new Node(4);
        Node nodo5 = new Node(5);
        Node nodo6 = new Node(6);
        Node nodo7 = new Node(7);
        Node nodo8 = new Node(8);
        Node nodo9 = new Node(9);
        Node nodo10 = new Node(10);
        Node nodo11 = new Node(11);
        Node nodo12 = new Node(12);
        Node nodo13 = new Node(13);
        Node nodo14 = new Node(14);
        Node nodo15 = new Node(15);
        Node finish = new Node(16);
        // agrego las adyacencias
        start.addAdj(nodo2);
        nodo2.addAdj(start);
        nodo2.addAdj(nodo3);
        nodo3.addAdj(nodo2);
        nodo3.addAdj(nodo4);
        nodo3.addAdj(nodo8);
        nodo8.addAdj(nodo10);
        nodo8.addAdj(nodo3);
        nodo8.addAdj(nodo9);
        nodo9.addAdj(nodo8);
        nodo10.addAdj(nodo8);
        nodo10.addAdj(nodo11);
        nodo11.addAdj(nodo10);
        nodo12.addAdj(nodo12);
        nodo4.addAdj(nodo3);
        nodo4.addAdj(nodo5);
        nodo5.addAdj(nodo4);
        nodo5.addAdj(nodo6);
        nodo5.addAdj(nodo13);
        nodo6.addAdj(nodo5);
        nodo6.addAdj(nodo7);
        nodo7.addAdj(nodo6);
        nodo13.addAdj(nodo5);
        nodo13.addAdj(nodo14);
        nodo14.addAdj(nodo13);
        nodo14.addAdj(nodo15);
        nodo15.addAdj(nodo14);
        nodo15.addAdj(finish);
        finish.addAdj(nodo15);
        LinkedList<Node> camino = new LinkedList<>();
        MazeSolver mazeSolver = new MazeSolver();
        mazeSolver.dfs(start,camino);
        System.out.println(" La salida del laberinto es :");
        for(Node casilla : camino){
            System.out.print(" -> ");
            System.out.print(casilla.getNumber());
        }
    }
}
