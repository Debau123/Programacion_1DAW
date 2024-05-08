package VEHICULOS;

public class inventario {
    public static void main(String[] args) {
        Avion boing = new Avion("ABC123456", "Boing", 50, 5);
        boing.imprimir();

        Helicoptero mariano = new Helicoptero("ABCD123456", "Rajoy", 4, 4);
        mariano.imprimir();
    }
}

