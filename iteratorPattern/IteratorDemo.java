package iteratorPattern;


//Una classe demo che mostra come utilizzare gli iteratori DepthFirstIterator e BreadthFirstIterator per attraversare un grafo.
public class IteratorDemo {
    public static void main(String[] args) {
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);

        v1.addNeighbor(v2);
        v1.addNeighbor(v3);
        v2.addNeighbor(v4);

        Iterator<Vertex> dfs = new DepthFirstIterator(v1);
        System.out.println("Depth First Search:");
        while (dfs.hasNext()) {
            Vertex vertex = dfs.next();
            System.out.print(vertex.getData() + " ");
        }

        System.out.println("\nBreadth First Search:");
        Iterator<Vertex> bfs = new BreadthFirstIterator(v1);
        while (bfs.hasNext()) {
            Vertex vertex = bfs.next();
            System.out.print(vertex.getData() + " ");
        }
    }
}
