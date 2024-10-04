package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        while(true) {
            try {
                System.out.println("Introduce un número...");
                num = entrada.nextInt();
                break;
            }
            catch (InputMismatchException err) {
                System.out.println("ERROR, Introduce un valor válido...");
                entrada.next();
            }
        }
        if (num < 0) {
            num = num * (-1);
            System.out.print("El valor absoluto es " + num);
        }
        else {
            System.out.print("El valor absoluto es " + num);
        }
    }
}
