import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class fibonacci {

    public static void main(String[] args) {

        int numero = 100;
        long[] fibArray = fibonacci(numero);

        // Imprimir los números de Fibonacci
        System.out.println("Números de Fibonacci:");
        for (long num : fibArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Filtrar los números pares de Fibonacci
        long[] pares = fibonaccipar(fibArray);

        // Imprimir los números pares de Fibonacci
        System.out.println("Números pares de Fibonacci:");
        for (long num : pares) {
            System.out.print(num + " ");
        }
        String hola = "hola.txt";
        creararchivo(hola);
        escribir(pares, hola);

    }


    public static long[] fibonacci(int numero) {
        int n = numero;
        long[] fibSeries = new long[n];

        // Inicializamos los dos primeros números de la serie de Fibonacci
        fibSeries[0] = 0;
        fibSeries[1] = 1;

        // Calculamos la serie de Fibonacci
        for (int i = 2; i < n; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
        }
        return fibSeries;
    }

    public static long[] fibonaccipar (long[] array) {
        ArrayList<Long> pares = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                pares.add(array[i]);
            }
        }

        // Convertimos el ArrayList de Long a un array de long
        long[] paresArray = new long[pares.size()];
        for (int i = 0; i < pares.size(); i++) {
            paresArray[i] = pares.get(i);
        }

        return paresArray;
    }

    public static void creararchivo(String nombrearchivo){
        File file = new File(nombrearchivo);
        try {
            if (file.createNewFile()) {
                System.out.println("Archivo creado: " + file.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }
    public static void escribir(long[] numbers, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (long number : numbers) {
                writer.write(Integer.toString((int) number));
                writer.newLine();
            }
            System.out.println("Números escritos en el archivo: " + fileName);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    }






