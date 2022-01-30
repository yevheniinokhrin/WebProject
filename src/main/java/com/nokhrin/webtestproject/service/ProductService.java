package com.nokhrin.webtestproject.service;


import com.nokhrin.webtestproject.model.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);

    void editProduct(Product product);

    List<Product> listProducts();

    void removeProduct(long id);

    Product getProduct(long id);

}
