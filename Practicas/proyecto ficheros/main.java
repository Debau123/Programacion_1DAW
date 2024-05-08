import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        MiniGestorArchivos gestor = new MiniGestorArchivos();
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            // Mostramos el menú
            System.out.println("Menú:");
            System.out.println("1. pwd: Mostrar la carpeta actual.");
            System.out.println("2. cd <DIR>: Cambiar a la carpeta especificada.");
            System.out.println("3. ls: Mostrar lista de archivos y directorios.");
            System.out.println("4. ll: Mostrar lista detallada de archivos y directorios.");
            System.out.println("5. mkdir <DIR>: Crear un directorio.");
            System.out.println("6. rm <FILE>: Borrar un archivo o directorio.");
            System.out.println("7. mv <FILE1> <FILE2>: Mover o renombrar un archivo.");
            System.out.println("8. exit: Salir del programa.");

            // Leer la opción del usuario
            System.out.print("Selecciona una opción: ");
            input = scanner.nextLine();

            // Ejecutar acción basada en la opción seleccionada
            try {
                switch (input.split(" ")[0]) {
                    case "pwd":
                        System.out.println(gestor.obtenerDirectorioActual());
                        break;
                    case "cd":
                        if (input.split(" ").length == 2) {
                            if (!gestor.cambiarDirectorio(input.split(" ")[1])) {
                                System.out.println("Directorio no encontrado");
                            }
                        } else {
                            System.out.println("Argumentos inválidos para el comando cd");
                        }
                        break;
                    case "ls":
                        gestor.listarDirectoriosArchivos();
                        break;
                    case "ll":
                        gestor.listarDirectoriosArchivosDetalles();
                        break;
                    case "mkdir":
                        if (input.split(" ").length == 2) {
                            gestor.crearDirectorio(input.split(" ")[1]);
                        } else {
                            System.out.println("Argumentos inválidos para el comando mkdir");
                        }
                        break;
                    case "rm":
                        if (input.split(" ").length == 2) {
                            gestor.borrarArchivo(input.split(" ")[1]);
                        } else {
                            System.out.println("Argumentos inválidos para el comando rm");
                        }
                        break;
                    case "mv":
                        if (input.split(" ").length == 3) {
                            gestor.moverArchivo(input.split(" ")[1], input.split(" ")[2]);
                        } else {
                            System.out.println("Argumentos inválidos para el comando mv");
                        }
                        break;
                    case "exit":
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }          while (!input.equals("exit"));

        scanner.close();
}
}
