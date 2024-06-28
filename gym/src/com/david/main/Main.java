package com.david.main;

import com.david.logica.Recaudo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion, voto;
        Recaudo r = new Recaudo();

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Bronce");
            System.out.println("2. Plata");
            System.out.println("3. Oro");
            System.out.println("4.voto");
            System.out.print("Elige una opción (1-4): ");

            System.out.println("6. Salir");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                r.bronce();
            } else if (opcion == 2) {
                r.plata();
            } else if (opcion == 3) {
                r.oro();
            } else if (opcion == 4) {
                System.out.println("1.Juan");
                System.out.println("2.Marcos");
                voto=scanner.nextInt();
                r.instructor(voto);
            } else if (opcion == 6) {
                System.out.println("¡Hasta luego!");
                break;
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 6);

        System.out.println("Personas que eligieron Bronce: " + r.mostrarContadorBronce());
        System.out.println("Personas que eligieron Plata: " + r.mostarContadorPlata());
        System.out.println("Personas que eligieron Oro: " + r.mostrarContadorOro());
        System.out.println("Mejor instructor " + r.mejorInstructor());

        System.out.println("Taltal recaudado" + r.recaudo());
    }
}











