package edu.phuxuan.k17.spring.democontroller.services;


import java.util.List;

import edu.phuxuan.k17.spring.democontroller.model.Product;

public interface ProductService {
    List<Product> findAll();

    Product findById(int id);

    void save(Product product);
}
