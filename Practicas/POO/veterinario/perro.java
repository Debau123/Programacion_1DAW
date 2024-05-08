package veterinario;

public class perro extends mascotas{

    private String raza;
    private boolean pulgas;



    public perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza =raza;
        this.pulgas = pulgas;
    }


    @Override
    public String mostrar() {
        return "El perro "+nombre+" con la edad de: "+edad+" que nacio el: "+fechaNacimiento+"que se encuentra: "+estado+" de la raza "+raza+" tiene pulgas "+pulgas;
    }
    @Override
    public void habla(){
        System.out.println(nombre+" hace guau guau ");

    }

}
