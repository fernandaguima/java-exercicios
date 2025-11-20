package exercicios.revisando.exercicio181e182;

public class Apolice {

    String nomeSegurado;
    int idade;
    double valorPremio;

    public void imprimir() {
        System.out.println("Nome: " + this.nomeSegurado);
        System.out.println("Idade: " + this.idade);
        System.out.println("Valor: " + this.valorPremio);
    }

    public void calcularPremioApolice() {
        if ((this.idade >=18) && (this.idade <= 25)) {
            this.valorPremio += (this.valorPremio * 20) / 100;
        }
        if ((this.idade >= 25) && (this.idade <=36)) {
            this.valorPremio += (this.valorPremio * 15) / 100;
        }
        if (this.idade >=36) {
            this.valorPremio += (this.valorPremio * 10) / 100;
        }
    }

    public void oferecerDesconto(String cidade) {
        if (cidade.equals("Curitiba")) {
            this.valorPremio -= (this.valorPremio * 20) / 100;
        }
        if (cidade.equals("Rio de Janeiro")) {
            this.valorPremio -= (this.valorPremio * 15) / 100;
        }
        if (cidade.equals("São Paulo")) {
            this.valorPremio -= (this.valorPremio * 10) / 100;
        }
        if (cidade.equals("Belo Horizonte")) {
            this.valorPremio -= (this.valorPremio * 5) / 100;
        }
    }
}
