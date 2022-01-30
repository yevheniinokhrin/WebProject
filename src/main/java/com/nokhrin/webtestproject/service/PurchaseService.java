package com.nokhrin.webtestproject.service;


import com.nokhrin.webtestproject.model.AppUser;
import com.nokhrin.webtestproject.model.Product;
import com.nokhrin.webtestproject.model.Purchase;

import java.util.List;

public interface PurchaseService {

    void addPurchase(AppUser appUser, List<Product> products);

    List<Purchase> listPurchases();

    void removePurchase(long id);

    Purchase getPurchase (long id);
}
