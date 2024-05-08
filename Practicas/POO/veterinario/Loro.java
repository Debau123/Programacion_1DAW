package veterinario;



public class Loro extends Aves{

    private String origen;
    private boolean habla ;



    public Loro(String nombre, int edad, String estado, String fechaNacimiento,String pico, boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento,pico,vuela );
        this.origen =origen;
        this.habla = habla;
    }


    @Override
    public String mostrar() {
        return "El loro "+nombre+" con la edad de: "+edad+" que nacio el: "+fechaNacimiento+"que se encuentra: "+estado+" de pico:  "+pico +" que puede volar: " +vuela+
                "de origen: "+origen+" que puede hablar: "+habla;
    }
    public void saluda (){
        System.out.println("el loro " +nombre+" saluda ");

    }
    public  String volar(){
        return"el loro "+ nombre+ " esta volando";
    }

}