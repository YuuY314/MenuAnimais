package Animal;
public class Mamifero extends Animal{
    private int numeroMamas;
    private String tipoDePelo;

    
    public void quem(){
        System.out.println("+-------------------|Ciencia Mamiferos|---------------------+");
        System.out.println("grande classe de animais vertebrados, endotermos, vivíparos (exceto os monotremados,");
         System.out.println("que são ovíparos), caracterizados pela presença de glândulas mamárias, corpo geralmente coberto");
       System.out.println("por pelos, pele com numerosas glândulas, orelha externa presente e orelha média com três ossículos");
       System.out.println("auditivos, coração com quatro câmaras, pulmões grandes e elásticos, cavidades torácica e abdominal");
       System.out.println(" separadas por um diafragma e fecundação interna.");
       System.out.println("+-------------------|Ciencia Mamiferos|---------------------+");
    }
    public void ex(){
        System.out.println("Anta.\n" +
                            "Ariranha.\n" +
                            "Baleia-azul.\n" +
                            "Bicho-preguiça.\n" +
                            "Boi.\n" +
                            "Búfalo.\n" +
                            "Cabra.\n" +
                            "Cachorro.");
    
    
    }
    
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