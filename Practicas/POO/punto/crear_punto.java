package punto;

public class crear_punto {
    public static void main(String[] args) {


        punto punto_1 = new punto();
       punto_1.x=5;
       punto_1.y=0;
       punto_1.bajary();
        System.out.println("Las cordenadas son (x="+ punto_1.x+ " y="+ punto_1.y+")");


        punto punto_2 = new punto();
        punto_2.x=10;
        punto_2.y=10;
        punto_2.subirx();
        punto_2.bajary();
        System.out.println("Las cordenadas son (x="+ punto_2.x+ " y="+ punto_2.y+")");

        punto punto_3 = new punto();
        punto_3.x=-3;
        punto_3.y=7;
        System.out.println("Las cordenadas son (x="+ punto_3.x+ " y="+ punto_3.y+")");





    }
}
