package hello.services;

import hello.domain.ClientDto;
import hello.model.Client;
import hello.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    @Transactional(readOnly = true)
    public List<ClientDto> getClients() {
        List<ClientDto> clients = new ArrayList<>();
        for (Client c : clientRepository.findAll()) {
            clients.add(new ClientDto(c));
        }
        return clients;
    }
}
