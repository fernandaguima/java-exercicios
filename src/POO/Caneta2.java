package POO;

public class Caneta2 {

    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta2() {
        this.tampar(); //metodo
        this.cor = "Azul"; //atributo ATENCAO

    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampada() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada? " + this.tampada);
    }
}
