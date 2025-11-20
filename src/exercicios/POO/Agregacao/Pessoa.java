package exercicios.POO.Agregacao;

public class Pessoa {
    private String pessoa;
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String pedro, int i, String m) {
    }

    //metodos

    public void fazerAniver() {
        this.idade = this.idade + 1;
    }

    // metodos especiais

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void getNome() {
        this.nome();
    }

    private void nome() {
    }
}
