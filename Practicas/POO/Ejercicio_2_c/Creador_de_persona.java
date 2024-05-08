package Ejercicio_2_c;


public class Creador_de_persona {
    public static void main(String[] args) {

    Persona P1= new Persona();

    P1.setNom("Javier");
    P1.setCognoms("Fuentes");
    P1.setDni("45801252h");
    P1.setEdat(33);
        System.out.println(P1.getNom()+ " con apellido "+P1.getCognoms()+" con edad "+P1.getEdat()+" CON DNI : "+P1.getDni()
        );




    }






}
