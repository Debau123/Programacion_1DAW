package Version2.Version2;

public class Mamifero extends Animal {
    protected int gestacion;

    public Mamifero(int edad, String nombre, String tipo_alimentacion, int gestacion) {
        super(edad, nombre, tipo_alimentacion);
        this.gestacion = gestacion;
    }
    public String toString() {

        return super.toString() + "\nGestaciom: " + this.gestacion;
    }
}