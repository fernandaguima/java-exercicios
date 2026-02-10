package exercicios.arrayList.exercicios;

import java.util.ArrayList;

public class fixacao {
    public static void main(String[] args) {

//        ArrayList<Integer> numeros = new ArrayList<>();
//
//        numeros.add(4);
//        numeros.add(7);
//        numeros.add(2);
//
//        for (Integer n : numeros) {
//            System.out.println(n);
//        }

//        ArrayList<Integer> numeros = new ArrayList<>();
//
//            numeros.add(1);
//            numeros.add(3);
//            numeros.add(5);
//
//            for (int i = 0; i < numeros.size(); i++) {
//                int valor = numeros.get(i);
//                valor = valor + 2;
//                numeros.set(i, valor);
//                System.out.println(numeros.get(i));
//            }

//        ArrayList<Integer> numeros = new ArrayList<>();
//
//        numeros.add(2);
//        numeros.add(6);
//        numeros.add(4);
//        numeros.add(9);
//
//        for (int i = 0; i < numeros.size(); i++) {
//            int valor = numeros.get(i);
//            if (valor % 2 == 0) {
//                valor = valor + 5;
//                numeros.set(i, valor);
//            }
//            System.out.println(numeros.get(i));
//        }

//        ArrayList<Integer> numeros = new ArrayList<>();
//
//        numeros.add(3);
//        numeros.add(8);
//        numeros.add(1);
//        numeros.add(10);
//
//        ArrayList<Integer> lista = new ArrayList<>();
//
//        for (Integer n : numeros) {
//            if (n > 5) {
//                lista.add(n);
//            }
//        }
//        System.out.println(lista);

//        ArrayList<Integer> notas = new ArrayList<>();
//
//        notas.add(6);
//        notas.add(4);
//        notas.add(8);
//        notas.add(3);
//
//        int soma = 0;
//
//        for (Integer n : notas) {
//            if (n % 2 == 0) {
//                soma = soma + n;
//                System.out.println(n);
//            }
//        }

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(9);
        numeros.add(2);
        numeros.add(15);
        numeros.add(1);

        int maior = 5;

        for (Integer n : numeros) {
            if (n > maior) {
                maior = n;
            }
        }
        System.out.print("O número maior é " + maior);
    }
}
