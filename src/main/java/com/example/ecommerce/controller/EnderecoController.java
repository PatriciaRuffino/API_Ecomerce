package com.example.ecommerce.controller;

import com.example.ecommerce.model.Endereco;
import com.example.ecommerce.service.impl.EnderecoServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EnderecoController {
    @Autowired
    private EnderecoServiceImple service;

    @PostMapping("/enderecos")
    public ResponseEntity<Endereco> cadastrarNovo(@RequestBody Endereco novo) {
        Endereco res = service.cadastrarNovo(novo);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

     @GetMapping("/enderecos/{id}")
     public ResponseEntity<Endereco> buscarPorId(@PathVariable Integer id){
        Endereco res = service.buscarPorId(id);
        if (res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
     }

    @PutMapping("/enderecos")
    public ResponseEntity<Endereco> atualizar (@RequestBody Endereco dados){
        Endereco res = service.atualizar(dados);
        if (res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }
}


