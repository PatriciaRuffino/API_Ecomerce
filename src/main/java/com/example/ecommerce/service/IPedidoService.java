package com.example.ecommerce.service;

import com.example.ecommerce.DAO.PedidoDAO;
import com.example.ecommerce.dto.FaturamentoMensal;
import com.example.ecommerce.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public interface IPedidoService {
   public Pedido save (Pedido novo);
   public Pedido findById (Integer id);
   public ArrayList<FaturamentoMensal> recuperarFaturamentoPorAno (Integer ano);
}
