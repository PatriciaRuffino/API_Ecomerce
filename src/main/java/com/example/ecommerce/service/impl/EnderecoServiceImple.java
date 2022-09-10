package com.example.ecommerce.service.impl;

import com.example.ecommerce.DAO.EnderecoDAO;
import com.example.ecommerce.model.Endereco;
import com.example.ecommerce.service.IEnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImple implements IEnderecoService {

    @Autowired
    private EnderecoDAO dao;

    @Override
    public Endereco cadastrarNovo(Endereco novo) {
        if (novo.getNome()!= null ){
            return dao.save(novo);
        }
        return null;
    }

    @Override
    public Endereco atualizar(Endereco dado) {
        if (dado.getNome() != null && dado.getId() != null){
            return dao.save(dado);
        }
        return null;
    }

    @Override
    public void excluir(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public Endereco buscarPorId(Integer id) {

        return dao.findById(id).orElse(null);
    }
}
