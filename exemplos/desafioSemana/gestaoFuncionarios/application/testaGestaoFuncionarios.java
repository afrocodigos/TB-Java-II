package gestaoFuncionarios.application;

import gestaoFuncionarios.entities.*;

public class testaGestaoFuncionarios {
    public static void main(String[] args) {
        FuncionarioRegular funcionario1 = new FuncionarioRegular("Joana",22);
        funcionario1.setBonusSalario(5);
        System.out.println("Dados do funcionário 1");
        System.out.println("Nome: " + funcionario1.getNomeFuncionario());
        System.out.println("Idade: " + funcionario1.getIdadeFuncionario());
        funcionario1.falarCargo();
        System.out.printf("Bônus adicionado: %.0f%%\n", funcionario1.getBonusSalario());
        System.out.printf("Salário: R$ %.2f\n", funcionario1.calcularSalario());

        Gerente funcionario2 = new Gerente("Jussara",28);
        funcionario2.setBonusSalario(3);
        System.out.println("\nDados do funcionário 2");
        System.out.println("Nome: " + funcionario2.getNomeFuncionario());
        System.out.println("Idade: " + funcionario2.getIdadeFuncionario());
        funcionario2.falarCargo();
        System.out.printf("Bônus adicionado: %.0f%%\n", funcionario2.getBonusSalario());
        System.out.printf("Salário: R$ %.2f\n", funcionario2.calcularSalario());

        Diretor funcionario3 = new Diretor("José",38);
        funcionario3.setBonusSalario(0);
        System.out.println("\nDados do funcionário 3");
        System.out.println("Nome: " + funcionario3.getNomeFuncionario());
        System.out.println("Idade: " + funcionario3.getIdadeFuncionario());
        funcionario3.falarCargo();
        System.out.printf("Bônus adicionado: %.0f%%\n", funcionario3.getBonusSalario());
        System.out.printf("Salário: R$ %.2f\n", funcionario3.calcularSalario());

    }

}
