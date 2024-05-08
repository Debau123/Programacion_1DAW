package Juegos;

public class Vidas {
    public int vidas;


    public  Vidas(int vidas){
        this.vidas=vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getVidas() {
        return vidas;
    }

    public void mostraViddesRestants(){
        System.out.println( "Te quedan estas vidas "+ getVidas());
    }
    public void quitarvidas(int quita){//introduces las vidas que quieres quitarle
        this.vidas= vidas - quita; //le quita a las vidas las vidas introducidas
    }

    public static void main(String[] args) {
        Vidas jugador1 = new Vidas(5);
        jugador1.quitarvidas(1);
        jugador1.mostraViddesRestants();
        Vidas jugador2 = new Vidas(5);
        jugador2.mostraViddesRestants();
        jugador1.mostraViddesRestants();

    }





}
