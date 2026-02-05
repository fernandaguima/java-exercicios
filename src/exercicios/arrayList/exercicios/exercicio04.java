package exercicios.arrayList.exercicios;

import java.util.ArrayList;

public class exercicio04 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(8);
        numeros.add(1);
        numeros.add(10);

        ArrayList<Integer> lista = new ArrayList<>();

        for (Integer n : numeros) {
            if (n > 5) {
                lista.add(n);
                System.out.println(n);
            }
        }
    }
}
