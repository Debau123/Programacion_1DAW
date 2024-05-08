package Ejercicio_10;


import grupal.comprobar_dinero;

public class cuenta {

    private double saldo;

    public void setSaldo(double saldo) throws grupal.comprobar_dinero {
        if (saldo > 0) {
            this.saldo = saldo;
            System.out.println(" Tu saldo es "+saldo);

        } else throw new grupal.comprobar_dinero("El dinero tiene que ser positivo  ");

    }

    public double getSaldo()  {
        return saldo;
    }
    public void sacarDinero(int sacar)  throws grupal.comprobar_dinero {

        if (saldo>sacar){
            saldo = saldo -sacar;
            System.out.println(" Has sacado "+ sacar+" tienes en la cuenta "+saldo);
        } else throw new comprobar_dinero("Saldo Insuficiente   ");

    }
    public void ingresarDinero(int dinero){
        saldo = saldo + dinero;
    }


}
