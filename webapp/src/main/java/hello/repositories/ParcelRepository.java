package hello.repositories;

import hello.model.Parcel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelRepository  extends PagingAndSortingRepository<Parcel, Integer> {
}
