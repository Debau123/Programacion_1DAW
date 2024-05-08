package Version2.Version2;


import java.util.ArrayList;

public class AppAnimales {
    public static void main(String[] args) {

        Gato g1 = new Gato(21, "a","pescado", 3,"si");
        Perro p1 = new Perro(12, "uwu", "carne",4,"Pastor belga" );
        Caballo c1 = new Caballo(43, "cgf", "manzanas",4,4 );
        Mamifero B1= new Mamifero(2,"Moby Dick","Placton",12);
        System.out.println(B1.toString());
        System.out.println(g1.toString());
        System.out.println(p1.toString());
        System.out.println(c1.toString());

        System.out.println();
        System.out.println();

        ArrayList<Animal> zoologico = new ArrayList<>();
        zoologico.add(g1);
        zoologico.add(p1);
        zoologico.add(c1);
        zoologico.add(B1);
        System.out.println("Animales en el zoológico:");
        for (Animal animal : zoologico) {
            System.out.println(animal.toString());
        }






    }
}