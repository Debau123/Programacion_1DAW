package Empleados;

import Version2.Version2.Animal;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Empleado E1 = new Empleado("Rafa");
        Director D1 = new Director("Mario");
        Operario OP1 = new Operario("Alfonso");
        Oficial OF1 = new Oficial("Luis");
        Tecnico T1 = new Tecnico("Pablo");

        ArrayList<Empleado> Fichar = new ArrayList<>();
        Fichar.add(E1);
        Fichar.add(D1);
        Fichar.add(OP1);
        Fichar.add(OF1);
        Fichar.add(T1);

        for (Empleado Empleado : Fichar) {
            System.out.println(Empleado.toString());
        }
    }
}
