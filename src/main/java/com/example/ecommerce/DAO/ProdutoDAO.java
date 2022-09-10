package com.example.ecommerce.DAO;

import com.example.ecommerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ProdutoDAO extends JpaRepository<Produto, Integer> {

    public ArrayList<Produto> findByOrderByPreco();
    public ArrayList<Produto> findByOrderByPrecoDesc();
    public ArrayList<Produto>findByNomeContaining (String palavraChave);
}
