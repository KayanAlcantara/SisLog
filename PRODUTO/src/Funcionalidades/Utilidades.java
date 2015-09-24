package Funcionalidades;

import java.util.*;

public class Utilidades {

    public static String lerString() {
        Scanner leitor = new Scanner(System.in);
        String ler;
        ler = leitor.nextLine();
        return ler;
    }

    public static int lerInt() {
        Scanner leitor = new Scanner(System.in);
        int ler;
        ler = leitor.nextInt();
        return ler;
    }
}
