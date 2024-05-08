package Version2.Version2;
public class Gato extends Mamifero{

    private String pedigri;

    public Gato(int edad, String nombre, String tipo_alimentacion,int gestacion, String pedigri) {
        super(edad, nombre, tipo_alimentacion , gestacion);
        this.pedigri=pedigri;
    }

    public String toString(){
        return super.toString()+"\nPedigrí: "+this.pedigri;
    }
    
    public void maullar(){
        System.out.println("Miau");
    }

    public void cazarratones(boolean esCazador) {//esto deberia ser solo del gato
        //boolean cazar = true;
        if (esCazador) {
                System.out.println("Caza ratones");
            } else {
                System.out.println("Pacifista");
            }
    }

    public static int edadG(int edadG){
        edadG = 12;
        return edadG;
    }


}
