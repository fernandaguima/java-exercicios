package exercicios.vetores;

public class vetores {
    public static void main(String[] args) {

        int[] vetor = {2, 4, 2, 1};
        int soma = 0; // variavel

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];

            System.out.println("A soma é: " + soma);
        }
    }
}
