package exercicios.POO.polimorfismo.Aula012;

abstract class Animal {

    protected float peso;
    protected int idade;
    protected int membros;

    public abstract void locomover();
    public abstract void  alimentar();
    public abstract void emitirSom();

}
