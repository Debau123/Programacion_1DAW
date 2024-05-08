package Ejercicio_8;


public class Creacion_gatos {
    public static void main(String[] args) {
        Gat gat_1= new Gat();
        Gat gat_2= new Gat();
        Gat gat_3= new Gat();
      /* try{
            gat_1.setEdat(3);
            gat_2.setEdat(1);
            gat_3.setEdat(-1);
        }catch (edadValida e){
            System.out.println("Problema : "+ e.getMessage());
        }
        try{
            gat_1.setNombre("Garfield");
            gat_2.setNombre("Vine");
            gat_3.setNombre("L");
        }catch (nombreValido e){
            System.out.println("Problema : "+ e.getMessage());
        }
        gat_1.imprimit();
        gat_2.imprimit();
        gat_3.imprimit();
*/
        try{
            gat_1.setEdat(3);
        }catch (Gat.edadValida e){
            System.out.println("Problema : "+ e.getMessage());
        }
        try{
            gat_1.setNombre("Garfield");
        }catch (Gat.nombreValido e){
            System.out.println("Problema : "+ e.getMessage());
        }
        gat_1.imprimit();



        try{
            gat_2.setEdat(3);
        }catch (Gat.edadValida e){
            System.out.println("Problema : "+ e.getMessage());
        }
        try{
            gat_2.setNombre("a");
        }catch (Gat.nombreValido e){
            System.out.println("Problema : "+ e.getMessage());
        }
        gat_2.imprimit();



        try{
            gat_3.setEdat(-1);

        }catch (Gat.edadValida e){
            System.out.println("Problema : "+ e.getMessage());
        }
        try{
            gat_3.setNombre("Lluna");
        }catch (Gat.nombreValido e){
            System.out.println("Problema : "+ e.getMessage());
        }
        gat_3.imprimit();



    }
}




