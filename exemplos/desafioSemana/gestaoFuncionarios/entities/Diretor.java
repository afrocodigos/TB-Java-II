package gestaoFuncionarios.entities;

public class Diretor extends Funcionario{
    public Diretor(String nomeFuncionario, int idadeFuncionario){
        super(nomeFuncionario, idadeFuncionario);
    }

    @Override
    public double calcularSalario() {
        setSalarioFuncionario(24500.00 * (1 + (getBonusSalario() / 100)));
        return getSalarioFuncionario();
    }

    @Override
    public void falarCargo() {
        System.out.println("Cargo: Diretor");
    }
}
