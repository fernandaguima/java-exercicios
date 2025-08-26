package exercicios.vetores;

public class vetoresSemana {
    public static void main(String[] args) {

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
//        for (int c = 0; c <=7; c++){
//            System.out.println("o dia " + c + " da semana é: " + semana[c]);
//        }
        String semana[] = new String[7];

        semana[0] = "domingo";
        semana[1] = "segunda";
        semana[2] = "terca";
        semana[3] = "quarta";
        semana[4] = "quinta";
        semana[5] = "sexta";
        semana[6] = "sabado";

        for (String dia : semana) {
            System.out.println("O dia da semana é " + dia);
        }
    }
}
