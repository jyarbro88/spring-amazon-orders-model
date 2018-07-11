package com.spring.amazondatamodel.repositories;

import com.spring.amazondatamodel.datalayer.ProductDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface ProductRepository extends JpaRepository<ProductDAO, Long> {

//    public Iterable<ProductDAO> getAllBy(final String productId);

//    List<ProductDAO> findByName()

    Optional<ProductDAO> findById(Long productId);

}
