package Ejercicio_colaborativo;

import java.util.Scanner;

public class Socio {

    private String Nombre;
    private int Antiguedad;

    public Socio(  ){
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Dime el nombre?");
        String nombre = Entrada.next();
        Nombre = nombre;
        System.out.println("Dime la edad?");
        int edad =Entrada.nextInt();
        this.Antiguedad=edad;

    }

    public void setNombre() {
        System.out.println("Dime el nombre?");
        Scanner Entrada = new Scanner(System.in);
        String nombre = Entrada.next();
        Nombre = nombre;
        this.Antiguedad= this.Antiguedad;
    }
    public void setEdad(){
        System.out.println("Dime la edad?");
        Scanner Entrada = new Scanner(System.in);
        int edad =Entrada.nextInt();
        this.Antiguedad=edad;
        this.Nombre=this.Nombre;

    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void imprimir(){
        System.out.println("El socio se llama "+ getNombre()+ " tiene antiguedad "+ getAntiguedad());


    }
}
