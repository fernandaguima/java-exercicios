package exercicios.arrayList.Produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> produtos = new ArrayList<>();

        Product p1 = new Product("Mouse", 50.0, 2);

        Product p2 = new Product("Teclado", 100.0, 1);

        Product p3 = new Product("Monitor", 800.0, 3);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        double totalGeral = 0;

        for (Product p : produtos) {
            if (p.getPreco() > 60 && p.getQuant() > 1) {
                totalGeral += p.calcularTotal();
            }
        }
        System.out.println("Total geral: R$ " + totalGeral);
    }
}
