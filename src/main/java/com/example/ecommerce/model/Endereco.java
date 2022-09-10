package com.example.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "endereco")
public class Endereco {
    @Column (name = "sum_seq")
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "tipo", length = 10)
    private String tipo;
    @Column (name = "nome", length = 255)
    private String nome;
    @Column (name = "numero")
    private Integer numero;
    @Column (name = "complemento", length = 50)
    private String comple;
    @Column (name = "bairro", length = 50)
    private String bairro;
    @Column (name = "cidade", length = 50)
    private String cidade;
    @Column(name = "cep", length = 20)
    private String cep;
    @Column(name = "estado", length = 50)
    private String estado;

    @ManyToOne
    @JoinColumn (name = "id_cliente")
    @JsonIgnoreProperties("listaEndereco")
    private Cliente cliente;

    public Endereco() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComple() {
        return comple;
    }

    public void setComple(String comple) {
        this.comple = comple;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
