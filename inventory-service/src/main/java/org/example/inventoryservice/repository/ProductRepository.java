package org.example.inventoryservice.repository;

import jdk.jfr.Registered;
import org.example.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//@Registered
public interface ProductRepository extends JpaRepository<Product, String> {
}
