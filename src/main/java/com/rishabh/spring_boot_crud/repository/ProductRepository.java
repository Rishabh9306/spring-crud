package com.rishabh.spring_boot_crud.repository;


import com.rishabh.spring_boot_crud.entry.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByname(String name);
}

