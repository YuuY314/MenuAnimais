package Animal;
public class Mamifero extends Animal{
    private int numeroMamas;
    private String tipoDePelo;

    public int getNumeroMamas() {
        return numeroMamas;
    }

    public String getTipoDePelo() {
        return tipoDePelo;
    }

    public void setNumeroMamas(int numeroMamas) {
        this.numeroMamas = numeroMamas;
    }

    public void setTipoDePelo(String tipoDePelo) {
        this.tipoDePelo = tipoDePelo;
    }
}