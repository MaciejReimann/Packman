package hello.services;

import hello.domain.ClientDto;

import java.util.List;

public interface ClientService {

    List<ClientDto> getClients();
}
