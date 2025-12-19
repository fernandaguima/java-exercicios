package exercicios.POO.polimorfismo.Aula012;

public class Principal12 {
    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(78.5);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        //polimorfismo de sobreposição acontece quando
        // substituimos um metodo de uma superclasse na sua subclasse
        // usando a mesma assinatura
    }
}
