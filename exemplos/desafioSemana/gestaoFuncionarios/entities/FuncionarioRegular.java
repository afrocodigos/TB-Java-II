package gestaoFuncionarios.entities;

public class FuncionarioRegular extends Funcionario{
    public FuncionarioRegular(String nomeFuncionario, int idadeFuncionario){
        super(nomeFuncionario, idadeFuncionario);
    }

    @Override
    public double calcularSalario() {
        setSalarioFuncionario(5900.00 * (1 + (getBonusSalario() / 100)));
        return getSalarioFuncionario();
    }

    @Override
    public void falarCargo() {
        System.out.println("Cargo: Funcionário regular");
    }
}
