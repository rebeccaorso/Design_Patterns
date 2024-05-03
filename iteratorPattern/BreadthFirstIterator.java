package iteratorPattern;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class BreadthFirstIterator implements Iterator<Vertex> {

  //Utilizza una Queue per gestire i vertici da visitare, seguendo un approccio FIFO (First In, First Out).
  //Esplora tutti i vicini di un vertice prima di passare ai vicini del livello successivo.
    private Queue<Vertex> queue = new LinkedList<>();

    public BreadthFirstIterator(Vertex startVertex) {
        queue.add(startVertex);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Vertex next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Vertex current = queue.remove();
        for (Vertex neighbor : current.getNeighbors()) {
            queue.add(neighbor);
        }
        return current;
    }
}
