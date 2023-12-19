package Ejercicios_voluntarios_array;

public class Ejercicio_14 {
    public static void main(String[] args){

        // Calculamos cuantos números tiene la secuencia
        int cuantos = 0;
        for (int i = 1; i <= 10; i++) {
            cuantos += i;
        }

        // Creamos el vector
        int valores[] = new int[cuantos];

        // Índice para recorrer el vector
        int posicion = 0;

        // Para cada número i del 1 al 10
        for (int i = 1; i <= 10; i++) {

            // Repetimos i veces
            for (int j = 0; j < i; j++) {

                // Guardar el valor en 'posición'
                valores[posicion] = i;

                // Actualizamos posición
                posicion++;
            }
        }

        // Mostramos el array
        System.out.print("Array: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }

    }

}