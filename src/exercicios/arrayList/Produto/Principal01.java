package exercicios.arrayList.Produto;

import java.util.ArrayList;
import java.util.List;

public class Principal01 {
    public static void main(String[] args) {

        List<Produto01> produtos = new ArrayList<>();

        Produto01 p1 = new Produto01("Caderno", 20.0, 1);
        Produto01 p2 = new Produto01("Borracha", 3.0, 2);
        Produto01 p3 = new Produto01("Caneta", 5.0, 3);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        double totalGeral = 0;

        for (Produto01 p : produtos) {
            System.out.println(p.getNome() + " - " + p.calcularTotal());
            if (p.getQuant() > 1) {
                totalGeral += p.calcularTotal();
                System.out.println(totalGeral);
            }
        }
    }
}
