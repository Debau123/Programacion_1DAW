package Empleados;

public class Empleado {
    private String nombre;

    public Empleado(String nombre){
        this.nombre=nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String toString(){
        return "\nEmpleado: ->"+nombre;
    }
}
