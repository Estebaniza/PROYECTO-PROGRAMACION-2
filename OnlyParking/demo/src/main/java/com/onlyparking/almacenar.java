package com.onlyparking;

import java.util.Scanner;

public class almacenar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("¡Hola! ¿Deseas ver las placas de los vehículos? ");

        while (true) {
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                System.out.println("¡Hasta luego!");
                break;
            } else {
                System.out.println("Buscando placas...");
                String respuestaAPI = api.placas(
                        "Inventa números de placas de moto y carro en Colombia, que sean mínimo 5, también dame un color diferente para cada vehículo: "
                                + input);

                System.out.println("Respuesta de la API: " + respuestaAPI);

                BD.guardar(input, respuestaAPI);
            }

            System.out.println("\n(escribe 'salir' para terminar)");
        }

        scanner.close();
    }
}
