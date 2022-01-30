package com.nokhrin.webtestproject.repository;

import com.nokhrin.webtestproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findById (long id);
    Product findByProductName(String name);
}
