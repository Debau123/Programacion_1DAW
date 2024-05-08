package DeparBankV2;

import java.util.Scanner;
public class DeparBankV2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            CompteBancariV2 cuenta;

            do {
                System.out.print("Introduzca numero IBAN: ");
                String iban = sc.nextLine();
                System.out.print("Introduzca titular de cuenta: ");
                String titular = sc.nextLine();
                cuenta = new CompteBancariV2(iban, titular);
            } while (!cuenta.getValida());

            int opcion;
            double cantidad;

            do {
                System.out.println("Elija una opción:");
                System.out.println("1. Datos de la cuenta.");
                System.out.println("2. Saldo.");
                System.out.println("3. Ingreso.");
                System.out.println("4. Retirada.");
                System.out.println("5. Movimientos.");
                System.out.println("6. Salir.");

                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        cuenta.imprimirDatos();
                        break;
                    case 2:
                        System.out.println("Saldo: " + cuenta.getSaldo());
                        break;
                    case 3:
                        System.out.print("Inserte cantidad a ingresar: ");
                        cantidad = sc.nextDouble();
                        try {
                            cuenta.ingresar(cantidad);
                            System.out.println("Ingreso realizado correctamente.");
                        } catch (CompteException | AvisarHisendaException e) {
                            System.out.println("Error: " + e.getMessage());
                            e.printStackTrace();

                        }
                        break;
                    case 4:
                        System.out.print("Inserte cantidad a retirar: ");
                        cantidad = sc.nextDouble();
                        try {
                            cuenta.retirar(cantidad);
                            System.out.println("Retirada realizada correctamente.");
                        } catch (CompteException | AvisarHisendaException e) {
                            System.out.println("Error: " + e.getMessage());
                            e.printStackTrace();

                        }
                        break;
                    case 5:
                        cuenta.imprimirMovimientos();
                        break;
                    case 6:
                        System.out.println("GRACIAS POR USAR NUESTRA APLICACION.");
                        break;
                    default:
                        System.out.println("Opción elegida incorrecta.");
                        break;
                }
            } while (opcion != 6);
            sc.close();
        }
    }






