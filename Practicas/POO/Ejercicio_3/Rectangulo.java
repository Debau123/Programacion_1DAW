package Ejercicio_3;

public class Rectangulo {
    int x1 ,x2, y1,y2;
    // Constructor amb els 4 paràmetres i validació
    public Rectangulo (int x1, int y1, int x2, int y2) {
        if ((x1 < x2) && (y1 < y2)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR en instància Rectangle: Coordenades no vàlides.");
        }
    }
}
