package punto_b;

public class crear_punto {
    public static void main(String[] args) {
        punto P1 = new punto();
        System.out.println("x" + P1.x + " y"+ P1.y);
        punto P2 = new punto (1,2);
        System.out.println("x" +P2.x+"y"+  P2.y);
    }
}
