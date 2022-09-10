package com.example.ecommerce.DAO;

import com.example.ecommerce.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoDAO extends JpaRepository <Endereco, Integer> {
}
