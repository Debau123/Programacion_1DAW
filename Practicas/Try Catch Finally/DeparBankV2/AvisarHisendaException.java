package DeparBankV2;


public class AvisarHisendaException extends Exception {
    private String titular;
    private String iban;
    private String operacion;

    public AvisarHisendaException(String titular, String iban, String operacion) {
        this.titular = titular;
        this.iban = iban;
        this.operacion = operacion;
    }

    @Override
    public String getMessage() {
        return "Se debe avisar a Hacienda: Operación (" + operacion + ") para titular: " + titular + " con IBAN: " + iban;
    }
}
