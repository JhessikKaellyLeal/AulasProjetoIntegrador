/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Plano {
    
    private int idPlanos;
    private String nome;
    private double valor;
    private String descricao;

    public Plano() {
    }

    public Plano(int idPlanos, String nome, double valor, String descricao) {
        this.idPlanos = idPlanos;
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getIdPlanos() {
        return idPlanos;
    }

    public void setIdPlanos(int idPlanos) {
        this.idPlanos = idPlanos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}

