package Juegos;
import java.util.ArrayList;

public class Aplicacio {
    /*public static void main(String[] args) {
        System.out.println("Benvingut al joc d'endevinar números!");



        System.out.print("Introdueix el número d'intents: ");
        int intents = Teclat.lligEnter();

        System.out.print("Introdueix el número a endevinar entre 0 i 10: ");
        int numeroEndevinar = Teclat.lligEnter();

        JocEndevinaNumero joc = new JocEndevinaNumero( intents, numeroEndevinar);
        joc.jugar();*/

        public static void main(String[] args) {
            ArrayList<IJugable> juegos = new ArrayList<>();
            juegos.add(new JocEndevinaNumero(3, 7));
            juegos.add(new JocEndevinaParell(3, 7, 15)); // Ejemplo con parámetros específicos
            juegos.add(new JocEndevinaImparell(3, 7, 10)); // Ejemplo con parámetros específicos

            boolean jugarDeNuevo = true;
            while (jugarDeNuevo) {
                IJugable juegoSeleccionado = triarJoc(juegos);
                if (juegoSeleccionado != null) {
                    juegoSeleccionado.mostrarNom();
                    juegoSeleccionado.mostrarInfo();
                    juegoSeleccionado.jugar();
                }

                System.out.print("Vols jugar de nou? (s/n): ");
                char resposta = Teclat.lligCaracter();
                jugarDeNuevo = (resposta == 's' || resposta == 'S');
            }
        }

        public static IJugable triarJoc(ArrayList<IJugable> juegos) {
            System.out.println("Triï el joc que vol jugar:");
            for (int i = 0; i < juegos.size(); i++) {
                System.out.println(i + ". " + juegos.get(i).getClass().getSimpleName());
            }

            int seleccion = -1;
            do {
                System.out.print("Introdueix un número entre 0 i " + (juegos.size() - 1) + ": ");
                seleccion = Teclat.lligEnter();
            } while (seleccion < 0 || seleccion >= juegos.size());

            return juegos.get(seleccion);
        }
    }

