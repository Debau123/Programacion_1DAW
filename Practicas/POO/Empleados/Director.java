package Empleados;

public class Director extends Empleado {


        public Director(String nombre){

            super(nombre);
        }

        public String toString(){
            return super.toString()+" -> Director";
        }
    }


