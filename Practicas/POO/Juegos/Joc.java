package Juegos;

public abstract class  Joc {
    private int vidas ;
    private int vidasocultas;
    private static int record = 0;

    protected Joc(int vida) {
        this.vidas= vida;
        this.vidasocultas = vida;
    }
    protected void reiniciar(){
        vidas= vidasocultas;
    }
    protected boolean llevarVida() {
        vidas--;
        if (vidas <= 0) {
            System.out.println("Joc Acabat");
            return false;
        }
        return true;
    }
    //protected abstract void jugar();//

}
