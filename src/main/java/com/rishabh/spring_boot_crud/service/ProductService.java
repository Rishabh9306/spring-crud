package com.rishabh.spring_boot_crud.service;

import com.rishabh.spring_boot_crud.entry.Product;
import com.rishabh.spring_boot_crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }
    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }
    public List<Product> getProduct() {
        return repository.findAll();
    }
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }
    public Product getProductByName(String name) {
        return repository.findByname(name);
    }
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed"+ id;
    }
    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        assert existingProduct != null;
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        return repository.save(existingProduct);
    }
}