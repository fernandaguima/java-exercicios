package exercicios.arrayList.exercicios;

import java.util.ArrayList;

public class exercicio03 {
    public static void main(String[] args) {

        ArrayList<Integer> idades = new ArrayList<>();

        idades.add(15);
        idades.add(18);
        idades.add(21);
        idades.add(16);

        for (Integer i : idades) {
            if (i >= 18) {
                System.out.println(i);
            }
        }
    }
}
