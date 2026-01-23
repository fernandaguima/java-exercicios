package exercicios.POO.dolivro.modulo1.exercicio01;

public class Apolice {

    String nome;
    int idade;
    double valorPremio;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Valor Prêmio : " + this.valorPremio);
    }

    public void calcularPremioApolice() {
        if ((this.idade >=18) && (this.idade <=25)) {
            this.valorPremio += (this.valorPremio * 20) / 100;
        }

        if ((this.idade > 25) && (this.idade <= 36)) {
            this.valorPremio += (this.valorPremio * 15) / 100;
        }

        if (this.idade > 36) {
            this.valorPremio += (this.valorPremio * 10) / 100;
        }
    }

    public void oferecerDesconto(String nomeCidade) {
        if (nomeCidade.equals("Curitiba")) {
            this.valorPremio -= (this.valorPremio * 20) / 100;
        }
        if (nomeCidade.equals("Rio de Janeiro")) {
            this.valorPremio -= (this.valorPremio * 15) / 100;
        }
        if (nomeCidade.equals("São Paulo")) {
            this.valorPremio -= (this.valorPremio * 10) / 100;
        }
        if (nomeCidade.equals("Belo Horizonte")) {
            this.valorPremio -= (this.valorPremio * 5) / 100;
        }
    }


}
