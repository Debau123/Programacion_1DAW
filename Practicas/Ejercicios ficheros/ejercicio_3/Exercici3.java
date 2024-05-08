import java.io.File;

/*
 * Mètodes de la classe FILE:
 * renameTo()
 * File[] listFiles()
 *
 * Mètodes de la classe ARRAYS
 * sort()
 *
 * Per imprimir els axrius i directoris de manera ordenada, crearem una funció anomenada imprimirLlistaArxius()
 * Per esborrar les extensions crearem una funció anomenada llevarExtensionsArxius()
 *
 */

public class Exercici3 {

    /* **************************
     * Reanomenem les carpetes *
     * **************************/

    // Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta destí. (PER A LA CARPETA DOCUMENTS)
        public static void main (String args[]) {



        File docOrigen = new File("Documentos");
        File docDesti = new File("DOCS");

        // Comprovem que la carpeta Documents està creada, simplement és per acotar errors
        if(!docOrigen.exists())
        System.out.println("COMPROVA QUE LA CARPETA DOCUMENTS ESTA CREADA I LA RUTA ES CORRECTA");

        // Reanomenem la carpeta Documents
        //CODI A COMPLETAR
        boolean exito = docOrigen.renameTo(docDesti);
        if(exito){
            System.out.println("Se a renombrado con exito");
        }else{
            System.out.println("No se a renombrado");
        }

        // Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta destí.
        // (PER A LA CARPETA FOTOGRAFIAS) i canviem el nom
        //CODI A COMPLETAR

        File fotoOrigen = new File("Fotos");
        File fotoDesti = new File("DOCS/Fotos");
        boolean comprobacion = fotoOrigen.renameTo(fotoDesti);
        if (comprobacion) {
            System.out.println("Se a renombrado con exito");
        } else {
            System.out.println("No se a renombrado");

            // Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta destí. // (PER A LA CARPETA LIBROS) i canviem el nom
            // CODI A COMPLETAR

            File librosOrigen = new File("DOCS/Libros");
            File librosDesti = new File("DOCS/Cuentos");
            boolean prueba = librosOrigen.renameTo(librosDesti);
            if (prueba) {
                System.out.println("Se a renombrado con exito");
            } else {
                System.out.println("No se a renombrado");

                /* **********************************************************
                 *  Llevem les extensions en FOTOS (REANOMENTANT ELS ARXIUS)
                 ********************************************************** */
                mostrarInfoRuta(docDesti);

                mostrarInfoRuta(fotoOrigen);

                // ABANS d'eliminar les extensions, imprimim la llista d'arxius ordenada cridant a la funció imprimirLlistaArxius()
                //CODI A COMPLETAR

                // Reanomenem els arxius, llevant les Extensions cridant a la funció llevarExtensionsArxius()
                // CODI A COMPLETAR

                // DESPRÉS d'eliminar les extensions, imprimim de nou la llista d'arxius ordenadacridant a la funció imprimirLlistaArxius()
                // CODI A COMPLETAR

            } // del main()



            /*
             * IMPRIMIR LLISTA ARXIUS
             *
             */
//CODI A COMPLETAR

            /*
             *
             * LLEVAR EXTENSIONS ARXIUS
             *
             */
//CODI A COMPLETAR


        }}
    public static void mostrarInfoRuta (File ruta){
        String []archivos = ruta.list();
        for(String archivo:archivos){
            System.out.println( archivo);
        }
    }

    public static void QuitarExtension (File ruta){
         for (File f: ruta.listFiles()){
             String [] TrossetsArxius = f.getName().split("\\.");

         }

    }





}









// de la classe