package br.com.fatec.apiaula.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private int idade;

    public Usuario() {
    }

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Integer getId() {
        return id;
    }

    // 2. SETTER DO ID (NECESSÁRIO PARA OPERAÇÕES DE ATUALIZAÇÃO)
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}