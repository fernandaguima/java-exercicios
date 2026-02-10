package exercicios.arrayList.exercicios;

import java.util.ArrayList;

public class exercicio06 {
    public static void main(String[] args) {

//        ArrayList<Integer> numeros = new ArrayList<>();
//
//        numeros.add(3);
//        numeros.add(4);
//        numeros.add(7);
//        numeros.add(10);
//        numeros.add(2);
//
//        for (int i = 0; i < numeros.size(); i++) {
//            int valor = numeros.get(i);
//            if (valor % 2 == 0) {
//                valor = valor + valor;
//                System.out.println(numeros);
//            }
//        }

        ArrayList<Integer> n = new ArrayList<>();

        n.add(5);
        n.add(9);
        n.add(2);
        n.add(15);
        n.add(1);

        int maior = n.get(0);

        for (int i = 0; i < n.size(); i++) {
            if (i > maior) {
                System.out.println(maior + "é maior");
            }
        }
    }
}
