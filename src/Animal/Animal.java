package Animal;
public class Animal {
    protected String nome;
    protected String classe; //ex: Peixes, Anf�bios, R�pteis, Aves e Mam�feros
    protected String ordem; //ex: Primatas, Ovinos, Su�nos, Equinos, Bovinos, etc...
    protected double tamanho;
    protected double peso;
    protected String cor;
    protected String habitat;
    protected String dieta; //ex: Carn�voro, Herb�voro e On�voro

    Animal(){}

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public String getOrdem() {
        return ordem;
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

    public String getHabitat() {
        return habitat;
    }
    
    public String getDieta() {
        return dieta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
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

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
    
    public void andar(){
        System.out.println("Andando...");
    }
    
    public void comer(){
        System.out.println("Comendo...");
    }
}