package hello.services;

import hello.domain.ClientDto;
import hello.domain.ParcelDto;

import java.util.List;

public interface ClientService {

    List<ClientDto> getClients();
    List<ParcelDto> getParcelsForClient(String token);
}
