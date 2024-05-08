package Juegos;

public class JocEndevinaParell extends JocEndevinaNumero {
    private int limiteSuperior;

    public JocEndevinaParell( int intents, int numeroEndevinar, int limiteSuperior) {
        super(intents, numeroEndevinar);
        this.limiteSuperior = limiteSuperior;
    }

    @Override
    public void mostrarNom() {
        System.out.println("Endevina un número parell");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("A més, el número a endevinar estarà entre 0 i " + limiteSuperior);
    }
    @Override
    public boolean validarNumero(int numero) {
        if (numero % 2 != 0) {
            System.out.println("Error: El número debe ser par.");
            return false;
        } else {
            // Validar si el número está dentro del rango permitido
            return numero >= 0 && numero <= limiteSuperior;
        }}}
