package calculadora;

public class Calculadora {
    public static double num1;
    public static double num2;
    public static double resultadoCalculo;

    public Calculadora(double numero1, double numero2){
        this.num1 = numero1;
        this.num2 = numero2;
    }

    public double somar(){
        resultadoCalculo = num1 + num2;
        return resultadoCalculo;
    }

    public double subtrair(){
        resultadoCalculo = num1 - num2;
        return resultadoCalculo;
    }

    public double multiplicar(){
        resultadoCalculo = num1 * num2;
        return resultadoCalculo;
    }

    public double dividir(){
        if (num2 != 0){
            resultadoCalculo = num1 / num2;
        }
        else {
            System.out.println("\nNão é possível realizar divisão por 0\n");
            resultadoCalculo = 0;
        }
        return resultadoCalculo;
    }
}