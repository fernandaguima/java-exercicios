package exercicios.arrayList.exercicios;

import java.util.ArrayList;

public class backontrack {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(4);
        numeros.add(6);

        for (int i = 0; i < numeros.size(); i++) {
            int valor = numeros.get(i);
            valor = valor + 1;
            numeros.set(i, valor);
            System.out.println(numeros.get(i));
        }
    }
}