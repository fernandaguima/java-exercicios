package exercicios.arrayList.exercicios;

import java.util.ArrayList;

public class exercicio02 {
    public static void main(String[] args) {

        ArrayList<String> cores = new ArrayList<>();

        cores.add("azul");
        cores.add("vermelho");
        cores.add("verde");

        for (String c : cores) {
            if (c.equals("verde")) {
                System.out.println(c);
            }
        }
    }
}
