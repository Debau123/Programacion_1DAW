package Version2.Version2;

public class Perro extends Mamifero{

       private String raza;

       public Perro(int edad, String nombre, String tipo_alimentacion, int gestacion, String raza) {
           super(edad, nombre, tipo_alimentacion, gestacion);
           this.raza = raza;
       }

       public String toString(){
           return super.toString()+"\nRaza: "+this.raza;
       }
   
        public void ladrar(){
            System.out.println("Guau");
        }
    public static int edadP(int edadP){
        edadP = 18;
        return edadP;
    }

}
