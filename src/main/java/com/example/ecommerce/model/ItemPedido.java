package com.example.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "item_pedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq")
    private Integer id;

    @Column(name = "quantidade")
    private Integer quant;

    @Column(name = "preco_unit")
    private Double precoUnit;

    @Column(name = "preco_final")
    private Double precoFinal;

    @ManyToOne
    @JoinColumn(name = "codigo_produto")
    @JsonIgnoreProperties("itens")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "numero_pedido")
    private Pedido pedido;

    public ItemPedido() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuant() {
        return quant;
    }

    public void setQuant(Integer quant) {
        this.quant = quant;
    }

    public Double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(Double precoUnit) {
        this.precoUnit = precoUnit;
    }

    public Double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(Double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
