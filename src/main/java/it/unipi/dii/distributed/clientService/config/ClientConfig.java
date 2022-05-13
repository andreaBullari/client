package it.unipi.dii.distributed.clientService.config;

import it.unipi.dii.distributed.clientService.client.Client;
import it.unipi.dii.distributed.clientService.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Date;
import java.time.Instant;
import java.util.List;

@Configuration
@Slf4j
public class ClientConfig {

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository clientRepository){
        return args ->{
            Client andrea = new Client("Andrea", "Bullari", "andreabullari@live.it", Date.from(Instant.now()));
            Client giuse = new Client( "Giuse", "Cancello", "giuseppeCancello@live.it", Date.from(Instant.now()));
            clientRepository.saveAll(List.of(andrea, giuse));
            log.info("Client: " + andrea.getEmail() + ", Client: " + giuse.getEmail() + " created successfully");
        };
    }
}
