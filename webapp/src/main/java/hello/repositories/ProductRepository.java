package hello.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import hello.model.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer>{

}
