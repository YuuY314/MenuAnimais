package Animal;
public class Animal {
    protected String nome;
    protected String classe; //ex
    protected String habitat;
    protected double tamanho;
    protected double peso;
    protected String cor;

    public Animal() {}
    public Animal(String especie, String habitat, String classe, double tamanho, double peso) {
        this.especie = especie;
        this.habitat = habitat;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public double getTamanho() {
        return tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public String getCor() {
        return cor;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void andar() {
        System.out.println("Animal andando...");
    }
    
    public void comer() {
        System.out.println("Animal comendo...");
    }
}
