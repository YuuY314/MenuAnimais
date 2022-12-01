package Animal;
import java.util.*;
public class Cobra extends Reptil{
    private String peconha;
    private String sensorDeCalor;

    public void Bote(){
        Random gerador = new Random();
        Scanner ler = new Scanner(System.in);  
        int dado= gerador.nextInt(20)+1;
        
        System.out.println("\n+-------------------|MINIGAME COBRA|---------------------+");
        System.out.println("Para efetuar um ataque, você terá que contar com a sorte.\n"
        + "Jogue um dado de 1 a 20 teste sua sorte!");
        System.out.print("\nAperte ENTER ou digite qualquer coisa para jogar o dado ");
        ler.nextLine();
        
        if(dado >= 10){                                                                          
            System.out.println("\n             .!J?~. .^~7777~^. .~?J!.     ");                                
            System.out.println("            5GG@@@&&&@@@@@@@@&&&@@@GG5    ");                                 
            System.out.println("           #B. ^P&&&&&&&&&&&&&&&&P: .B#   ");                                 
            System.out.println("          ^@P?P: 5@@@@&&##&&@@@@5 :P?P@^  ");                                 
            System.out.println("           #@GPGG@&BPYJJYYJJYPB&@GGPG@#   ");                                 
            System.out.println("           .PBBPJ^^GB:      :BG^^JPBBP.   ");                                 
            System.out.println("            B#B.   &&        &&    B#B    ");                                 
            System.out.println("            ^@@7   G&        &G   7@@^    ");                                 
            System.out.println("             !@#   ~&        &~   #@!     ");                                 
            System.out.println("              !@7   B.      .B   7@!      ");                                 
            System.out.println("               7&.  ^:      :^  .&7       ");                                 
            System.out.println("                PB              BP        ");                                 
            System.out.println("                 #7            7#         ");                                 
            System.out.println("                 ^&^:        :^&^         ");                                 
            System.out.println("                  Y#~~      ~~#Y          ");                                 
            System.out.println("                   G#JJ????JJ#G           ");                                 
            System.out.println("                    7B##BB##B7            ");                                 
            System.out.println("\nVocê conseguiu atacar a sua presa!\n"
            + "O resultado do seu dado foi "+dado);      
        } else
            System.out.println("\nVocê errou seu ataque. Mais sorte na próxima vez!\n"
            + "O resultado do seu dado foi "+dado);
        System.out.println("\n+-------------------|MINIGAME COBRA|---------------------+");
        System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
        ler.nextLine();
    }
    
    public void Veneno(){
        Random gerador = new Random();
        Scanner ler = new Scanner(System.in); 
        int dado = gerador.nextInt(20)+1, tentativas;
       
        System.out.println("\n+-------------------|MINIGAME COBRA|---------------------+");
        System.out.println("Para conseguir envenenar um animal, você precisará injetar uma quantidade especifica de veneno.\n"
        + "Você terá de advinhar os ml, de 1 a 20, de veneno que serão injetados.\n"
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
                System.out.println("\nPARABÉNS, VOCÊ ACERTOU! VOCÊ ENVENENOU SUA PRESA.");
                i=5;
            }
            
            if(i == 4)
                System.out.println("\nA quantidade em ml de veneno era "+dado);
        }
        System.out.println("+-------------------|MINIGAME COBRA|---------------------+");
        System.out.print("\nAperte ENTER ou digite qualquer coisa para continuar ");
        ler.nextLine(); ler.nextLine();
    }
    
    
    
    public String getPeconha() {
        return peconha;
    }

    public String getSensorDeCalor() {
        return sensorDeCalor;
    }

    public void setPeconha(String peconha) {
        this.peconha = peconha;
    }

    public void setSensorDeCalor(String sensorDeCalor) {
        this.sensorDeCalor = sensorDeCalor;
    }
}