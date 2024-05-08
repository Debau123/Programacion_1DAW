package ejercicio_banco;

public class Cliente {
    private String nombre;
    private double monto;

    public Cliente (String nombreC){
        this.nombre= nombreC;
        this.monto=0.0;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getMonto(){
        return  this.monto;
    }
    public void  depositar(double cantidad){
        this.monto += cantidad;
    }
    public void  extraer(double cantidad){
        this.monto -=  cantidad;
    }
    public void imprimir(){
        System.out.println(this.nombre+" tiene en el deposito: "+this.getMonto());
    }


}
