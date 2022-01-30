package com.nokhrin.webtestproject.service;

import com.nokhrin.webtestproject.model.Product;
import com.nokhrin.webtestproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void editProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> listProducts() {
        return productRepository.findAll();
    }

    @Override
    public void removeProduct(long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product getProductByName(String name) {
        return productRepository.findByProductName(name);
    }

    @Override
    public Product getProduct(long id) {
        return productRepository.findById(id);
    }
}
