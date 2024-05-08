package DeparBankV2;

import java.util.ArrayList;

public class CompteBancariV2 {

    private String iban;
    private String titular;
    private double saldo;
    private ArrayList<String> movimientos;

    public CompteBancariV2(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0.0;
        this.movimientos = new ArrayList<>();
    }

    public void ingresar(double cantidad) throws CompteException, AvisarHisendaException {
        if (cantidad <= 0) {
            throw new CompteException("La cantidad a ingresar debe ser positiva.");
        }

        if (cantidad >= 3000) {
            this.saldo += cantidad;
            registrarMovimiento("Ingreso: +" + cantidad);
            throw new AvisarHisendaException(titular, iban, "Ingreso superior a 3000");
        }
        else {
            this.saldo += cantidad;
            registrarMovimiento("Ingreso: +" + cantidad);

        }

    }

    public void retirar(double cantidad) throws CompteException, AvisarHisendaException {
        if (cantidad <= 0) {
            throw new CompteException("La cantidad a retirar debe ser positiva.");
        }

        if (cantidad >= 3000) {
            this.saldo -= cantidad;
            registrarMovimiento("Retirada: -" + cantidad);
            throw new AvisarHisendaException(titular, iban, "Retirada superior a 3000");
        }

        if (this.saldo - cantidad < -50) {
            throw new CompteException("Saldo insuficiente para realizar esta operación.");
        }

        this.saldo -= cantidad;
        registrarMovimiento("Retirada: -" + cantidad);
    }

    public void imprimirDatos() {
        System.out.println("Datos de la cuenta:");
        System.out.println("IBAN: " + iban);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public void imprimirMovimientos() {
        System.out.println("Movimientos:");
        for (String movimiento : movimientos) {
            System.out.println(movimiento);
        }
    }

    private void registrarMovimiento(String movimiento) {
        this.movimientos.add(movimiento);
    }

    public boolean getValida() {
        return this.saldo >= 0;
    }


    public double getSaldo() {
        return saldo;
    }
}
