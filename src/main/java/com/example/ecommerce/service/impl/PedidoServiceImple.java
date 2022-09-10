package com.example.ecommerce.service.impl;

import com.example.ecommerce.DAO.PedidoDAO;
import com.example.ecommerce.dto.FaturamentoMensal;
import com.example.ecommerce.model.ItemPedido;
import com.example.ecommerce.model.Pedido;
import com.example.ecommerce.service.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PedidoServiceImple implements IPedidoService {
    @Autowired
    private PedidoDAO dao;
    @Override
    public Pedido save(Pedido novo) {
      for (ItemPedido item : novo.getItens()){
          item.setPedido(novo);
      }
      return dao.save(novo);
    }

    @Override
    public Pedido findById(Integer id) {

        return dao.findById(id).orElse(null);
    }

    @Override
    public ArrayList<FaturamentoMensal> recuperarFaturamentoPorAno(Integer ano) {
        return dao.recuperarFaturamentoPorAno(ano);
    }
}
