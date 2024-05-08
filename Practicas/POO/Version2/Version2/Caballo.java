package Version2.Version2;

public class Caballo extends Mamifero {
    private int patas;

    public Caballo(int edad, String nombre, String tipo_alimentacion, int gestacion, int patas) {
        super(edad, nombre, tipo_alimentacion, gestacion);
        this.patas = patas;
    }

    public String toString() {
        return super.toString() + "\nPatas: " + this.patas;
    }

    public void relinchar() {
        System.out.println("¡Hiiii!");
    }
}