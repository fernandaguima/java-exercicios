package POO;

public class Caneta3 {
    public static void main(String[] args) {

        Caneta2 p2 = new Caneta2();
        // se eu fizesse sem o setter ia funcionar pq eh publico
        p2.setModelo("BIC Cristal");
        p2.setPonta(0.7f);
        p2.status();



    }
}
