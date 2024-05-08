package veterinario;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<mascotas> listaAnimales;

    public Inventario() {
        this.listaAnimales = new ArrayList<>();
    }
    public void insertarAnimal(mascotas animal) {

        listaAnimales.add(animal);
    }

    public void eliminarAnimal(int indice) {
            listaAnimales.remove(indice);
            System.out.println("Animal eliminado correctamente.");
    }
    public void vaciarInventario() {
        listaAnimales.clear();
    }
    public void mostrarListaAnimales() {
        for (mascotas animal : listaAnimales) {
            System.out.println(animal.getClass().getSimpleName() + ": " + animal.nombre);
        }
    }
    public void mostrarDatosAnimal(mascotas animal) {
        System.out.println(animal.mostrar());
    }
    public void mostrarDatosTodosAnimales() {
        for (mascotas animal : listaAnimales) {
            System.out.println(animal.mostrar());
        }
    }

    public static void main(String[] args) {

// Creem unas quantes mascotes
            perro p1 = new perro("Bobby", 5, "jugando", "Feb-2018", "Pastor alemán",
                    false);
            perro p2 = new perro("Lulu", 7, "durmiendo", "Abril-2016", "Rottweiler",
                    false);
            gato g1 = new gato("Luna", 2, "durmiendo", "Sept-2020", "negro", false);
            gato g2 = new gato("Pecas", 2, "rascandose", "Julio-2019", "blanco", true);
            Loro l1 = new Loro("Arturito", 10, "hablando", "Enero-2015", "largo", true, "Murcia", true);
            Canario c1 = new Canario("Basilio", 5, "piando", "Dic-2018", "corto", true, "amarillo", true);
// Creem inventari
           Inventario inventari = new Inventario();
// Afegim mascotes a l’inventari
            inventari.insertarAnimal(p1);
            inventari.insertarAnimal(p2);
            inventari.insertarAnimal(g1);
            inventari.insertarAnimal(g2);
            inventari.insertarAnimal(l1);
            inventari.insertarAnimal(c1);
// Mostrem llista d’animals
            inventari.mostrarListaAnimales();
            System.out.println("");
// Mostrem tots els animals
            inventari.mostrarDatosTodosAnimales();
// Eliminem un parell de mascotes
            inventari.eliminarAnimal(1);
            inventari.eliminarAnimal(2);
// Mostrem llista d’animals
            inventari.mostrarDatosTodosAnimales();
            System.out.println("");
        }
}


