package exercicios.arrayList.exercicios;

import java.util.ArrayList;

public class exercicio01 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(7);
        numeros.add(10);
        numeros.add(2);

        for (Integer n : numeros) {
            if (n > 5) {
                System.out.println(n);
            }
        }
    }
}