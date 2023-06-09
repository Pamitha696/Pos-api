package com.online.pos.posapi.repo;

import com.online.pos.posapi.entity.CustomerInvoiceHeader;
import com.online.pos.posapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface ProductRepo extends JpaRepository<Product,String> {
}
