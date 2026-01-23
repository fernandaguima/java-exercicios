package exercicios.arrayList.empresa;

public class Gerente extends Funcionario {
    //ele tem os atributos de funcionario
    @Override
    public double calcularSalario() {
        return salario + (salario * 0.2);
    }
}
