package hello.services;

import hello.domain.ClientDto;
import hello.domain.ParcelDto;
import hello.model.Client;
import hello.model.Parcel;
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

    @Override
    public List<ParcelDto> getParcelsForClient(String token) {
        List<ParcelDto> parcels = new ArrayList<>();
        Client client = clientRepository.findOneByBfr(token);
        if (client != null) {
            for (Parcel p : client.getParcels()) {
                parcels.add(new ParcelDto(p));
            }
        }
        return parcels;
    }
}
