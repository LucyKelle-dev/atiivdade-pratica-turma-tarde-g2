package org.senai.exemplos;


public class Funcionario {
    protected String nome;
    protected double salario;
    protected double percentual;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.percentual= percentual;
    }

    public double calcularBonus(double percentual){
        return salario + (salario * percentual);
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome + " | Salário: " + salario);
    }
}
