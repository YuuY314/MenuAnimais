package Animal;
import java.util.Random;
import java.util.Scanner;
public class Ovelha extends Ovino {
    private String la;
    
    public void La(){
        Random gerador = new Random();
        Scanner ler = new Scanner(System.in);
        int dado = gerador.nextInt(20)+1, tentativas;
       
        System.out.println("\n+-------------------|MINIGAME OVINOS|---------------------+");
        System.out.println("Voc� ir� tirar a l� da ovelha Shirley.\n"
        + "Advinhe quantos quilos de l� que ela deu este m�s.\n"
        + "Voc� ter� de advinhar um n�mero de 1 a 20.\n"
        + "No total voc� ter� 5 tentativas.");
        System.out.print("\nAperte ENTER ou digite qualquer coisa para continuar ");
        ler.nextLine();
        for(int i = 0; i < 5; i++){
            System.out.print("Digite um n�mero: ");
            tentativas = ler.nextInt();
            
            while(tentativas < 1 || tentativas > 20){
                System.out.println("\nDigite novamente.");
                System.out.print("\nOp��o: ");
                tentativas = ler.nextInt();
            }
            
            if(tentativas > dado)
                System.out.println("\nO numero � menor");
            else if (tentativas < dado)
                System.out.println("\nO numero � maior");
            else {
                System.out.println("\nPARAB�NS, VOC� ACERTOU! Shiley deu "+dado+" quilos de l�.");
                i=5;
            }
            
            if(i == 5)
                System.out.println("\nA quantidade em quilos de l� era: "+dado);
        }
        System.out.println("+-------------------|MINIGAME OVINOS|---------------------+");
        System.out.print("\nAperte ENTER ou digite qualquer coisa para continuar ");
        ler.nextLine(); ler.nextLine();
    }
    
     public void Pastar(){
          System.out.println("+-------------------|Historia Ovelha|---------------------+");
          System.out.println("Voce esta pastando, a tarde, proximo a um pequeno estabulo.\nVultos parecem estar se aproximando da cerca.");
          System.out.println("O vulto corre vorazmente atras de voce. Um lobo.");
          System.out.println(" Ele consegue te pegar porem antes de ser devorada voce solta seu ultimo berro que ecoa por toda a fazendo avisando seus filhos e companheiros.");
          System.out.println("+---------------------------------------------------------+");
     
     }

    public String getLa() {
        return la;
    }

    public void setLa(String la) {
        this.la = la;
    }
}
