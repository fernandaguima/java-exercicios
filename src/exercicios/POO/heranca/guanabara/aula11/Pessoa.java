package exercicios.POO.heranca.guanabara.aula11;
//nao pode criar um objeto de uma classe abstrata
public abstract class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public final void fazerAniver() {
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
