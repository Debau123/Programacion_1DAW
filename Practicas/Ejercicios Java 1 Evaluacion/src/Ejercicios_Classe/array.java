package Ejercicios_Classe;

public class array {
    public static void main(String[] args) {

        int arrayEnters[] = new int[5];
        arrayEnters[0] = 10;
        arrayEnters[1] = 1;
        arrayEnters[2] = 14;
        arrayEnters[3] = 109;
        arrayEnters[4] = 18;

        for (int i = 0; i < arrayEnters.length; i++) {
            System.out.println("[" + arrayEnters[i] + "]");
        }

    }
}
