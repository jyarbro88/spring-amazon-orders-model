package com.spring.amazondatamodel.repositories;

import com.spring.amazondatamodel.datalayer.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {

//    public Iterable<Product> getAllBy(final String productId);

//    List<Product> findByName()

//    Optional<Product> findById(Long productId);

}
