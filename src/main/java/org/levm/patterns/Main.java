package org.levm.patterns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int totalFinal = 0;
        boolean salir = false;
        Helado helado = new HeladoSuave();

        Scanner sc = new Scanner(System.in);

        while (!salir) {
            System.out.println("Una orden de "+helado.getDesc());
            System.out.println("\nTotal = " + helado.getPrice());
            System.out.println("a. Mas cobertura");
            System.out.println("b. Mas Granola");
            System.out.println("c. Mas Topping");
            System.out.println("d. Mas Mermelada");
            System.out.println("e. Mas Galleta");
            System.out.println("f. Terminar Orden");

            String opcion = sc.nextLine();

            switch (opcion) {
                case "a":
                        helado = new Cobertura(helado);
                    break;

                case "b":
                        helado = new Granola(helado);
                    break;

                case "c":
                        helado = new Topping(helado);
                    break;
                case "d":
                        helado = new Mermelada(helado);
                    break;
                case "e":
                        helado = new Galleta(helado);
                    break;
                case "f":
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida...");
            }
        }

        System.out.println("\nTotal Final = " + helado.getPrice());
        System.out.printf("Por una orde de: " + helado.getDesc());
    }
}