import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MiniGestorArchivos {
    private File directorioActual;

    public MiniGestorArchivos() {
        directorioActual = new File(System.getProperty("user.dir"));
    }

    public String obtenerDirectorioActual() {
        return directorioActual.getAbsolutePath();
    }

    public boolean cambiarDirectorio(String nombreDirectorio) {
        File nuevoDirectorio = new File(directorioActual, nombreDirectorio);
        if (nuevoDirectorio.exists() && nuevoDirectorio.isDirectory()) {
            directorioActual = nuevoDirectorio;
            return true;
        } else if (nombreDirectorio.equals("..")) {
            File directorioPadre = directorioActual.getParentFile();
            if (directorioPadre != null) {
                directorioActual = directorioPadre;
                return true;
            }
        }
        return false;
    }

    public void listarDirectoriosArchivos() {
        File[] archivos = directorioActual.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                System.out.println(archivo.getName());
            }
        }
    }

    public void listarDirectoriosArchivosDetalles() {
        File[] archivos = directorioActual.listFiles();
        if (archivos != null) {
            Arrays.sort(archivos, Comparator.comparing(File::isDirectory).reversed().thenComparing(File::getName));
            for (File archivo : archivos) {
                System.out.printf("%-30s %-20s %-20s\n", archivo.getName(), archivo.isDirectory() ? "<DIR>" : archivo.length() + " bytes", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(archivo.lastModified())));
            }
        }
    }

    public void crearDirectorio(String nombreDirectorio) throws IOException {
        File nuevoDirectorio = new File(directorioActual, nombreDirectorio);
        if (!nuevoDirectorio.exists()) {
            if (!nuevoDirectorio.mkdir()) {
                throw new IOException("Error al crear el directorio");
            }
        } else {
            throw new IOException("El directorio ya existe");
        }
    }

    public void borrarArchivo(String nombreArchivo) throws IOException {
        File archivoEliminar = new File(directorioActual, nombreArchivo);
        if (!archivoEliminar.exists()) {
            throw new IOException("El archivo no existe");
        }
        if (archivoEliminar.isDirectory()) {
            eliminarDirectorio(archivoEliminar);
        } else {
            if (!archivoEliminar.delete()) {
                throw new IOException("Error al eliminar el archivo");
            }
        }
    }

    private void eliminarDirectorio(File directorio) throws IOException {
        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    eliminarDirectorio(archivo);
                } else {
                    if (!archivo.delete()) {
                        throw new IOException("Error al eliminar el archivo");
                    }
                }
            }
        }
        if (!directorio.delete()) {
            throw new IOException("Error al eliminar el directorio");
        }
    }

    public void moverArchivo(String nombreOrigen, String nombreDestino) throws IOException {
        File origen = new File(directorioActual, nombreOrigen);
        File destino = new File(directorioActual, nombreDestino);
        if (!origen.exists()) {
            throw new IOException("El archivo de origen no existe");
        }
        if (destino.exists()) {
            throw new IOException("El archivo de destino ya existe");
        }
        if (!origen.renameTo(destino)) {
            throw new IOException("Error al mover el archivo");
        }
    }
}
