package edu.phuxuan.k17.spring.democontroller.repository;

import edu.phuxuan.k17.spring.democontroller.model.*;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();

    Product findById(int id);

    void save(Product product);
}
