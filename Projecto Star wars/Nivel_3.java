import javax.swing.*;
import java.sql.SQLOutput;

public class Nivel_3 {
    public static void main(String[] args) {
        int N = (int) (50 + Math.random() * (100 - 50 + 1));
        int N2 = (N / 10);
        int resultado = 1;
        for (int i = N2; i > 0; i--) {
            resultado = resultado * i;
        }
        System.out.println(N);
        System.out.println(N2);
        System.out.println(resultado);

        String input = JOptionPane.showInputDialog(" Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se \n" +
                " equipan con trajes de soldados imperiales que encuentran en la nave para pasar \n" +
                " desapercibidos y bajan. Ahora deben averiguar en qué nivel de los " + N + " existentes se \n" +
                " encuentra el reactor principal. Se dirigen al primer panel computerizado que \n" +
                " encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita \n" +
                " introducir una clave de acceso. Entonces recuerda la información que le proporcionó \n" +
                " Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de " + N + "/10 \n" +
                " (redondeando N hacia abajo), donde N es el nº de niveles.\n" +
                " ¿Cual es el nivel correcto?");

        int codigoAcceso = Integer.parseInt(input);
        if (codigoAcceso == resultado) {
            JOptionPane.showMessageDialog(null, "Estas a salvo, sigiente nivel");
        } else {
            JOptionPane.showMessageDialog(null, "Game Over");

        }


    }
}
