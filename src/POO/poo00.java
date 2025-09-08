package POO;

public class poo00 {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();

        c1.cor = "azul";
        // c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        // cuidado com a ordem de chamada pelo amor d deus
    }
}
