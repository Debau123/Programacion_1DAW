

package veterinario;

public class Canario extends Aves{

    private String color;
    private boolean canta ;



    public Canario(String nombre, int edad, String estado, String fechaNacimiento,String pico, boolean vuela, String color, boolean canta) {
        super(nombre, edad, estado, fechaNacimiento,pico,vuela );
        this.color =color;
        this.canta = canta;
    }


    @Override
    public String mostrar() {
        return "El canario "+nombre+" con la edad de: "+edad+" que nacio el: "+fechaNacimiento+"que se encuentra: "+estado+" de pico:  "+pico +" que puede volar: " +vuela+
        "de color: "+color+" que puede cantar: "+canta;
    }
    public void hablar (){
        System.out.println("el canario " +nombre+" habla ");

    }
    public  String volar(){
        return"el canario "+ nombre+ " esta volando";
    }

}