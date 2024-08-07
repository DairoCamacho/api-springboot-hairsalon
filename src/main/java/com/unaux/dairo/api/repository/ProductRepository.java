package com.unaux.dairo.api.repository;

import com.unaux.dairo.api.domain.product.Product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

  Page<Product> findByStatusTrue(Pageable pagination);
}
