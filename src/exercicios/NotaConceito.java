package exercicios;
import java.util.Scanner;
// 28 de julho de 2025
public class NotaConceito {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite a nota:");
        double nota = teclado.nextDouble();

        if (nota >=9 && nota <=10) {
            System.out.println("A"); }
        else if (nota >=7 && nota <9) {
            System.out.println("B");
        } else if (nota >=5 && nota <7) {
            System.out.println("C");
        } else if (nota >=3 && nota <5) {
            System.out.println("D");
        } else if (nota >=0 && nota <3) {
            System.out.println("E");
        } else //ele depende de um if ou else if antes dele pq se nenhum for verdadeiro vai ser ele ok
        System.out.println("Nota inválida.");

        // eu tava fazendo erradissimoooooooooooooooooooooo assisti de novo a aula e o erro era
        // que eu nao tava usando else if pq ele tem q ver que um eh falso pra seguir proximo
        // e dar a resposta


    }
}
