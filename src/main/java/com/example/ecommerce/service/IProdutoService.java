package com.example.ecommerce.service;

import com.example.ecommerce.model.Produto;

import java.util.ArrayList;

public interface IProdutoService {

    public ArrayList<Produto> buscarTodos();
    public Produto buscarPorId (Integer id);
    public Produto cadastrarProduto (Produto novo);

    public ArrayList<Produto> buscarPorPalavraChave (String palavra);
}
