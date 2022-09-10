package com.example.ecommerce.DAO;

import com.example.ecommerce.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDAO extends JpaRepository <Cliente, Integer> {
}


