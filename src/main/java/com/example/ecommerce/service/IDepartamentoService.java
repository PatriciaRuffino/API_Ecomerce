package com.example.ecommerce.service;

import com.example.ecommerce.model.Departamento;

import java.util.ArrayList;
import java.util.HashMap;

public interface IDepartamentoService {
    public Departamento criarNovo(Departamento novo);
    public Departamento atualizarDados(Departamento dados);
    public ArrayList<Departamento> buscarTodos ();
    public Departamento buscarPeloId(Integer id);
    public void excluirDepartamento(Integer id);

}
