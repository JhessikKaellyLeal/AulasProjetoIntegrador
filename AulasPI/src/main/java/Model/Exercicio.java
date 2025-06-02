/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Exercicio {
    private int idExercicios;
    private String descricao;
    private String musculosTrabalhado;
    private int repeticoes;
    private String diasDaSemana;

    public Exercicio() {
    }

    public Exercicio(int idExercicios, String descricao, String musculosTrabalhado, int repeticoes, String diasDaSemana) {
        this.idExercicios = idExercicios;
        this.descricao = descricao;
        this.musculosTrabalhado = musculosTrabalhado;
        this.repeticoes = repeticoes;
        this.diasDaSemana = diasDaSemana;
    }

    public int getIdExercicios() {
        return idExercicios;
    }

    public void setIdExercicios(int idExercicios) {
        this.idExercicios = idExercicios;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMusculosTrabalhado() {
        return musculosTrabalhado;
    }

    public void setMusculosTrabalhado(String musculosTrabalhado) {
        this.musculosTrabalhado = musculosTrabalhado;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public String getDiasDaSemana() {
        return diasDaSemana;
    }

    public void setDiasDaSemana(String diasDaSemana) {
        this.diasDaSemana = diasDaSemana;
    }

    
}

