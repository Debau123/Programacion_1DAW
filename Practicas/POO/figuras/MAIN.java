package figuras;
import java.util.ArrayList;
import java.util.Scanner;
public class MAIN {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<IFugura2D> figures = new ArrayList<>();

            int opcion;
            do {
                System.out.println("\nMenú:");
                System.out.println("1. Afegir figura");
                System.out.println("2. Mostrar informació de totes les figures");
                System.out.println("3. Escalar figures amb escala = 2");
                System.out.println("4. Mostrar informació de totes les figures després de l'escalat");
                System.out.println("5. Escalar figures amb escala = 0.1");
                System.out.println("6. Mostrar informació de totes les figures després de l'escala 0.1");
                System.out.println("7. Sortir");
                System.out.print("Escull una opció: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        afegirFigura(figures);
                        break;
                    case 2:
                        mostrarInformacio(figures);
                        break;
                    case 3:
                        escalarFigures(figures, 2);
                        break;
                    case 4:
                        mostrarInformacio(figures);
                        break;
                    case 5:
                        escalarFigures(figures, 0.1);
                        break;
                    case 6:
                        mostrarInformacio(figures);
                        break;
                    case 7:
                        System.out.println("Adeu!");
                        break;
                    default:
                        System.out.println("Opció no vàlida");
                }
            } while (opcion != 7);
        }

        public static void afegirFigura(ArrayList<IFugura2D> figures) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quina figura vols afegir?");
            System.out.println("1. Quadrat");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Cercle");
            System.out.print("Escull una opció: ");
            int opcio = scanner.nextInt();

            switch (opcio) {
               /* case 1:
                    System.out.print("Introdueix la mida del costat: ");
                    double costat = scanner.nextDouble();
                    figures.add(new Quadrat(costat));
                    break;*/
                case 2:
                    System.out.print("Introdueix l'ample: ");
                    double ample = scanner.nextDouble();
                    System.out.print("Introdueix l'altura: ");
                    double altura = scanner.nextDouble();
                    figures.add(new Rectangulo(ample, altura));
                    break;
                /*case 3:
                    System.out.print("Introdueix la base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Introdueix l'altura: ");
                    double alturaT = scanner.nextDouble();
                    figures.add(new Triangle(base, alturaT));
                    break;*/
                case 4:
                    System.out.print("Introdueix el radi: ");
                    double radi = scanner.nextDouble();
                    figures.add(new Cercle(radi));
                    break;
                default:
                    System.out.println("Opció no vàlida");
            }
        }

        public static void mostrarInformacio(ArrayList<IFugura2D> figures) {
            System.out.println("Informació de les figures:");
            for (IFugura2D figura : figures) {
                figura.imprimir();
            }
        }

        public static void escalarFigures(ArrayList<IFugura2D> figures, double escala) {
            for (IFugura2D figura : figures) {
                figura.escalar(escala);
            }
            System.out.println("Figures escalades amb èxit amb una escala de " + escala);
        }
    }


