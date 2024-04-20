package gestaoFuncionarios.application;

import gestaoFuncionarios.entities.*;

public class testaGestaoFuncionarios {
    public static void main(String[] args) {
        FuncionarioRegular funcionario1 = new FuncionarioRegular("Joana",22);
        System.out.println("Dados do funcionário 1");
        System.out.println("Nome: " + funcionario1.getNomeFuncionario());
        System.out.println("Idade: " + funcionario1.getIdadeFuncionario());
        System.out.println("Salário: R$ " + funcionario1.calcularSalario());

        Gerente funcionario2 = new Gerente("Jussara",28);
        System.out.println("\nDados do funcionário 2");
        System.out.println("Nome: " + funcionario2.getNomeFuncionario());
        System.out.println("Idade: " + funcionario2.getIdadeFuncionario());
        System.out.println("Salário: R$ " + funcionario2.calcularSalario());

        Diretor funcionario3 = new Diretor("José",38);
        System.out.println("\nDados do funcionário 3");
        System.out.println("Nome: " + funcionario3.getNomeFuncionario());
        System.out.println("Idade: " + funcionario3.getIdadeFuncionario());
        System.out.println("Salário: R$ " + funcionario3.calcularSalario());
    }

}
