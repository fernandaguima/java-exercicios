package POO;

public class Caneta {
    // esses sao os atributos, nas minhas anotacoes no caderno sao tipo os exemplos de nome, idade e altura
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("A carga é: " + this.carga);
        System.out.println("A cor da caneta é " + this.cor);
        System.out.println("A ponta da caneta é de " + this.ponta);
        System.out.println("A caneta está tampada? " + this.tampada);

    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Está tampada. Não dá para rabiscar.");
        } else {
            System.out.println("Rabiscando.");
        }

    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }




}
