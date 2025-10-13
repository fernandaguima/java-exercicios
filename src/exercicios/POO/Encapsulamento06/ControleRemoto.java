package exercicios.POO.Encapsulamento06;

public class ControleRemoto {
  // atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
  // métodos

    public void ligar() {
        this.setLigado(true);
    }

    public void desligar() {
        this.setLigado(false);
    }

    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.println("|");
        }
    }

    public void fecharMenu() {
        System.out.println("Fechando o menu...");
    }

    public void maisVolume() {
        if (this.getLigado()); {
            this.setVolume(getVolume() + 5);
        }
    }

    public void menosVolume() {
        if (this.getLigado()); {
            this.setVolume(this.getVolume() - 5);
        }
    }

    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0); {
            this.setVolume(50);
        }
    }

    public void play() {
        if (this.getLigado() && !(this.getTocando())); {
            this.setTocando(true);
        }
    }

    public void pause() {
        if (this.getLigado() && this.getTocando()); {
            this.setTocando(false);
        }
    }





 // getters e setters
    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return this.tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}
