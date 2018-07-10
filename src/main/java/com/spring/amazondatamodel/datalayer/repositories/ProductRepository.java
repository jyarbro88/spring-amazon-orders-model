package com.spring.amazondatamodel.datalayer.repositories;

import com.spring.amazondatamodel.datalayer.daos.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {

//    public Iterable<Product> getAllBy(final String productId);

//    List<Product> findByName()

    Optional<Product> findById(Long productId);

}
