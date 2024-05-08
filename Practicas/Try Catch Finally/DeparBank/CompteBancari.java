package DeparBank;

public class CompteBancari {

    private String iban;
    private String titular;
    private double saldo;
    private String movimientos;

    public CompteBancari(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0.0; // Inicializar saldo a 0 al crear la cuenta
        this.movimientos = ""; // Inicializar movimientos como cadena vacía
    }

    public boolean ingresar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a ingresar debe ser positiva.");
            return false;
        }

        if (cantidad >= 3000) {
            System.out.println("Aviso a Hacienda por ingreso superior a 3000.");
        }

        this.saldo += cantidad;
        this.registrarMovimiento("Ingreso: +" + cantidad);
        return true;
    }

    public boolean retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a retirar debe ser positiva.");
            return false;
        }

        if (cantidad >= 3000) {
            System.out.println("Retirada superior a 3000, notificando a Hacienda.");
        }

        if (this.saldo - cantidad < -50) {
            System.out.println("¡AVISO: Saldo insuficiente!");
            return false;
        }

        this.saldo -= cantidad;
        this.registrarMovimiento("Retirada: -" + cantidad);
        return true;
    }

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirDatos() {
        System.out.println("Datos de la cuenta:");
        System.out.println("IBAN: " + iban);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public void imprimirMovimientos() {
        System.out.println("Movimientos:");
        System.out.println(movimientos);
    }

    private void registrarMovimiento(String movimiento) {
        this.movimientos += movimiento + "\n";
    }
    public boolean getValida() {
        return this.saldo >= 0;
    }



}
