package Animal;
import java.util.*;
public class Mamifero extends Animal{
    private int numeroMamas;
    private String tipoDePelo;
    
    public void Quem(){
       System.out.println("\n+-------------------|CI�NCIA DOS MAM�FEROS|---------------------+");
       System.out.println("Grande classe de animais vertebrados, endotermos, viv�paros (exceto os monotremados, que s�o ov�paros),\n"
       + "caracterizados pela presen�a de gl�ndulas mam�rias, corpo geralmente coberto por pelos, pele com numerosas gl�ndulas,\n"
       + "orelha externa presente e orelha m�dia com tr�s oss�culos auditivos, cora��o com quatro c�maras, pulm�es grandes e el�sticos,\n"
       + "cavidades tor�cica e abdominal separadas por um diafragma e fecunda��o interna.");
       System.out.println("+-------------------|CI�NCIA DOS MAM�FEROS|---------------------+");
    }
    
    public void Exemplo(){
        System.out.println("\nExemplos:"
        + "\nAnta\n"
        + "Ariranha\n"
        + "Baleia-Azul\n"
        + "Bicho-Pregui�a\n"
        + "Boi\n"
        + "B�falo\n"
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