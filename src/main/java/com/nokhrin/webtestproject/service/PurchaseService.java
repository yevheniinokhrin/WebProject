package com.nokhrin.webtestproject.service;


import com.nokhrin.webtestproject.model.Purchase;

import java.util.List;

public interface PurchaseService {

    void addPurchase(Purchase purchase);

    List<Purchase> listPurchases();

    void removePurchase(long id);

    Purchase getPurchase (long id);
}
