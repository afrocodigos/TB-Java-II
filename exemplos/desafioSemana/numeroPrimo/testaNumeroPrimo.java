package numeroPrimo;

import java.util.Scanner;

public class testaNumeroPrimo {
    public static void somaPrimos(int numInicio, int numFim){
        int i;
        int j;
        int soma = 0;

        for(i = numInicio; i <= numFim; i++){
            int divisores = 0;
            for(j = 1; j <= i; j++){
                if(i % j == 0){
                    divisores++;
                }
            }
            if(divisores == 2){
                soma = soma + i;
            }
        }
        System.out.printf("Resultado da soma dos números primos entre %d e %d: %d", numInicio, numFim, soma);
    }

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Descubra a soma dos números primos dentro de um intervalo");

        System.out.print("Por favor, insira o valor inicial do intervalo: ");
        int num1 = leTeclado.nextInt();

        System.out.print("Por favor, insira o valor final do intervalo: ");
        int num2 = leTeclado.nextInt();

        leTeclado.close();

        somaPrimos(num1,num2);
    }

}
