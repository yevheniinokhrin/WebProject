package com.nokhrin.webtestproject.repository;

import com.nokhrin.webtestproject.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository  extends JpaRepository<Purchase,Long> {
    Purchase findById(long id);

}
