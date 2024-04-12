package calculadora.application;

import calculadora.entities.Calculadora;
import java.util.Scanner;

public class testaCalculadora {
    public static double numero1;
    public static  double numero2;

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("--------------- CALCULADORA ---------------");

        System.out.println("Por favor, insira o primeiro número: ");
        numero1 = leTeclado.nextDouble();

        System.out.println("Por favor, insira o segundo número: ");
        numero2 = leTeclado.nextDouble();

        leTeclado.close();

        Calculadora calculadora1 = new Calculadora(numero1,numero2);

        double resultadoSoma = calculadora1.somar();
        double resultadoSubtracao = calculadora1.subtrair();
        double resultadoMultiplicacao = calculadora1.multiplicar();
        double resultadoDivisao = calculadora1.dividir();

        System.out.println("--------------- RESULTADOS ---------------");

        System.out.printf("%.2f + %.2f = %.2f\n", numero1, numero2, resultadoSoma);
        System.out.printf("%.2f - %.2f = %.2f\n", numero1, numero2, resultadoSubtracao);
        System.out.printf("%.2f * %.2f = %.2f\n", numero1, numero2, resultadoMultiplicacao);
        if (resultadoDivisao != 0){
            System.out.printf("%.2f / %.2f = %.2f\n", numero1, numero2, resultadoDivisao);
        }
    }
}
