package Juegos;

import java.io.*;
public class Teclat {
    public static char lligCaracter() {
        char ch;
        try {
            ch = lligCadena().charAt(0);
        } catch( Exception e ) {
            ch = 0;
        }
        return ch;
    }
    public static String lligCadena() {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            str = br.readLine();
        } catch( Exception e ) {
            str = "";
        }
        return str;
    }
    public static int lligEnter() {
        int num;
        try {
            num = Integer.parseInt( lligCadena().trim() );
        } catch( Exception e ) {
            num = 0;
        }
        return num;
    }
} //Per provar el funcionament, recorda: Teclat.lligCadena(); etc.