package triangulo.entities;

public class Triangulo {
    public static double lado1;
    public static double lado2;
    public static double lado3;
    public static String tipo;

    public Triangulo (double l1, double l2, double l3){
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
    }

    public String tipoTriangulo(){
        if (lado1 == lado2 && lado2 == lado3){
            tipo = "Equilátero";
        } else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
            tipo = "Isósceles";
        }
        else {
            tipo = "Escaleno";
        }
        return tipo;
    }

}
