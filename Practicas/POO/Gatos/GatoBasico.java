package Gatos;

public class GatoBasico {
    private String color;
    private String raza;
    private int edad;
    private char sexo;
    private double peso;

    public GatoBasico( String color, String raza, int edad, char sexo, double peso) {

        this.color=color;
        this.raza=raza;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
    }
    public void pelear(GatoBasico otroGato) {
        if (this.sexo == 'M' && otroGato.sexo == 'M') {
            System.out.println("Los gatos se pelearan.");
        } else {
            System.out.println("Estos gatos no se pelearan.");
        }
    }
    public static void miau(){

        System.out.println("El gato maulla");
    }
    public static void ronronea(){
        System.out.println("El gato ronronea");
    }
    public static void come (){
        System.out.println("El gato come");
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

}
