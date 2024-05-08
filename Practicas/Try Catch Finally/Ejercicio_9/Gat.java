package Ejercicio_9;

public class Gat {
    private int edat;
    private String nombre;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)throws nombreValido {
        if (nombre.length() > 3) {
            this.nombre =nombre;
        } else throw new nombreValido("El nombre no es valido ");
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) throws edadValida {
        if (edat>0){
            this.edat=edat;
        }else throw  new edadValida("La edad no puede ser negativa");
    }
    public void imprimit(){

        System.out.println("El gato se llama "+ getNombre()+ " tiene la edad de "+ getEdat());
    }
    public static class edadValida extends Exception {

        public edadValida() {
            super();
        }

        public edadValida(String msg) {
            super(msg);
        }

    }
    public static class nombreValido extends Exception {

        public nombreValido() {
            super();
        }

        public nombreValido(String msg) {
            super(msg);
        }

    }




}
