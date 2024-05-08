package figuras;

class Cercle implements IFugura2D {
    private double radi;

    public Cercle(double radi) {
        this.radi = radi;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * radi;
    }

    @Override
    public double area() {
        return Math.PI * radi * radi;
    }

    @Override
    public void escalar(double escala) {
        if (escala > 0) {
            radi *= escala;
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Cercle - Radi: " + radi + ", Perímetre: " + perimetre() + ", Àrea: " + area());
    }
}