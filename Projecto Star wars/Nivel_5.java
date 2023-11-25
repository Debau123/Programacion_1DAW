import javax.swing.*;

public class Nivel_5 {
    public static void main(String[] args) {

        int M = (int) (5 + Math.random() * (10 - 5 + 1));
        int S = (int) (5 + Math.random() * (10 - 5 + 1));
        int Factorial_1 = 1;
        int Factorial_2 = 1;
        int resultado;
        for (int i = M; i > 0; i--) {
            Factorial_1 = Factorial_1 * i;
        }
        for (int i = S; i > 0; i--) {
            Factorial_2 = Factorial_2 * i;
        }
        resultado = Factorial_1 + Factorial_2;

        String input = JOptionPane.showInputDialog("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n" +
                "programe el temporizador y salir de allí corriendo. Necesita programarlo para que \n" +
                "explote en exactamente " + M + " minutos y " + S + " segundos, el tiempo suficiente para escapar \n" +
                "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y \n" +
                "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto \n" +
                "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar \n" +
                "el factorial de " + M + "  el factorial de " + S + " . ¿Qué valor debe introducir?");
        int codigoAcceso = Integer.parseInt(input);
        if (codigoAcceso == resultado) {
            JOptionPane.showMessageDialog(null, "Estas a salvo, sigiente nivel");
        } else {
            JOptionPane.showMessageDialog(null, "Game Over");

        }
    }
}
