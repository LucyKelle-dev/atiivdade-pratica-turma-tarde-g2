package org.senai.exemplos;

public class Gerente extends Funcionario {
    private double bonusExtra;
    private double bonus;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }



    @Override
    public double calcularBonus(double percentual) {
        // ERRO: variável não existe
        return salario + (salario * percentual) + bonus;
    }

    public void mostrarBonus() {
        System.out.println("Nome: " + nome + " | Salário: " + salario);
        System.out.println("Bônus extra: " + bonusExtra);
    }
}
