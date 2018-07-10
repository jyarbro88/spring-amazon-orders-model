package com.spring.amazondatamodel.datalayer.repositories;

import com.spring.amazondatamodel.datalayer.daos.ProductDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public interface ProductRepository extends JpaRepository<ProductDAO, Long> {

//    public Iterable<ProductDAO> getAllBy(final String productId);

//    List<ProductDAO> findByName()

    Optional<ProductDAO> findById(Long productId);

}
