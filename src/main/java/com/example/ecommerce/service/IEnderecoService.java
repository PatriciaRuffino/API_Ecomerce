package com.example.ecommerce.service;

import com.example.ecommerce.model.Endereco;

public interface IEnderecoService {
    public Endereco cadastrarNovo(Endereco novo);
    public Endereco atualizar (Endereco dado);
    public void excluir (Integer id);
    public Endereco buscarPorId (Integer id);

}
