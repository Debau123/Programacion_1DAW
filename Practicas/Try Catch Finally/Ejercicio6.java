import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Demanem al usuari que introdueixi el pes en grams
            System.out.print("Introdueix el pes en grams: ");
            String pesStr = scanner.nextLine();
            int pes = Integer.parseInt(pesStr); // Convertim l'string a un enter

            // Demanem al usuari que introdueixi el volum en litres
            System.out.print("Introdueix el volum en litres: ");
            String volumStr = scanner.nextLine();
            double volum = Double.parseDouble(volumStr); // Convertim l'string a un nombre de punt flotant

            // Calculem la densitat (pes / volum)
            double densitat = pes / volum;
            System.out.println("La densitat és: " + densitat);

        } catch (NumberFormatException e) {
            // Captura l'excepció si l'usuari introdueix un valor que no es pot convertir a enter o double
            System.err.println("Error: Siusplau, introdueix un nombre vàlid.");
            // Podries afegir un missatge més específic o les detalls de l'error, com e.getMessage()

        } catch (ArithmeticException e) {
            // Captura l'excepció si es produeix una divisió per zero
            System.err.println("Error: No es pot dividir per zero. Assegura't que el volum no és zero.");

        } finally {
            // Tancar el scanner
            scanner.close();
        }
    }
}

