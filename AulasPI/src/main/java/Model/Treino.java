/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Treino {
    private int idTreino;
    private Cliente cliente;      // Associação com Cliente
    private Exercicio exercicio;  // Associação com Exercício

    public Treino() {
    }

    public Treino(int idTreino, Cliente cliente, Exercicio exercicio) {
        this.idTreino = idTreino;
        this.cliente = cliente;
        this.exercicio = exercicio;
    }

    
    
   
    public int getIdTreino() {
        return idTreino;
    }

    public void setIdTreino(int idTreino) {
        this.idTreino = idTreino;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Exercicio getExercicio() {
        return exercicio;
    }

    public void setExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
    }

    
}

