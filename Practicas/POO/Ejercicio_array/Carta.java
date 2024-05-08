package Ejercicio_array;

public class Carta {
    private int numero;
    private String palo;

    public  Carta(String palo, int numero){
        this.numero=numero;
        this.palo=palo;
    }

    public int getNumero() {
        return numero;
    }
    public String getPalo() {
        return palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    public void imprimircarta(){

        System.out.println("La carta es del palo:"+getPalo()+" y numero : "+getNumero());

    }
}
