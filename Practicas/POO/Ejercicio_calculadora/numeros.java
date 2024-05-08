package Ejercicio_calculadora;

public class numeros {
    private double a;
    private double b;

    public numeros(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double parteReal) {
        this.a = parteReal;
    }

    public void setb(double parteImaginaria) {
        this.b = parteImaginaria;
    }

    public numeros sumar(numeros other) {
        double newA = this.a + other.getA();
        double newB = this.b + other.getB();
        return new numeros(newA, newB);
    }


    public numeros resta(numeros other) {
        double newA = this.a - other.getA();
        double newB = this.b - other.getB();
        return new numeros(newA, newB);
    }

    public numeros multiplicar(numeros other) {
        double newA = (this.a * other.getA() - this.b * other.getB());
        double newB = (this.a * other.getB() + this.b * other.getA());
        return new numeros(newA, newB);


    }

    public numeros multiplicar2(double num) {
        double newA = this.a * num;
        double newB = this.b * num;
        return new numeros(newA, newB);
    }
    public numeros dividir(numeros other){
        double c= other.getA();
        double d= other.getB();
        double realResult = (this.a * c + this.b* d) / (c * c + d * d);
        double imagResult = (this.b * c - this.a * d) / (c * c + d * d);
        return new numeros(realResult, imagResult);
    }

    public void imprimir() {

        System.out.println("(" + getA() + ", " + getB() + "i)");
    }
    public boolean iguales(numeros other) {
        return this.a == other.getA() && this.b == other.getB();
    }

    public String toString() {
        return "(" +  a + ", " +  b + "i)";
    }

}