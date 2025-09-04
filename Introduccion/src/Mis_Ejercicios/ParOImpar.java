package Mis_Ejercicios;

import java.util.Scanner;

public class ParOImpar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero");
        double num = entrada.nextDouble();

        String parOImpar = num % 2 == 0 ? "El numero " + num + " es par" : "El numero " + num + " es impar";
        System.out.println(parOImpar);
    }
}
