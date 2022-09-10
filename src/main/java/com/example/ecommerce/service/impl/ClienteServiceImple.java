package com.example.ecommerce.service.impl;

import com.example.ecommerce.DAO.ClienteDAO;
import com.example.ecommerce.model.Cliente;
import com.example.ecommerce.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClienteServiceImple implements ICliente {
    @Autowired
    private ClienteDAO dao;


    @Override
    public Cliente cadastrarNovo(Cliente novo) {
        if (novo.getNome() != null){
            return dao.save(novo);
        }
        return null;
    }

    @Override
    public ArrayList<Cliente> buscarTodos() {

        return (ArrayList<Cliente>) dao.findAll();
    }

    @Override
    public Cliente buscarPorId(Integer id) {

        return dao.findById(id).orElse(null);
    }

    @Override
    public Cliente atualizarDados(Cliente dados) {
        if (dados.getNome() != null && dados.getId() != null){
            return dao.save(dados);
        }

        return null;
    }

    @Override
    public void excluir(Integer id) {
        dao.deleteById(id);

    }
}
