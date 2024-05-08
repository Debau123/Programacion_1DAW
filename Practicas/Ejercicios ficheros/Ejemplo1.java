import java.io.File;
import java.io.IOException;

public class Ejemplo1 {


    public static void main(String[] args) {
        //Ejemplo fichero

       /* File fichero = new File("ejemplo.txt");

        if(fichero.exists()){
            System.out.println("El fichero existe ");
        }else {
            System.out.println("El fichero no existe ");
        }

        //Caracteristicas

        System.out.println("Nombre: " + fichero.getName());
        System.out.println("Longitud: "+ fichero.length());
        System.out.println("Ruta relativa: "+ fichero.getPath());
        System.out.println("Rusta absoluta: " + fichero.getAbsolutePath());
        System.out.println("Se puede leer: "+ fichero.canRead());
        System.out.println("Se puede escribir : "+ fichero.canWrite());
          */
        /*
        File directorio = new File("prueba");

        if (directorio.exists()) {
            System.out.println("El directorio existe ");
        } else {
            try {


                System.out.println("El directorio no existe ");
                if (!directorio.createNewFile())
                    System.out.println("No se a podido crear el directorio ");
            } catch (IOException ios) {
                System.out.println(ios.getMessage());
            }
        }

        //Caracteristicas

        System.out.println("Nombre: " + directorio.getName());
        System.out.println("Longitud: " + directorio.length());
        System.out.println("Ruta relativa: " + directorio.getPath());
        System.out.println("Rusta absoluta: " + directorio.getAbsolutePath());
        System.out.println("Se puede leer: " + directorio.canRead());
        System.out.println("Se puede escribir : " + directorio.canWrite());
      */


    }
}
