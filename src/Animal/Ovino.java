package Animal;
import java.util.*;
public class Ovino extends Mamifero {
    private String chifre;
    
    public void Berrar(){
        System.out.println("           __  _");
        System.out.println("       .-.'  `; `-._  __  _");
        System.out.println("      (_,         .-:'  `; `-._");
        System.out.println("    ,'o'(        (_,           )");
        System.out.println("   (__,-'      ,'o'(            )>");
        System.out.println("      (       (__,-'            )");
        System.out.println("       `-'._.--._(             )");
        System.out.println("          |||  |||`-'._.--._.-'");
        System.out.println("                     |||  |||");
        System.out.println("\nBEEEEEEEEEEEEEEEEEEEEEeeeeeeeeeeeeeee");
    }
    
    public void Chifrada(){
        Random gerador = new Random();
        Scanner ler = new Scanner(System.in);  
        int dado = gerador.nextInt(20)+1;
        
        System.out.println("\n+-------------------|MINIGAME OVINO|---------------------+");
        System.out.println("Para efetuar um ataque, você terá que contar com a sorte.\n"
        + "Jogue um dado de 1 a 20 e teste sua sorte!");
        System.out.print("\nAperte ENTER ou digite qualquer coisa para jogar o dado ");
        ler.nextLine();
        
        if(dado >= 10){
            System.out.println("\n      ___.");
            System.out.println("     //  \\\\");
            System.out.println("    ((   ''");
            System.out.println("     \\\\__,");
            System.out.println("    /6 (%)\\,");
            System.out.println("   (__/:\";,;\\--____----_");
            System.out.println("    ;; :';,:';`;,';,;';`,`_");
            System.out.println("      ;:,;;';';,;':,';';,-Y\\");
            System.out.println("      ;,;,;';';,;':;';'; Z/");
            System.out.println("       / ;,';';,;';,;';;'");
            System.out.println("      / / |';/~~~~~\\';;'");
            System.out.println("     ( K  | |      || |");
            System.out.println("      \\_\\ | |      || |");
            System.out.println("       \\Z | |      || |");
            System.out.println("          L_|      LL_|");
            System.out.println("          LW/      LLW/");
            System.out.println("\nVocê conseguiu atacar a sua presa!\n"
            + "O resultado do seu dado foi "+dado);
        } else
            System.out.println("\nVocê errou seu ataque. Mais sorte na próxima vez!\n"
            + "O resultado do seu dado foi "+dado);
        System.out.println("\n+-------------------|MINIGAME OVINO|---------------------+");
        System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
        ler.nextLine();
    }

   
    public String getChifre() {
        return chifre;
    }

    public void setChifre(String chifre) {
        this.chifre = chifre;
    }
}
