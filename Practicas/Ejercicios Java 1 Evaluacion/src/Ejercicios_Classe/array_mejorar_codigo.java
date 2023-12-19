package Ejercicios_Classe;
import java.util.Arrays;
import java.util.Scanner;

public class array_mejorar_codigo {
    public static void main(String[] args) {


                Scanner teclat = new Scanner(System.in);
                int midaMax, midaMin=0;
                boolean v1Llarg = false;

                System.out.println("Introdueix la mida del 1r vector");
                int[] array1 = new int[teclat.nextInt()];
                //Emplenem array 1 amb valors aleatoris
                for (int i=0; i < array1.length; i++)
                {
                    //Per simplificar valors entre 0 i 20
                    array1[i]=(int) (Math.random()*(20+1));
                }

                System.out.println("Introdueix la mida del 2n vector");
                int[] array2 = new int[teclat.nextInt()];
                //Emplenem array 2 amb valors aleatoris
                for (int i=0; i < array2.length; i++)
                {
                    //Per simplificar valors entre 0 i 20
                    array2[i]=(int) (Math.random()*(20+1));
                }

                //Comprovem quin dels dos arrays es mes gran, i aquesta serà la mida del 3r vector
                if (array1.length >= array2.length)
                {
                    midaMax = array1.length;
                    midaMin = array2.length;
                    v1Llarg = true;
                }
                else
                {
                    midaMax = array2.length;
                    midaMin = array1.length;
                }
                int[] arrayMax = new int[midaMax];

                //Emplenem el nou array, fins la mida del vector més xicotet perquè si no, ens eixim de rang
                for (int index=0; index < midaMin; index++)
                {
                    //Comprovem quin dels dos valors és major
                    if (array1[index]>=array2[index])
                        arrayMax[index]=array1[index];
                    else
                        arrayMax[index]=array2[index];
                }
                //System.out.println("Index:"+index);
                //Si tenim un vector més llarg, hem de copiar els valors que no hem "visitat" al nou vector
                if (midaMax!=midaMin) {
                    if (v1Llarg)
                    {
                        //recorrem array1 des d'on ens hem quedat
                        for (int pos=midaMin;pos<array1.length;pos++)
                        {
                            arrayMax[pos]=array1[pos];
                        }
                    }
                    else {
                        //recorrem array2 des d'on ens hem quedat
                        for (int pos=midaMin;pos<array2.length;pos++)
                        {
                            arrayMax[pos]=array2[pos];
                        }
                    }
                }

                System.out.println("Array 1:"); // System.out.println(Arrays.toString(array1));
                for (int i=0; i < array1.length; i++)
                {
                    System.out.print("["+array1[i]+"]");
                }
                System.out.println("\nArray 2:"); //System.out.println(Arrays.toString(array2));
                for (int i=0; i < array2.length; i++)
                {
                    System.out.print("["+array2[i]+"]");
                }
                System.out.println("\nArray 3:"); //System.out.println(Arrays.toString(array3));
                for (int i=0; i < arrayMax.length; i++)
                {
                    System.out.print("["+arrayMax[i]+"]");
                }

            }
        }

