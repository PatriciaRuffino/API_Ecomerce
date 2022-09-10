package com.example.ecommerce.controller;

import com.example.ecommerce.dto.FaturamentoMensal;
import com.example.ecommerce.model.Pedido;
import com.example.ecommerce.service.impl.PedidoServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PedidoController {

    @Autowired
    private PedidoServiceImple service;
    @GetMapping("/pedidos/{id}")
    public ResponseEntity<Pedido> findById(@PathVariable Integer id){

        Pedido res = service.findById(id);
        if (res != null){
            return ResponseEntity.ok(res);
        }
     return ResponseEntity.badRequest().build();
    }
    @GetMapping("/faturamento/{ano}")
    public ArrayList<FaturamentoMensal> recuperarFaturamentoPorAno (@PathVariable Integer ano){
        return service.recuperarFaturamentoPorAno(ano);
    }

    @PostMapping("/pedidos")
    public ResponseEntity<Pedido> save(@RequestBody Pedido novo){
        Pedido res = service.save(novo);
        if (res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

}
