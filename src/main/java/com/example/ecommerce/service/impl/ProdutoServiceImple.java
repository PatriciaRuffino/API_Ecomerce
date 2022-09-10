package com.example.ecommerce.service.impl;

import com.example.ecommerce.DAO.ProdutoDAO;
import com.example.ecommerce.model.Produto;
import com.example.ecommerce.service.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProdutoServiceImple implements IProdutoService {

    @Autowired
    private ProdutoDAO dao;

    @Override
    public ArrayList<Produto> buscarTodos() {

        return (ArrayList<Produto>) dao.findAll();
        //return (ArrayList<Produto>) dao.findByOrderByPreco();
        //return (ArrayList<Produto>) dao.findByOrderByPrecoDesc();
        //return (ArrayList<Produto>) dao.findByNomeContaining("computador");
    }

    @Override
    public Produto buscarPorId(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public Produto cadastrarProduto(Produto novo) {
        return dao.save(novo);
    }

    @Override
    public ArrayList<Produto> buscarPorPalavraChave(String palavra) {
        return dao.findByNomeContaining(palavra);
    }
}
