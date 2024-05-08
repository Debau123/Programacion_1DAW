package veterinario;

public abstract class mascotas {

    protected String nombre;

    protected  int edad;
    protected String estado;
    protected String fechaNacimiento;


    public mascotas(String nombre, int edad, String estado, String fechaNacimiento){
        this.nombre=nombre;
        this.edad=edad;
        this.estado=estado;
        this.fechaNacimiento=fechaNacimiento;
    }

    public abstract String mostrar();

    public void cumpleasños(){
        System.out.println(nombre+" cumple "+edad+1+" el dia "+fechaNacimiento);
    }
    public void morir(){
        System.out.println(nombre+" a muerto a la edad de"+ edad);
    }
    public void habla(){
        System.out.println(nombre+" esta hablando");
    }

}
