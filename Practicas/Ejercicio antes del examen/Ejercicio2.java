import java.io.*;
import java.util.*;

class Alumno {
    String nombre;
    String apellido;
    List<Integer> notas;

    public Alumno(String nombre, String apellido, List<Integer> notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
    }

    public double calcularNotaPromedio() {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.size();
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ": " + calcularNotaPromedio();
    }
}

public class Ejercicio2 {

    public static void main(String[] args) {
        try {
            // Verificar si el archivo de entrada existe, si no, crear uno nuevo
            File archivo = new File("alumnos_notas.txt");
            if (!archivo.exists()) {
                archivo.createNewFile();
                System.out.println("El archivo 'alumnos_notas.txt' no existía y ha sido creado.");
                return;
            }

            // Leer los datos de los alumnos y sus notas del archivo
            Scanner scanner = new Scanner(archivo);
            List<Alumno> alumnos = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] partes = linea.split(",");
                String nombre = partes[0];
                String apellido = partes[1];
                List<Integer> notas = new ArrayList<>();
                for (int i = 2; i < partes.length; i++) {
                    notas.add(Integer.parseInt(partes[i]));
                }
                alumnos.add(new Alumno(nombre, apellido, notas));
            }
            scanner.close();

            // Ordenar la lista de alumnos por nota promedio de mayor a menor
            Collections.sort(alumnos, new Comparator<Alumno>() {
                @Override
                public int compare(Alumno a1, Alumno a2) {
                    return Double.compare(a2.calcularNotaPromedio(), a1.calcularNotaPromedio());
                }
            });

            // Mostrar los alumnos ordenados por nota promedio
            for (Alumno alumno : alumnos) {
                System.out.println(alumno);
            }

        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}

