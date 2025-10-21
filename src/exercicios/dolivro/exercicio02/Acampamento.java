package exercicios.dolivro.exercicio02;

import javax.imageio.metadata.IIOMetadataFormat;
import java.sql.SQLOutput;

public class Acampamento {

    String nome;
    String equipe;
    int idade;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Equipe: " + this.equipe);
        System.out.println("Idade: " + this.idade);
    }

    public void separarGrupo() {
        if ((idade >=6) && (idade <=10)) {
            this.equipe = "A";
        }
        if ((idade >=11) && (idade <=20)) {
            this.equipe = "B";
        }
        if (idade >=21) {
            this.equipe = "C";
        }
    }
}
