package exercicios.arrayList.Produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> produtos = new ArrayList<>();

        Product p1 = new Product("Mouse", 50.0, 2);

        Product p2 = new Product("Teclado", 100.0, 1);

        produtos.add(p1);
        produtos.add(p2);

        double totalGeral = 0;

        for (Product p : produtos) {
            totalGeral += p.calcularTotal();
        }
        System.out.println("Total geral: R$ " + totalGeral);
    }
}
