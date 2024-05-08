package VEHICULOS;

public class Helicoptero extends aereo {
    private int numDeHelices;

    public Helicoptero(String matricula,String model,int numeroSeients,int numDeHelices){
        super(matricula, model,numeroSeients);
        this.numDeHelices = numDeHelices;
    }
    public int getnumDeHelices(){
        return numDeHelices;
    }

    public  void imprimir(){
        super.imprimir();
        System.out.println("El numero de helices es: " + getnumDeHelices());
    }


}