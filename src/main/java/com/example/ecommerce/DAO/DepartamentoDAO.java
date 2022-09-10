package com.example.ecommerce.DAO;

import com.example.ecommerce.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartamentoDAO  extends JpaRepository<Departamento, Integer> {
}
