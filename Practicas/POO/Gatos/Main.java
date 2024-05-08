package Gatos;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creamos una lista con arraylist
        ArrayList<GatoBasico> listaGatos = new ArrayList<>();

        // Creamos gatos
        GatoBasico gato1 = new GatoBasico("Blanco", "Siamés", 3, 'M', 5.5);
        GatoBasico gato2 = new GatoBasico("Negro", "Persa", 2, 'F', 4.2);
        GatoBasico gato3 = new GatoBasico("Gris", "siames", 5, 'F', 6.0);
        GatoBasico gato4 = new GatoBasico("Blanco", "Persa", 1, 'M', 3.1);

        // Añadimos los gatos al arraylist
        listaGatos.add(gato1);
        listaGatos.add(gato2);
        listaGatos.add(gato3);
        listaGatos.add(gato4);

        // Mostramos la cantidad de gatos en la lista
        System.out.println("Cantidad de gatos en la lista: " + listaGatos.size());

        // Mostramos información sobre todos los gatos en la lista
        for (GatoBasico gato : listaGatos) {
            System.out.println("Color: " + gato.getColor());
            System.out.println("Raza: " + gato.getRaza());
            System.out.println("Edad: " + gato.getEdad());
            System.out.println("Sexo: " + gato.getSexo());
            System.out.println("Peso: " + gato.getPeso());
            System.out.println();
        }
        GatoBasico gato5 = new GatoBasico("Rojo", "siames", 2, 'M', 5.2);
        //Añadimos el gato5 en la posicion del gato 4 y volvemos a ver la lista
         listaGatos.set(3,gato5);
        for (GatoBasico gato : listaGatos) {

            System.out.println("Color: " + gato.getColor());
            System.out.println("Raza: " + gato.getRaza());
            System.out.println("Edad: " + gato.getEdad());
            System.out.println("Sexo: " + gato.getSexo());
            System.out.println("Peso: " + gato.getPeso());
            System.out.println();
        }


        gato3.pelear(gato1);
        gato1.pelear(gato4);

        // Elimino un gato de la lista y muestro la lista
        listaGatos.remove(1);
        System.out.println("Nos quedna los sigientes gatos: " + listaGatos.size());

        // Buscamos un gato blanco en la lista
        String colorBuscado = "Blanco";
        boolean contieneColor = false;
        for (GatoBasico gato : listaGatos) {
            if (gato.getColor().equals(colorBuscado)) {
                contieneColor = true;
                break;
            }
        }
        System.out.println("¿La lista de gatos contiene un gato de color blanco? " + contieneColor);

        // Quitamos todos los gatos de la lista
        listaGatos.clear();
        System.out.println("Después de limpiar la lista, la cantidad de gatos es: " + listaGatos.size());
    }
}
