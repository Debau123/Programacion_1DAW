import java.io.File;
import java.io.FileNotFoundException;

public class Exercici5 {
    public static void main(String[] args) {
        // Instanciamos la clase File con las rutas de las carpetas que queremos borrar
        File fotografias = new File("Documentos/Fotografias");
        File llibres = new File("Documentos/Libros");
        File documents = new File("Documentos");

        boolean resultado = false;

        try {
            // Borramos la carpeta 'Fotografias' y todo su contenido
            resultado = borraTodo(fotografias);
            if (resultado) {
                System.out.println("La carpeta 'Fotografias' ha sido borrada");
            }

            // Borramos la carpeta 'Libros' y todo su contenido
            resultado = borraTodo(llibres);
            if (resultado) {
                System.out.println("La carpeta 'Libros' ha sido borrada");
            }

            // Borramos la carpeta 'Documentos' y todo su contenido
            resultado = borraTodo(documents);
            if (resultado) {
                System.out.println("La carpeta 'Documentos' ha sido borrada");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    public static boolean borraTodo(File f) throws FileNotFoundException {
        if (!f.exists()) {
            throw new FileNotFoundException("La ruta introducida no existe");
        }
        if (f.isFile()) {
            return f.delete();
        }
        File[] archivos = f.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                borraTodo(archivo);
            }
        }
        return f.delete();
    }



}

