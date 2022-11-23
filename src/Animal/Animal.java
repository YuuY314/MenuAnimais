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
        if(nome.equals("")){
            this.nome = "N�o informado";
        } else {
            this.nome = nome;
        }
    }

    public void setClasse(String classe) {
        if(classe.equals("")){
            this.classe = "N�o informado";
        } else {
            this.classe = classe;
        }
    }

    public void setOrdem(String ordem) {
        if(ordem.equals("")){
            this.ordem = "N�o informado";
        } else {
            this.ordem = ordem;
        }
    }

    public void setTamanho(double tamanho) {
      if(tamanho == 0){
          this.tamanho = 0;
        } else {
            this.tamanho = tamanho; 
        }
    }

    public void setPeso(double peso) {
        if(peso == 0){
            this.peso = 0;
        } else {
            this.peso = peso; 
        }
    }

    public void setCor(String cor) {
        if(cor.equals("")){
            this.cor = "N�o informado";
        } else {
            this.cor = cor;     
        }
    }

    public void setHabitat(String habitat) {
        if(habitat.equals("")){
            this.habitat = "N�o informado";
        } else {
            this.habitat = habitat;        
        }
    }
    
    public void setDieta(String dieta) {
        if(dieta.equals("")){
            this.dieta = "N�o informado";
        } else {
            this.dieta = dieta;     
        }
    }
    
    public void andar(){
        System.out.println("Andando...");
    }
    
    public void comer(){
        System.out.println("Comendo...");
    }
}