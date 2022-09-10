package com.example.ecommerce.service.impl;

import com.example.ecommerce.DAO.DepartamentoDAO;
import com.example.ecommerce.model.Departamento;
import com.example.ecommerce.service.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DepartamentoServiceImple implements IDepartamentoService {

    @Autowired
    private DepartamentoDAO dao;

    @Override
    public Departamento criarNovo(Departamento novo) {
        if (novo.getNome() != null){
            return dao.save(novo);
        }

        return null;
    }

    @Override
    public Departamento atualizarDados(Departamento dados) {
        if(dados.getNome() != null && dados.getNumero()!= null){
            return  dao.save(dados);
        }

        return null;
    }

    @Override
    public ArrayList<Departamento> buscarTodos() {
        return (ArrayList<Departamento>) dao.findAll();
    }

    @Override
    public Departamento buscarPeloId(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void excluirDepartamento(Integer id) {
        dao.deleteById(id);
    }
}
