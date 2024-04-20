package gestaoFuncionarios.entities;

public abstract class Funcionario {
    private String nomeFuncionario;
    private int idadeFuncionario;
    private double bonusSalario = 0;
    private double salarioFuncionario = 0;

    public Funcionario (String nomeFuncionario, int idadeFuncionario){
        this.nomeFuncionario = nomeFuncionario;
        this.idadeFuncionario = idadeFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getIdadeFuncionario() {
        return idadeFuncionario;
    }

    public void setIdadeFuncionario(int idadeFuncionario) {
        this.idadeFuncionario = idadeFuncionario;
    }

    public double getBonusSalario() {
        return bonusSalario;
    }

    public void setBonusSalario(double bonusSalario) {
        this.bonusSalario = bonusSalario;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    protected void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public abstract double calcularSalario();

    public abstract void falarCargo();
}
