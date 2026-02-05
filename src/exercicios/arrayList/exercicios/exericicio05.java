package exercicios.arrayList.exercicios;

import java.util.ArrayList;

public class exericicio05 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);

        for (int  i = 0; i < numeros.size(); i++) {
            int valor = numeros.get(i);
            if (valor < 5) {
                valor = valor + 10;
                numeros.set(i, valor);
            }
            System.out.println(numeros);
        }
    }
}
