package Animal;
import java.util.Random;
import java.util.Scanner;
public class Cobra extends Reptil{
    private String peconha;
    private String sensorDeCalor;

    public void bote(){
        Random gerador = new Random();
        Scanner prosseguir = new Scanner(System.in);  
        int dado;
        dado =0;
        dado = gerador.nextInt(19)+1;
        String ler ;
        System.out.println("+-------------------|Minigame Serpernte|---------------------+");
        System.out.println("Para efetuar um ataque, voce terá que contar com a sorte.\nJogue um dado(1-20) apertando ENTER e teste sua sorte!");
        System.out.print("\nPressione ENTER para continuar:");
        ler = prosseguir.nextLine();
        
        if(ler.equals("")){
            if(dado>=10){
                                                                                  
                System.out.println("             .!J?~. .^~7777~^. .~?J!.     ");                                
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
                System.out.println("\nVoce Conseguiu Atacar a sua presa! Parabens \n O resultado do seu dado foi:"+dado);    
                System.out.println("+------------------------------------------------------------+");            
            }

            else{
                System.out.println("\nVocê Errou seu ataque, mais sorte na proxima vez! ;-;\nO resultado do seu dado foi:"+dado);
                System.out.println("+------------------------------------------------------------+");     
            }
        }
    }
    
    public void veneno(){
        
       Random gerador = new Random();
       Scanner prosseguir = new Scanner(System.in); 
       Scanner entrada = new Scanner(System.in); 
       int resposta;
       int dado;
       dado =0;
       dado = gerador.nextInt(20) + 1;
       String ler ; 
       
    System.out.println("+-------------------|Minigame Serpernte|---------------------+");
    System.out.println("Para conseguir envenar um animal, voce precisara injetar uma quantidade especifica de veneno.");
    System.out.println("Voce terá de advinhar a os ml(1-20) de veneno que serão injetados. No total voce tera 5 tentativas.");
    System.out.println("Dicas serão dadas ao decorrer do jogo, dizendo se o numero é maior ou menor. BOA SORTE");
    System.out.print("\nPressione ENTER para continuar:");
    ler = prosseguir.nextLine();
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite:");
            resposta = prosseguir.nextInt();
            if(resposta>dado){
                System.out.println("O numero e menor");}
            else if (resposta<dado) {
                System.out.println("O numero e maior");    
            }
            else if (resposta == dado) {
                System.out.println("PARABENS VOCE ACERTOU! VOCE ENVENENOU A SUA PRESA.");
                i=5;
            }
        }
        System.out.println("\nA quantidade em ml era de: "+ dado);
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