package gestaoFuncionarios.entities;

public class Gerente extends Funcionario{
    public Gerente(String nomeFuncionario, int idadeFuncionario){
        super(nomeFuncionario, idadeFuncionario);
    }

    @Override
    public double calcularSalario() {
        setSalarioFuncionario(14000.00 * (1 + (getBonusSalario() / 100)));
        return getSalarioFuncionario();
    }

    @Override
    public void falarCargo() {
        System.out.println("Cargo: Gerente");
    }
}
