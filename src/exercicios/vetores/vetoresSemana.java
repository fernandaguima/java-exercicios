package exercicios.vetores;

public class vetoresSemana {
    public static void main(String[] args) {

        String semana[] = new String[7];

        semana[0] = "domingo";
        semana[1] = "segunda";
        semana[2] = "terca";
        semana[3] = "quarta";
        semana[4] = "quinta";
        semana[5] = "sexta";
        semana[6] = "sabado";

        //deu erro quando coloquei <=6 porque ele rodava ate o -1 dava erro pq n tem -1 entao tem q ser >=0 porque ele vai parar quando chegar no 0
        for (int c = 6; c >=0; c--){
            System.out.println("o dia " + c + " da semana é: " + semana[c]);
        }











//        String semana[] = new String[7];
//
//        semana[0] = "domingo";
//        semana[1] = "segunda";
//        semana[2] = "terca";
//        semana[3] = "quarta";
//        semana[4] = "quinta";
//        semana[5] = "sexta";
//        semana[6] = "sabado";
//
//        for (String dia : semana) {
//            System.out.println("O dia da semana é " + dia);
//        }
    }
}
