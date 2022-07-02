package com.example.udemynew;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ClientService {
    private static List<Client> clients = new ArrayList<Client>();
    private static int clientCount = 3;

    static {
        clients.add(new Client(1, "Name1", "F", 18, 90, false));
        clients.add(new Client(3, "Name2", "F", 18, 90, false));
        clients.add(new Client(3, "Name3", "F", 18, 90, false));
    }

    //modified
    public List<Client> retrieveClients() {
        List<Client> filteredClients = new ArrayList<Client>();
        for (Client client : clients) {
            filteredClients.add(client);

        }
        return filteredClients;
    }

    public Client retrieveClient(int id) {
        List<Client> filteredClients = new ArrayList<Client>();
        for (Client client : clients) {
            if (client.getId()==id) {
                return client;
            }
        }
        return null;
    }

    public void updateClient(Client client){
        clients.remove(client);
        clients.add(client);

    }

    public void addClient(String name, String gender, int age, int creditScore, boolean loansDefaulted) {
        clients.add(new Client(++clientCount, name, gender, age, creditScore, loansDefaulted));
    }

    public void deleteClient(int id){
        Iterator<Client> iterator = clients.iterator();
        while (iterator.hasNext()){
            Client client = iterator.next();
            if (client.getId() == id){
                iterator.remove();
            }
        }
    }
}

