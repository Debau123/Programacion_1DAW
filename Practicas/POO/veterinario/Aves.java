package veterinario;

public abstract class Aves extends mascotas {
    protected  String pico;
    protected  boolean vuela;

    public Aves(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela){

        super(nombre, edad, estado, fechaNacimiento);
        this.pico=pico;
        this.vuela=vuela;
    }
    public abstract String mostrar();
    public  String volar(){
        return nombre+ " esta volando";
    }



}
