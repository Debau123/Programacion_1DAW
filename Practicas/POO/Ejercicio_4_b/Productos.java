package Ejercicio_4_b;

public class Productos {

    String nom;
    double preu;
    int iva;
    int quantsQueden;

    public  Productos (int iva, int preu, String nom, int stock ){

        if (iva ==21){
            this.iva = iva;}
        else {
            System.err.println("ERROR iva tiene que ser 21% ");
        }
        if (preu>0){
            this.preu= preu;
        }
        else{
            System.err.println("El precio tiene que ser positivo");}
        this.nom= nom;
        if(stock>0){
            this.quantsQueden = stock;
        }
        else{
            System.err.println("El stock tiene que ser positivo");}




    }



}