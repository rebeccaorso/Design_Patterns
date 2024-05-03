package visitorPattern;

import java.util.ArrayList;
import java.util.List;

//Simula un sistema che gestisce una lista di clienti e applica una certa operazione a ciascuno attraverso il pattern Visitor.

public class Client {
    public static void main(String[] args){
        List<Visitable> clients = new ArrayList<>();
        clients.add(new ResidentialClient("John Doe"));
        clients.add(new BusinessClient("Acme Corp."));

        Visitor visitor = new InsuranceMessagingVisitor();
        for (Visitable client : clients) {
            client.accept(visitor);
        }
    }
}
