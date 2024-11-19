package proyectodb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            // Menú de opciones
            System.out.println("\n***** Sistema de Monitoreo de Estacionamiento (Only Parking) *****");
            System.out.println("1. Insertar vehículo");
            System.out.println("2. Ver vehículos estacionados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Para consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.println("\n***** Insertar vehículo *****");
                    
                    System.out.print("Ingrese el ID del vehículo: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Para consumir la nueva línea
                    System.out.print("Ingrese la placa del vehículo: ");
                    String placa = scanner.nextLine();
                    System.out.print("Ingrese el tipo de vehículo (Ej. Carro, Moto, Bicicleta): ");
                    String tipoVehiculo = scanner.nextLine();
                    System.out.print("Ingrese el estado del vehículo (Estacionado / En Movimiento): ");
                    String estado = scanner.nextLine();
                    System.out.print("Ingrese el color del vehículo: ");
                    String color = scanner.nextLine();
                    System.out.print("Ingrese el espacio de estacionamiento: ");
                    int espacio = scanner.nextInt();
                    scanner.nextLine();  // Para consumir la nueva línea

                    // Crear objeto ParkingSpace
                    ParkingSpace parkingSpace = new ParkingSpace(id, placa, tipoVehiculo, estado, color, espacio);

                    // Insertar el vehículo
                    InsertValue.Insert(parkingSpace);
                    break;

                case 2:
                    System.out.println("\n***** Vehículos estacionados *****");
                    SelectTable.Show();
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Por favor intente de nuevo.");
            }
        }

        scanner.close();
    }
}
