package com.example.ecommerce.controller;

import com.example.ecommerce.model.Cliente;
import com.example.ecommerce.service.impl.ClienteServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ClienteController {

    @Autowired
    private ClienteServiceImple service;

    @GetMapping("/clientes")
    public ArrayList<Cliente> buscarTodos (){
       return service.buscarTodos();
    }
    @GetMapping("/clientes/{id}")
    public ResponseEntity<Cliente> buscarPorId (@PathVariable Integer id){
        Cliente res = service.buscarPorId(id);
        if (res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();

    }

    @PutMapping("/clientes")
    public ResponseEntity<Cliente> atualizarDados (@RequestBody Cliente dados){
        Cliente resp = service.atualizarDados(dados);
        if(resp != null){
            return ResponseEntity.ok(resp);
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/clientes")
    public ResponseEntity<Cliente> cadastrarNovo(@RequestBody Cliente novo){
        Cliente res = service.cadastrarNovo(novo);
        if(res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }
    @DeleteMapping("/clientes/{id}")
    public ResponseEntity<Cliente> excluir(@PathVariable Integer id){
        service.excluir(id);
        return ResponseEntity.ok().build();
    }

}
