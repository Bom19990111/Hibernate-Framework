package edu.phuxuan.k17.spring.democontroller.services;

import edu.phuxuan.k17.spring.democontroller.model.Product;
import edu.phuxuan.k17.spring.democontroller.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Autowired
    public ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return this.productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        this.productRepository.save(product);
    }
}
