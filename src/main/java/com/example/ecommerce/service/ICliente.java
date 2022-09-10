package com.example.ecommerce.service;

import com.example.ecommerce.model.Cliente;

import java.util.ArrayList;

public interface ICliente {
    public Cliente cadastrarNovo (Cliente novo);
    public ArrayList<Cliente> buscarTodos ();
    public Cliente buscarPorId (Integer id);
    public Cliente atualizarDados (Cliente dados);
    public void excluir (Integer id);

}
