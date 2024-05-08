package VEHICULOS;

public abstract class vehiculo {

    // Atributos
    private final String matricula;
    private final String modelo;

    // Constructor
    public vehiculo(String matricula, String modelo)
    {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    // Getters
    public String getMatricula()
    {
        return matricula;
    }

    public String getModelo()
    {
        return modelo;
    }

    // Método abstracto para imprimir. Debe implementarse en todas las clases hijas.
    public abstract void imprimir();

}
