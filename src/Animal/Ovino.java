package Animal;
import java.util.Random;
import java.util.Scanner;
public class Ovino extends Mamifero {
    public void La(){
       Random gerador = new Random();
       Scanner prosseguir = new Scanner(System.in); 
       Scanner entrada = new Scanner(System.in); 
       int resposta;
       int dado;
       dado =0;
       dado = gerador.nextInt(20) + 1;
       String ler ; 
       
    System.out.println("+-------------------|Minigame OVINOS|---------------------+");
    System.out.println("Voce irá tirar a lã da ovleha Shirley. Advinhe quantos kl de la que ela deu este mes.");
    System.out.println("Voce terá de advinhar a os kl(1-20) de la que serão coletados. No total voce tera 5 tentativas.");
    System.out.println("Dicas serão dadas ao decorrer do jogo, dizendo se o numero é maior ou menor. BOA SORTE");
    System.out.print("\nPressione ENTER para continuar:");
    ler = prosseguir.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite:");
            resposta = prosseguir.nextInt();
            if(resposta>dado){
                System.out.println("O numero e menor");}
            else if (resposta<dado) {
                System.out.println("O numero e maior");    
            }
            else if (resposta == dado) {
                System.out.println("PARABENS VOCE ACERTOU! Shiley deu" + dado +"kl de la");
                i=5;
            }
        }
        System.out.println("\nA quantidade em ml era de: "+ dado);
    }

    public void berrar(){
System.out.println("+-------------------|Minigame OVINOS|---------------------+");
System.out.println("           __  _");
System.out.println("       .-.'  `; `-._  __  _");
System.out.println("      (_,         .-:'  `; `-._");
System.out.println("    ,'o'(        (_,           )");
System.out.println("   (__,-'      ,'o'(            )>");
System.out.println("      (       (__,-'            )");
System.out.println("       `-'._.--._(             )");
System.out.println("          |||  |||`-'._.--._.-'");
System.out.println("                     |||  |||");
System.out.println("\nOvinos: BEEEEEEEEEEEEEEEEEEEEEeeeeeeeeeeeeeee");

System.out.println("\n+-------------------|Minigame OVINOS|---------------------+");

}

    
    private String chifre;

   
    public String getChifre() {
        return chifre;
    }

    public void setChifre(String chifre) {
        this.chifre = chifre;
    }
}
