package agenda;

import Ejercicio_array_conjunto.videojuego;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;

public class Agenda {
    private static ArrayList<Contactos> agenda;

    public Agenda() {

            agenda = new ArrayList<>();

    }

    public static void agregarContacto(Contactos contacto) {

        agenda.add(contacto);
    }
    public static void mostrarContactos() {
        if (agenda.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            System.out.println("Lista de contactos:");
            for (Contactos contacto : agenda) {
                contacto.imprimir();
            }
        }
    }

    public static void consultarContacto(long dni) {
        boolean encontrado = false;
        for (Contactos contacto : agenda) {
            if (contacto.getDNI() == dni) {
                System.out.println("Información del contacto:");
                contacto.imprimir();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún contacto con ese DNI.");
        }
    }

    public static void borrarContacto(long dni) {
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getDNI() == dni) {
                agenda.remove(i);
                System.out.println("Contacto borrado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró ningún contacto con ese DNI.");
    }


    public static void main(String[] args) {
        Agenda miAgenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de Agenda:");
            System.out.println("1. Insertar contacto");
            System.out.println("2. Consultar todos los contactos");
            System.out.println("3. Consultar contacto por DNI");
            System.out.println("4. Borrar contacto por DNI");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Añadir contacto:");
                    System.out.print("DNI: ");
                    long dni = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Nombre : ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellidos : ");
                    String Apellidos = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Correo electrónico: ");
                    String email = scanner.nextLine();

                    Contactos nuevoContacto = new Contactos(dni, nombre, Apellidos, telefono, email);
                    agregarContacto(nuevoContacto);
                    break;
                case 2:
                    mostrarContactos();
                    break;
                case 3:
                    System.out.print("Ingrese el DNI del contacto a consultar: ");
                    long dniConsulta = scanner.nextLong();
                    consultarContacto(dniConsulta);
                    break;
                case 4:
                    System.out.print("Ingrese el DNI del contacto a borrar: ");
                    long dniBorrar = scanner.nextLong();
                    borrarContacto(dniBorrar);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        } while (opcion != 5);


    }
}


