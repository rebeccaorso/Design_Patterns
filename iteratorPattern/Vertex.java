package iteratorPattern;

import java.util.ArrayList;
import java.util.List;


//Descrizione: Rappresenta un nodo o un vertice in un grafo.
//neighbors: Una lista di vertici adiacenti,
// che rappresenta le connessioni del vertice con altri vertici nel grafo.
//data: Può contenere dati specifici associati al vertice,
// come un identificatore o altri attributi rilevanti.
public class Vertex {
    private List<Vertex> neighbors = new ArrayList<>();
    private int data;

    public Vertex(int data) {
        this.data = data;
    }

    public void addNeighbor(Vertex neighbor) {
        neighbors.add(neighbor);
    }

    public List<Vertex> getNeighbors() {
        return neighbors;
    }

    public int getData() {
        return data;
    }

}
