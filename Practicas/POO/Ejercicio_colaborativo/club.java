package Ejercicio_colaborativo;


public class club {

   private Socio socio1, socio2, socio3;

   public club(){
      socio1= new Socio();
      socio2= new Socio();
      socio3= new Socio();

   }
   public void antiguo(){
      if(socio1.getAntiguedad()>= socio2.getAntiguedad()&socio1.getAntiguedad()>=socio3.getAntiguedad()){
         System.out.println(socio1.getNombre());
      } else if (socio2.getAntiguedad()>= socio3.getAntiguedad()){
         System.out.println(socio2.getNombre());
      }else {
         System.out.println(socio3.getNombre());
      }
   }

   public static void main(String[] args) {
      club tenis = new club();
      tenis.antiguo();
   }


}









