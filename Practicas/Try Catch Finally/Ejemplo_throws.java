public class Ejemplo_throws {
                                                          public static void main(String[] args) {
       try{
        a();
        System.out.println("Estoy rn la principal");}
       catch ( InterruptedException ie){
           System.err.println(ie.getMessage());
       }

    }

    public static  void a() throws InterruptedException{
        System.out.println();
        b();
        System.out.println("Estoy en A");

    }
    public static  void b()throws InterruptedException{
        System.out.println();
        c();
        System.out.println("Estoy en B");
    }
    public static  void c() throws InterruptedException{
        System.out.println("Estoy en C");
        throw new InterruptedException("Excepcion en el el metodo A");
    }
}
