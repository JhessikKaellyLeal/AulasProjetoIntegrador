/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Cliente {
    private int idCliente;
    private String nome;
    private String cpf;
    private String telefone;
    private int quadril;
    private String sexo;
    private double altura;
    private double peso;
    private int cintura;
    private int pernaDireita;
    private int pernaEsquerda;
    private int bracoDireito;
    private int bracoEsquerdo;
    private Plano plano;  // associação com a classe Plano

    public Cliente() {
    }

    public Cliente(int idCliente, String nome, String cpf, String telefone, int quadril, String sexo, double altura, double peso, int cintura, int pernaDireita, int pernaEsquerda, int bracoDireito, int bracoEsquerdo, Plano plano) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.quadril = quadril;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.cintura = cintura;
        this.pernaDireita = pernaDireita;
        this.pernaEsquerda = pernaEsquerda;
        this.bracoDireito = bracoDireito;
        this.bracoEsquerdo = bracoEsquerdo;
        this.plano = plano;
    }

   
}

