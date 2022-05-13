package it.unipi.dii.distributed.clientService.controller;

import it.unipi.dii.distributed.clientService.client.Client;
import it.unipi.dii.distributed.clientService.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/clientService")
@Slf4j

public class ClientController {
    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping(path = "/postClient")
    public void createClient(@RequestBody Client c){
        log.info("Created a post request for a client: " + c.getEmail());
        clientService.createClient(c);
    }

    @GetMapping(path = "/getClients")
    public List<Client> getClients(){
        log.info("Created a get request");
        return clientService.getClients();
    }

    @GetMapping(path = "/getClientByEmail/{email}")
    public Client getClientByEmail(@PathVariable("email") String email){
        return clientService.getClientByEmail(email);
    }

}
