package com.example.ecommerce.controller;

import com.example.ecommerce.model.Departamento;
import com.example.ecommerce.service.impl.DepartamentoServiceImple;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class DepartamentoController {

    @Autowired
    private DepartamentoServiceImple service;

    @GetMapping("/departamentos")
    @ApiOperation(value = "Listar departamentos")
    public ArrayList<Departamento> recuperarTodos(){
        return service.buscarTodos();
    }

    @PostMapping("/departamentos")
    public ResponseEntity<Departamento> incluirNovo(@RequestBody Departamento novo){
        Departamento res = service.criarNovo(novo);
       if ( res != null){
           return ResponseEntity.ok(res);
       }
       return  ResponseEntity.badRequest().build();
    }

    @PutMapping("/departamentos")
    public ResponseEntity<Departamento> atualizarDados(@RequestBody Departamento dados){
        Departamento res = service.atualizarDados(dados);
        if (res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }
    @DeleteMapping("/departamentos/{id}")
    public ResponseEntity<Departamento> excluirDepartamento(@PathVariable Integer id){
      service.excluirDepartamento(id);
      return ResponseEntity.ok(null);

    }
    @GetMapping("/departamentos/{id}")
    public  ResponseEntity<Departamento> buscarPeloId(@PathVariable Integer id){
        Departamento res= service.buscarPeloId(id);
        if (res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }
}
