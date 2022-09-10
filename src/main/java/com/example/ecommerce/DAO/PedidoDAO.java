package com.example.ecommerce.DAO;

import com.example.ecommerce.dto.FaturamentoMensal;
import com.example.ecommerce.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface PedidoDAO extends JpaRepository<Pedido, Integer> {

    @Query("SELECT new"
            +" com.example.ecommerce.dto.FaturamentoMensal(month(p.data), sum(p.valorLiquido))"
            + "FROM Pedido p"
            + " WHERE year(p.data) = :ano "
            +" GROUP BY month(p.data)"
            +" ORDER BY month(p.data)")

    public ArrayList<FaturamentoMensal> recuperarFaturamentoPorAno (@Param("ano") Integer ano);

}
