package exercicios.arrayList;

import java.util.ArrayList;

public class nomes {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<String>();

        nomes.add("Goku");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Vegeta");
        nomes.add("Bob Esponja");

       // System.out.println(nomes); //esse imprime todos juntos

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
