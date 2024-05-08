
    import java.io.File;
    import java.io.FileNotFoundException;
    import java.text.SimpleDateFormat;
    import java.util.Arrays;
    import java.util.Date;
    import java.util.Scanner;

    public class Ejercicio_2V2 {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            while (true) {
                System.out.println("Introduce la ruta del archivo o directorio (Enter para salir):");
                String input = entrada.nextLine().trim();

                if (input.isEmpty()) {
                    System.out.println("Saliendo del programa...");
                    break;
                }

                System.out.println("Mostrar información detallada (true/false):");
                boolean info = Boolean.parseBoolean(entrada.nextLine().trim());

                try {
                    File ruta = new File(input);
                    if (!ruta.exists()) {
                        throw new FileNotFoundException("La ruta especificada no existe.");
                    }
                    mostrarInfoRuta(ruta, info);
                } catch (FileNotFoundException | SecurityException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            entrada.close();
        }

        public static void mostrarInfoRuta(File ruta, boolean info) {
            if (ruta.isDirectory()) {
                System.out.println("[D] " + ruta.getName() + " (Directorio)");

                File[] archivos = ruta.listFiles();
                if (archivos != null) {
                    Arrays.sort(archivos);

                    for (File archivo : archivos) {
                        if (archivo.isDirectory()) {
                            System.out.print("[D] " + archivo.getName() + " (Directorio)");
                        } else {
                            System.out.print("[A] " + archivo.getName() + " (Archivo)");
                        }

                        if (info) {
                            System.out.println(" - Peso: " + archivo.length() + " bytes - Última modificación: " + new Date(archivo.lastModified()));
                        } else {
                            System.out.println();
                        }
                    }
                }
            } else {
                System.out.println("[A] " + ruta.getName() + " (Archivo)");
            }
        }
    }


