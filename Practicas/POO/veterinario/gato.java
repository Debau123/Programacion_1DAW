package veterinario;

public class gato extends mascotas{

    private String color;
    private boolean peloLargo;



    public gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color =color;
        this.peloLargo = peloLargo;
    }


    @Override
    public String mostrar() {
        return "El gato "+nombre+" con la edad de: "+edad+" que nacio el: "+fechaNacimiento+"que se encuentra: "+estado+" de color  "+color+" tiene el pelo largo "+peloLargo;
    }
    @Override
    public void habla(){
        System.out.println(nombre+" hace miau miau ");

    }

}