package exercicios.arrayList.Produto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto("Mouse", 50.0, 2);

        produtos.add(p1);

        Produto p2= new Produto("Teclado", 100.0, 1);

        produtos.add(p2);

        double totalGeral = 0;

        for (Produto produto : produtos) {
            totalGeral += produto.calcularTotal();
        }
        System.out.println(totalGeral);
    }
}
