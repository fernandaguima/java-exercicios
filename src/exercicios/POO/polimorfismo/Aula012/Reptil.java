package exercicios.POO.polimorfismo.Aula012;

public class Reptil extends Animal {

    public String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Fazendo som de réptil");
    }
}
