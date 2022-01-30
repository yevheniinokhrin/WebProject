package com.nokhrin.webtestproject.service;

import com.nokhrin.webtestproject.model.AppUser;
import com.nokhrin.webtestproject.model.Product;
import com.nokhrin.webtestproject.model.Purchase;
import com.nokhrin.webtestproject.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;


@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    PurchaseRepository purchaseRepository;
    @Override
    public void addPurchase(AppUser appUser, List<Product> products) {
        Purchase purchase = new Purchase();
        int totalPrice = products.stream().mapToInt(Product::getPrice).sum();
        purchase.setTotalPrice(totalPrice);
        purchase.setUser(appUser);
        purchase.setProducts(new HashSet<>(products));
        purchase.setDate(LocalDateTime.now());

        purchaseRepository.save(purchase);
    }

    @Override
    public List<Purchase> listPurchases() {
        return purchaseRepository.findAll();
    }

    @Override
    public void removePurchase(long id) {
        purchaseRepository.deleteById(id);
    }

    @Override
    public Purchase getPurchase(long id) {
        return purchaseRepository.findById(id);
    }
}
