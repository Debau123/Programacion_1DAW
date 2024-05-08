package Ejercicio_calculadora;

public class main {
    public static void main(String[] args) {
        numeros numero1 = new numeros(10, 25);
        numeros numero2 = new numeros(2, 5);

        numero1.imprimir();
        numero2.imprimir();
        /*numeros resultado = numero1.sumar(numero2);
        resultado.imprimir();
        numeros resultaoresta = numero1.resta(numero2);
        resultaoresta.imprimir();
        numeros resultadomultiplicar = numero1.multiplicar(numero2);
        resultadomultiplicar.imprimir();
        System.out.println(resultadomultiplicar.toString());*/
        System.out.println(numero1.iguales(numero2));
        numeros resultsodividir = numero1.dividir(numero2);
        resultsodividir.imprimir();
    }
}
