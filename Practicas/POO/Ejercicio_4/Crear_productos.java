package Ejercicio_4;

import java.util.Scanner;

public class Crear_productos {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);
        Productos producto_1= new Productos();
        System.out.println("Que nombre tiene el producto 1?");
       producto_1.nombre= Entrada.next();
        System.out.println(producto_1.nombre+ " cuantos productos quedan en el almacen ?");
        producto_1.stock =Entrada.nextInt();
        System.out.println("Que iva tiene el producto "+producto_1.nombre+" ?");
        producto_1.iva= Entrada.nextInt();
        System.out.println("Que precio tiene el producto "+producto_1.nombre);
        producto_1.preu =Entrada.nextDouble();
        producto_1.pvp = ((producto_1.preu* producto_1.iva)/ 100)+ producto_1.preu;
        System.out.println(producto_1.nombre+"- Precio:"+producto_1.preu+" - iva: "+producto_1.iva+" PVP:"+ producto_1.pvp );
        System.out.println("Nuevo precio ");
        producto_1.preu =Entrada.nextDouble();
        producto_1.pvp = ((producto_1.preu* producto_1.iva)/ 100)+ producto_1.preu;
        System.out.println(producto_1.nombre+"- Precio:"+producto_1.preu+" - iva: "+producto_1.iva+" PVP: "+ producto_1.pvp );

    }
}
