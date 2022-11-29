package Animal;
public class Mamifero extends Animal{
    private int numeroMamas;
    private String tipoDePelo;

    
    public void quem(){
        System.out.println("+-------------------|Ciencia Mamiferos|---------------------+");
        System.out.println("grande classe de animais vertebrados, endotermos, viv�paros (exceto os monotremados,");
         System.out.println("que s�o ov�paros), caracterizados pela presen�a de gl�ndulas mam�rias, corpo geralmente coberto");
       System.out.println("por pelos, pele com numerosas gl�ndulas, orelha externa presente e orelha m�dia com tr�s oss�culos");
       System.out.println("auditivos, cora��o com quatro c�maras, pulm�es grandes e el�sticos, cavidades tor�cica e abdominal");
       System.out.println(" separadas por um diafragma e fecunda��o interna.");
       System.out.println("+-------------------|Ciencia Mamiferos|---------------------+");
    }
    public void ex(){
        System.out.println("Anta.\n" +
                            "Ariranha.\n" +
                            "Baleia-azul.\n" +
                            "Bicho-pregui�a.\n" +
                            "Boi.\n" +
                            "B�falo.\n" +
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