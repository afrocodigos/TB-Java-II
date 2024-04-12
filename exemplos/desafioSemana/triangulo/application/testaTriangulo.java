package triangulo.application;

import triangulo.entities.Triangulo;
import java.util.Scanner;

public class testaTriangulo {
    public static double l1;
    public static double l2;
    public static double l3;

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Qual o tamanho do primeiro lado do triângulo? ");
        l1 = leTeclado.nextDouble();

        System.out.println("Qual o tamanho do segundo lado do triângulo? ");
        l2 = leTeclado.nextDouble();

        System.out.println("Qual o tamanho do terceiro lado do triângulo? ");
        l3 = leTeclado.nextDouble();

        leTeclado.close();

        Triangulo triangulo1 = new Triangulo(l1,l2,l3);

        System.out.printf("Tipo de triângulo: %s\n", triangulo1.tipoTriangulo());

    }
}
