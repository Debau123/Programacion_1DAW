package punto_d;



public class crear_punto {
    public static void main(String[] args) {

                punto P1 = new punto();
                punto P2 = new punto();// Cambiado de "punto_c.punto" a "Punt"
                P1.setX(5);       // Cambiado de "setx" a "setX"
                P1.setY(2);
                P2.setXY(5,5);// Cambiado de "sety" a "setY"
                P1.imprimir();
                P1.setXY(10, 10 );
                P1.imprimir();
                P1.desplaça(2,4);
                P1.imprimir();
        System.out.println(P1.distancia(P2));


            }
        }


