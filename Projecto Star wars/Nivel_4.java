import javax.swing.*;

public class Nivel_4 {
    public static void main(String[] args) {
        int P = (int) (10 + Math.random() * (100 - 10 + 1));
        int i = 1, c = 0;
        while (i <= P) {
            if (P % i == 0) {
                c++;
            }
            i++;
        }
        int resultado;
        if (c == 2) {
            resultado = 1;
        } else {
            resultado = 0;
        }

        String input = JOptionPane.showInputDialog("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta \n" +
                "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para \n" +
                "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita \n" +
                "verificar si el  " + P + " es primo o no. Si es primo introduce un 1, si no lo es\n" +
                "introduce un 0");

        int codigoAcceso = Integer.parseInt(input);
        if (codigoAcceso == resultado) {
            JOptionPane.showMessageDialog(null, "Estas a salvo, sigiente nivel");
        } else {
            JOptionPane.showMessageDialog(null, "Game Over");

        }




    }


}
