package Boletin_1;

import java.util.Scanner;

public class Ejercicio_1 {

    /*
    Realizar un programa que solicite 3 números cualesquiera y los muestre por
    pantalla ordenados de menor a mayor.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //introduccion de datos

        System.out.println("Introduce el primer numero");
        int num1 = scanner.nextInt();

        System.out.println("introduce el segundo numero");
        int num2 = scanner.nextInt();

        System.out.println("introduce el tercer numero");
        int num3 = scanner.nextInt();

        scanner.close();

        //procesamiento

        if (num1 < num2 && num2 < num3) {
            System.out.println(num1 + " < " + num2 + " < " + num3);
        } else if (num1 < num3 && num3 < num2) {
            System.out.println(num1 + " < " + num3 + " < " + num2);
        } else if (num2 < num1 && num1 < num3) {
            System.out.println(num2 + " < " + num1 + " < " + num3);
        } else if (num2 < num3 && num3 < num1) {
            System.out.println(num2 + " < " + num3 + " < " + num1);
        } else if (num3 < num1 && num1 < num2) {
            System.out.println(num3 + " < " + num1 + " < " + num2);
        } else {
            System.out.println(num3 + " < " + num2 + " < " + num1);
        }
    }
}
