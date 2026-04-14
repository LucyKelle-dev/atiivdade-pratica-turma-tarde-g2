package org.senai.exemplos;


public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Priscila", 2000);
        func1.mostrarDados();
        Gerente func2 = new Gerente("Keyla", 3000);
        func2.mostrarBonus();

    }
}