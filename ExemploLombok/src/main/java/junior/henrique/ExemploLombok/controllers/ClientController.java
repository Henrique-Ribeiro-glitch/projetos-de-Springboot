package junior.henrique.ExemploLombok.controllers;

import junior.henrique.ExemploLombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Henrique Júnior
 * @version 1.0
 * @since 14/06/2020 09:30
 * @category Controller
 */
@RestController
public class ClientController {

    @GetMapping("/clients")
    public ArrayList<Client> getClients() {

        ArrayList<Client> clients = new ArrayList<>();

        Client client = new Client();
        client.setName("Henrique");
        client.setLastName("Júnior");
        client.setAge(23);

        Client client2 = new Client();
        client2.setName("José");
        client2.setLastName("Silva");
        client2.setAge(20);

        clients.add(client);
        clients.add(client2);

        return clients;
    }

}
