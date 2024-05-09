import java.io.File;

public class Exercici4 {

    public static void main(String[] args) {
        // Definir las rutas
        String rutaDocumentos = "Documentos";
        String rutaMisCosas = rutaDocumentos + "/Mis Cosas";
        String rutaAlfabeto = rutaDocumentos + "/Alfabeto";
        String rutaFotografias = rutaMisCosas + "/Fotografias";
        String rutaLibros = rutaMisCosas + "/Libros";

        // Creamos las carperas
        boolean misCosasCreada = crearCarpeta(rutaMisCosas);
        boolean alfabetoCreado = crearCarpeta(rutaAlfabeto);

        // Tarea 2: Mover las carpetas '
        boolean fotografiasMovida = moverCarpeta("Documentos/Fotografias", rutaFotografias);
        boolean librosMovido = moverCarpeta("Documentos/Libros", rutaLibros);

        // Tarea 3: Crear carpetas para cada letra del alfabeto dentro de 'Alfabeto'
        crearCarpetasAlfabeto(rutaAlfabeto);

        // Imprimir los resultados
        System.out.println("¿Se creó la carpeta 'Documentos/Mis Cosas'? " + misCosasCreada);
        System.out.println("¿Se creó la carpeta 'Documentos/Alfabeto'? " + alfabetoCreado);
        System.out.println("¿Se movió la carpeta 'Documentos/Fotografias' a 'Documentos/Mis Cosas/Fotografias'? " + fotografiasMovida);
        System.out.println("¿Se movió la carpeta 'Documentos/Libros' a 'Documentos/Mis Cosas/Libros'? " + librosMovido);
        System.out.println("\nEl contenido de la carpeta 'Alfabeto' es:");
        imprimirCarpetasAlfabeto(rutaAlfabeto);
    }

    // Método para crear una carpeta
    public static boolean crearCarpeta(String ruta) {
        File carpeta = new File(ruta);
        return carpeta.mkdir();
    }

    // Método para mover una carpeta
    public static boolean moverCarpeta(String rutaOrigen, String rutaDestino) {
        File carpetaOrigen = new File(rutaOrigen);
        File carpetaDestino = new File(rutaDestino);
        return carpetaOrigen.renameTo(carpetaDestino);
    }

    // Método para crear carpetas para cada letra del alfabeto
    public static void crearCarpetasAlfabeto(String ruta) {
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            String rutaCarpetaLetra = ruta + "/" + letra;
            crearCarpeta(rutaCarpetaLetra);
        }
    }

    // Método para imprimir
    public static void imprimirCarpetasAlfabeto(String ruta) {
        File carpetaAlfabeto = new File(ruta);
        File[] carpetas = carpetaAlfabeto.listFiles(File::isDirectory);
        for (File carpeta : carpetas) {
            System.out.print(carpeta.getName() + " ");
        }
    }
}

