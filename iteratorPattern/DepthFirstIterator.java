package iteratorPattern;

import java.util.NoSuchElementException;
import java.util.Stack;

//Questa classe implementa l'interfaccia Iterator per eseguire un traversal in profondità (Depth-First Search, DFS) di un grafo.
public class DepthFirstIterator implements Iterator<Vertex> {

    //Utilizza uno Stack per tenere traccia dei vertici da visitare, che è tipico dell'algoritmo DFS
    //Naviga attraverso i vertici del grafo seguendo un approccio LIFO (Last In, First Out), che è caratteristico dello stack.
    private Stack<Vertex> stack = new Stack<>();

    public DepthFirstIterator(Vertex startVertex) {
        stack.push(startVertex);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Vertex next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Vertex current = stack.pop();
        for (Vertex neighbor : current.getNeighbors()) {
            stack.push(neighbor);
        }
        return current;
    }
}
