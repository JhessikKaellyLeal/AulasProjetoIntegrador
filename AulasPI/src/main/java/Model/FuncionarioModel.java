/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class FuncionarioModel {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String sexo;
    private String email;
    private String senha;

    public FuncionarioModel(String nome, String cpf, String dataNascimento, String sexo, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
    }

    public FuncionarioModel() {
    }
    
    // metodos getter e setter
    
    // getter serve para visualizar os dados
    public String getNome() {
        return nome;
    }
    // setter serve para guardar os dados
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // metodo com retorno do tipo String
    public String getSenha() {
        return senha;
    }
    
    // metodo com parametro e sem retorno
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
    
    
} // chave da classe
