package com.example.ecommerce.controller;

import com.example.ecommerce.model.Produto;
import com.example.ecommerce.service.impl.ProdutoServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoServiceImple service;

    @GetMapping("/produtos")
    public ArrayList<Produto> bucarTodos (){
        return service.buscarTodos();
    }

    @GetMapping("/produtos/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Integer id){
       Produto res = service.buscarPorId(id);
       if (res != null) {
           return ResponseEntity.ok(res);
       }
           return ResponseEntity.notFound().build();
    }

    @GetMapping("produtos/busca")
    public ArrayList<Produto> recuperarPorPalavraChave(@RequestParam(name = "palavra") String palavra){
        return service.buscarPorPalavraChave(palavra);
    }

    @PostMapping("/produtos")
    public ResponseEntity<Produto> casdastrarProduto (@RequestBody Produto novo){
        Produto res = service.cadastrarProduto(novo);
        if (res != null){
            return ResponseEntity.ok(novo);
        }
            return ResponseEntity.badRequest().build();
    }
}
