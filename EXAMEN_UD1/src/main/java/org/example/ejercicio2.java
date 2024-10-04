package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float pared_ancho;
        float pared_largo;
        float azulejo_ancho;
        float azulejo_largo;

        while(true) {
            try {
                System.out.println("Introduce el ancho de la pared...");
                pared_ancho = entrada.nextInt();
                System.out.println("Introduce el largo de la pared...");
                pared_largo = entrada.nextInt();

                while (true) {
                    System.out.println("Introduce el ancho del azulejo...");
                    azulejo_ancho = entrada.nextInt();
                    System.out.println("Introduce el largo del azulejo...");
                    azulejo_largo = entrada.nextInt();
                    if (azulejo_ancho != azulejo_largo && azulejo_ancho * azulejo_largo < pared_ancho + pared_largo) {
                        break;
                    }
                    else if (azulejo_ancho == azulejo_largo) {
                        System.out.println("El azulejo no puede ser cuadrado");

                    }
                    else {
                        System.out.println("El azulejo no puede ser más grande que la pared");
                    }
                }
                break;
            }
            catch (InputMismatchException err) {
                System.out.println("ERROR, Introduce un valor válido...");
                entrada.next();
            }
        }
        float azulejos_necesarios = (pared_largo * pared_ancho) / (azulejo_ancho * azulejo_largo);
        System.out.print("Se necesitan " + azulejos_necesarios + " azulejos");
    }
}
