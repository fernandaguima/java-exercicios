package exercicios.POO.ProjetoFinalCurso;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];

        v[0] = new Video("Gatinhos fofos");

        Gafanhoto g[] = new Gafanhoto[2];

        System.out.println(v[0].toString());
        g[0] = new Gafanhoto("Theo", 18, "M", "theozinho");
        System.out.println(g[0].toString());
    }
}
