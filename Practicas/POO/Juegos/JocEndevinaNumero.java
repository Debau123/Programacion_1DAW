package Juegos;

public class JocEndevinaNumero implements IJugable {
    private int vides;
    private int intents;
    private int numeroEndevinar;

    public JocEndevinaNumero( int intents, int numeroEndevinar) {
        this.vides = intents;
        this.intents = intents;
        this.numeroEndevinar = numeroEndevinar;
    }

    @Override
    public void jugar() {


        while (vides > 0 && intents > 0) {
            System.out.print("Introdueix el teu intent: ");
            int intent = Teclat.lligEnter();

            if (validarNumero(intent)) {
                if (intent == numeroEndevinar) {
                    System.out.println("Has encertat!!");
                    return;
                } else {
                    vides--;
                    intents--;

                    if (vides > 0 && intents > 0) {
                        if (intent < numeroEndevinar) {
                            System.out.println("El número a endevinar és major.");
                        } else {
                            System.out.println("El número a endevinar és menor.");
                        }
                        System.out.println("Torna-ho a intentar. Et queden " +intents + " intents.");
                    } else {
                        if (vides == 0) {
                            System.out.println("Has exhaurit les vides. El número a endevinar era: " + numeroEndevinar);
                        } else {
                            System.out.println("Has exhaurit els intents. El número a endevinar era: " + numeroEndevinar);
                        }
                        return;
                    }
                }
            } else {
                System.out.println("El número introduït no és vàlid. Torna-ho a intentar.");
            }
        }
    }

    @Override
    public void mostrarNom() {
        System.out.println("Endevina un número");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Aquest joc consisteix en endevinar un número. Disposes de " + intents + " intents per endevinar-lo.");
    }

    @Override
    public boolean validarNumero(int numero) {
        // En esta implementación siempre retornará true
        return true;
    }
}
