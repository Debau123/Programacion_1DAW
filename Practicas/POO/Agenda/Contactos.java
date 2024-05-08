package agenda;

public class Contactos {
    private  String telefono;
    private long DNI;
    private String Nombre;
    private String Apellidos;
    private String Email;

    public Contactos(long DNI, String Nombre, String Apellidos, String Email, String telefono) {

        this.DNI= DNI;
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.Email=Email;
        this.telefono=telefono;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public long getDNI() {
        return DNI;
    }

    public String getEmail() {
        return Email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setEmail(String email) {
        Email = email;
    }
    public void imprimir(){
        System.out.println("EL "+getNombre()+" "+getApellidos()+" con DNI "+getDNI()+" con email "+getEmail()+" con telefono "+getTelefono());
    }

}

