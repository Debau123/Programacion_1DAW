import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class nivel_2 {
    public static void main(String[] args) {
        int P1 = (int) (1 + Math.random() * (7 - 1 + 1)); //Aqui cremamos la variante P1 entre 1 y 7 incluido los 2
        int P2 = (int) (8 + Math.random() * (12 - 8 + 1)); //Aqui cremaos la variante S2 entre los numeros 20 y 30 incluido ambos.
        int sumatorio = 1;//Aqui declaro he inicio la variable sumatorio para tener el sumatorio la respuesta guardada
        for (int i = P1; i <= P2; i++) {//  aqui ejecuto un bucle para obtener la respuesta del multiplicador de P1 hasta P2 ambos incluidos
            sumatorio = i * sumatorio;
        }
        System.out.println(sumatorio);

        String input = JOptionPane.showInputDialog("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella \n" +
                "de la muerte. Como van en una nave imperial robada se aproximan lentamente con \n" +
                "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí \n" +
                "agente de espaciopuerto " + P1 + " contactando con nave imperial P2. No están destinados \n" +
                "agente de espaciopuerto P1 contactando con nave imperial P2. No están destinados \n" +
                "en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa. “Eh… \n" +
                "tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso para \n" +
                "atracar y reparar la nave”. El agente, que no se anda con tonterías, responde \n" +
                "Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el \n" +
                "manual del piloto que estaba en la guantera y da con la página correcta. El código \n" +
                "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive). \n" +
                "¿Cuál es el código?");

        int codigoAcceso = Integer.parseInt(input);
        if (codigoAcceso == sumatorio) {
            JOptionPane.showMessageDialog(null, "Estas a salvo sigiente nivel");
        } else {
            JOptionPane.showMessageDialog(null, "Game Over");

        }


    }
}


