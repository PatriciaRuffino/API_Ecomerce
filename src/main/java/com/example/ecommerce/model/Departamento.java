package com.example.ecommerce.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.List;

@Entity //indica que a classe é armazenado no banco
@Table(name = "departamento") //torna explicito o nome da tabela
public class Departamento {
    @Column(name = "numero")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numero;
    @Column(name = "nome", length = 100)
    private String nome;
    @Column(name = "descricao", nullable = true, columnDefinition = "TEXT")
    private String descricao;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("departamento")
    private List<Produto> listaProdutos;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
}
