package it.unipi.dii.distributed.clientService.service;

import it.unipi.dii.distributed.clientService.client.Client;
import it.unipi.dii.distributed.clientService.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void createClient(Client c) {
        //check if client already exists
        clientRepository.save(c);
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Client getClientByEmail(String email) {
        Optional<Client> client = clientRepository.findClientByEmail(email);
        if(client==null && !client.isPresent()) {
            throw new IllegalStateException("Client is not present");
        }
        return clientRepository.getById(email);
    }
}
