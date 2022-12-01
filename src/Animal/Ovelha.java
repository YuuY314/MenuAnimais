package Animal;
import java.util.*;
public class Ovelha extends Ovino {
    private String la;
    
    public void La(){
        Random gerador = new Random();
        Scanner ler = new Scanner(System.in);
        int dado = gerador.nextInt(20)+1, tentativas;
       
        System.out.println("\n+-------------------|MINIGAME OVINOS|---------------------+");
        System.out.println("Voc� ir� tirar a l� da ovelha Shirley.\n"
        + "Adivinhe quantos quilos de l� que ela deu este m�s.\n"
        + "Voc� ter� de advinhar um n�mero de 1 a 20.\n"
        + "No total voc� ter� 5 tentativas.");
        System.out.print("\nAperte ENTER ou digite qualquer coisa para continuar ");
        ler.nextLine();
        
        for(int i = 0; i < 5; i++){
            System.out.print("\nDigite um n�mero: ");
            tentativas = ler.nextInt();
            
            while(tentativas < 1 || tentativas > 20){
                System.out.println("\nDigite novamente.");
                System.out.print("\nOp��o: ");
                tentativas = ler.nextInt();
            }
            
            if(tentativas > dado)
                System.out.println("\nO n�mero � menor");
            else if (tentativas < dado)
                System.out.println("\nO n�mero � maior");
            else {
                System.out.println("\nPARAB�NS, VOC� ACERTOU! Shiley deu "+dado+" quilos de l�.");
                i=5;
            }
            
            if(i == 4)
                System.out.println("\nA quantidade em quilos de l� era "+dado);
        }
        System.out.println("+-------------------|MINIGAME OVINOS|---------------------+");
        System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
        ler.nextLine(); ler.nextLine();
    }
    
     public void Pastar(){
          System.out.println("\nVoc� est� pastando � tarde pr�ximo a um pequeno est�bulo.\n"
          + "Vultos parecem estar se aproximando da cerca.\n"
          + "O vulto corre vorazmente atr�s de voc�, trata-se de um lobo.\n"
          + "Por�m, n�o demora muito para o cachorro do pasto chegar para mandar o lobo solit�rio ir embora.");
     }

    public String getLa() {
        return la;
    }

    public void setLa(String la) {
        this.la = la;
    }
}
