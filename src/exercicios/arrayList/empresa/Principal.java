package exercicios.arrayList.empresa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Gerente g1 = new Gerente();
        g1.nome = "Theo";
        g1.salario = 3000;

        funcionarios.add(g1);

        for (Funcionario f : funcionarios) {
            System.out.println(f.nome);
            System.out.println(f.calcularSalario());
        }
    }
}
