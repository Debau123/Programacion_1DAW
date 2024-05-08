package Ejercicio_array_conjunto;

public class videojuego {
    private String nombre;
    private String genero;
    private int precio;

    public videojuego(String nombre, String genero, int precio) {
        nombre = this.nombre;
        genero = this.genero;
        precio = this.precio;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getPrecio() {
        return precio;
    }
    public void imprimir(){
        System.out.println("El videojuego es :"+this.nombre+" del genero "+this.genero+" con un precio "+this.precio);

    }
}

