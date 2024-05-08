import java.io.File;
import java.util.Arrays;

public class MiniFileManager {

    private File directorio;


    public MiniFileManager() {

        this.directorio = new File(System.getProperty("user.dir"));
    }

    public File getDirectorio() {
        return directorio;
    }

    public boolean cambiarDirectorio(String nombreDirectorio) {
        if (nombreDirectorio.equals("..")) {
            File directorioPadre = directorio.getParentFile();
            if (directorioPadre != null) {
                directorio = directorioPadre;
                return true;
            } else {
                return false; // El directorio padre no existe (ya estás en el directorio raíz)
            }
        } else {
            File nuevoDirectorio = new File(directorio, nombreDirectorio);
            if (nuevoDirectorio.exists() && nuevoDirectorio.isDirectory()) {
                directorio = nuevoDirectorio;
                return true;
            }
        }
        return false; // No se pudo cambiar de directorio
    }
    public void listarDirectoriosArchivos() {
        File[] archivos = directorio.listFiles();

        Arrays.sort(archivos);


            for (File archivo : archivos) {
                System.out.println(archivo.getName());
            }
        }
    }


}
