package Animal;
import java.util.*;
public class Ovelha extends Ovino {
    private String la;
    
    public void La(){
        Random gerador = new Random();
        Scanner ler = new Scanner(System.in);
        int dado = gerador.nextInt(20)+1, tentativas;
       
        System.out.println("\n+-------------------|MINIGAME OVINOS|---------------------+");
        System.out.println("Você irá tirar a lã da ovelha Shirley.\n"
        + "Adivinhe quantos quilos de lã que ela deu este mês.\n"
        + "Você terá de advinhar um número de 1 a 20.\n"
        + "No total você terá 5 tentativas.");
        System.out.print("\nAperte ENTER ou digite qualquer coisa para continuar ");
        ler.nextLine();
        
        for(int i = 0; i < 5; i++){
            System.out.print("\nDigite um número: ");
            tentativas = ler.nextInt();
            
            while(tentativas < 1 || tentativas > 20){
                System.out.println("\nDigite novamente.");
                System.out.print("\nOpção: ");
                tentativas = ler.nextInt();
            }
            
            if(tentativas > dado)
                System.out.println("\nO número é menor");
            else if (tentativas < dado)
                System.out.println("\nO número é maior");
            else {
                System.out.println("\nPARABÉNS, VOCÊ ACERTOU! Shiley deu "+dado+" quilos de lã.");
                i=5;
            }
            
            if(i == 4)
                System.out.println("\nA quantidade em quilos de lã era "+dado);
        }
        System.out.println("+-------------------|MINIGAME OVINOS|---------------------+");
        System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
        ler.nextLine(); ler.nextLine();
    }
    
     public void Pastar(){
          System.out.println("\nVocê está pastando à tarde próximo a um pequeno estábulo.\n"
          + "Vultos parecem estar se aproximando da cerca.\n"
          + "O vulto corre vorazmente atrás de você, trata-se de um lobo.\n"
          + "Porém, não demora muito para o cachorro do pasto chegar para mandar o lobo solitário ir embora.");
     }

    public String getLa() {
        return la;
    }

    public void setLa(String la) {
        this.la = la;
    }
}
