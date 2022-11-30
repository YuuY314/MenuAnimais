package Animal;
import java.util.*;
public class Mamifero extends Animal{
    private int numeroMamas;
    private String tipoDePelo;
    
    public void Quem(){
       System.out.println("\n+-------------------|CIÊNCIA DOS MAMÍFEROS|---------------------+");
       System.out.println("Grande classe de animais vertebrados, endotermos, vivíparos (exceto os monotremados, que são ovíparos),\n"
       + "caracterizados pela presença de glândulas mamárias, corpo geralmente coberto por pelos, pele com numerosas glândulas,\n"
       + "orelha externa presente e orelha média com três ossículos auditivos, coração com quatro câmaras, pulmões grandes e elásticos,\n"
       + "cavidades torácica e abdominal separadas por um diafragma e fecundação interna.");
       System.out.println("+-------------------|CIÊNCIA DOS MAMÍFEROS|---------------------+");
    }
    
    public void Exemplo(){
        System.out.println("\nExemplos:"
        + "\nAnta\n"
        + "Ariranha\n"
        + "Baleia-Azul\n"
        + "Bicho-Preguiça\n"
        + "Boi\n"
        + "Búfalo\n"
        + "Cabra\n"
        + "Cachorro");
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