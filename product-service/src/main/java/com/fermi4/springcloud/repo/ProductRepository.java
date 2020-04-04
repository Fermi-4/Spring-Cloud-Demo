package com.fermi4.springcloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fermi4.springcloud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
