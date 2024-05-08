package ejercicio_banco;

public class Banco {
    private Cliente cliente1, cliente2, cliente3;
    private String nombre;
    public Banco (String nombreb){
        this.nombre= nombreb;
        cliente1= new Cliente("Javier");
        cliente2=new Cliente("Pablo");
        cliente3= new Cliente("Iñaki");
    }
    public void operar(){
        cliente1.depositar(500);
        cliente2.depositar(1160);
        cliente3.depositar(50);
        double cant =120;

        if (cant < cliente2.getMonto()){
        cliente2.extraer(120);
    }}
    public void depositosTotales(){

        double total = cliente1.getMonto() + cliente2.getMonto()+ cliente3.getMonto();
        System.out.println("En el cierre de caja hay"+ total+" en el banco "+this.nombre);

        cliente2.imprimir();
        cliente3.imprimir();
        cliente1.imprimir();


    }

    public static void main(String[] args) {
        Banco banco= new Banco ("Caixa Molt Rural");
        banco.operar();
        banco.depositosTotales();

    }
}
