package hello.repositories;

import hello.model.Client;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends PagingAndSortingRepository<Client, Integer> {

    Client findOneByBfr(String bfr);
}
