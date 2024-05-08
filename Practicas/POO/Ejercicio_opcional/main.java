package Ejercicio_opcional;

public class main {

    public static void main(String[] args) {

        Racional num1 = new Racional(2,7);
        Racional num2 = new Racional(3,2);
        Racional resultadosuma =num1.suma(num2);
        resultadosuma.imprimir();
        Racional num3 = new Racional(4,2);
        Racional num4 = new Racional(1,3);
        Racional resultadoresta =num3.resta(num4);
        resultadoresta.imprimir();
        Racional num5 = new Racional(2,4);
        Racional num6 = new Racional(2,4);
        Racional resultamultiplicacion =num5.producte(num6);
        resultamultiplicacion.imprimir();

    }


}
