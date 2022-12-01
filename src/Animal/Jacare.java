package Animal;
import java.util.*;
public class Jacare extends Reptil{
    private int numeroGarras;

    public void Abocanhar(){
        Random gerador = new Random();
        Scanner ler = new Scanner(System.in);  
        int dado = gerador.nextInt(20)+1;
        
        System.out.println("\n+-------------------|MINIGAME JACARÉ|---------------------+");
        System.out.println("Para efetuar um ataque, você terá que contar com a sorte.\n"
        + "Jogue um dado de 1 a 20 e teste sua sorte!");
        System.out.print("\nAperte ENTER ou digite qualquer coisa para jogar o dado ");
        ler.nextLine();
        
        if(dado >= 10){
            System.out.println("\n                                         .^^        "); 
            System.out.println("                                   75JYP#~7B~       "); 
            System.out.println("              ^!?7!^.......:^~!7?5B.  7Y  .&:      "); 
            System.out.println("            .B5BG_____JJYYJJ?7~^:..       .^!##      "); 
            System.out.println("          .:GP.#5([|])..              .~J5#P&5&!    ");   
            System.out.println("        ^BJ!:   ....            .:7YBG&B&&G |/      ");   
            System.out.println("       :&^               :~?PYP&&5!&& |/            "); 
            System.out.println("      .&~    .G?   .^7YGJG##P  |/ |/                "); 
            System.out.println("      .&^    #J  7#G!5&#  |/                        "); 
            System.out.println("       :&:   5P   ^Y5~::                            "); 
            System.out.println("        ~&.   .     .?PBG/]                         "); 
            System.out.println("         !#!.          ~5&!./]                      "); 
            System.out.println("           ~J5J^         .J#&&  /]                 "); 
            System.out.println("              :7557:        ~PPBP@:                 "); 
            System.out.println("                  ^J5J~.      :JB#./]              "); 
            System.out.println("                     .!Y57:      ~G#P@/]              "); 
            System.out.println("                         ^?5Y!!!~^~P&5              "); 
            System.out.println("                            .:::^^^:                ");                                
            System.out.println("\nVocê conseguiu atacar a sua presa!\n"
            + "O resultado do seu dado foi "+dado);
        } else 
            System.out.println("\nVocê errou seu ataque. Mais sorte na próxima vez!\n"
            + "O resultado do seu dado foi "+dado);
        System.out.println("+-------------------|MINIGAME JACARÉ|---------------------+");
        System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
        ler.nextLine();
    }
    
    public void Nadar(){
        System.out.println("\n                          _.---._     .---.");
        System.out.println("            __...---' .---. `---'-.   `.");
        System.out.println("  ~ -~ -.-''__.--' _.'( | )`.  `.  `._ :");
        System.out.println(" -.~~ .'__-'_ .--'' ._`---'_.-.  `.   `-`.");
        System.out.println("  ~ ~_~-~-~_ ~ -._ -._``---. -.    `-._   `.");
        System.out.println("    ~- ~ ~ -_ -~ ~ -.._ _ _ _ ..-_ `.  `-._``--.._");
        System.out.println("     ~~-~ ~-_ _~ ~-~ ~ -~ _~~_-~ -._  `-.  -. `-._``--.._.--''. ~ -~_");
        System.out.println("         ~~ -~_-~ _~- _~~ _~-_~ ~-_~~ ~-.___    -._  `-.__   `. `. ~ -_~");
        System.out.println("             ~~ _~- ~~- -_~  ~- ~ - _~~- _~~ ~---...__ _    ._ .` `. ~-_~");
        System.out.println("                ~ ~- _~~- _-_~ ~-_ ~-~ ~_-~ _~- ~_~-_~  ~--.....--~ -~_ ~");
        System.out.println("                     ~ ~ - ~  ~ ~~ - ~~-  ~~- ~-  ~ -~ ~ ~ -~~-  ~- ~-~");
    }
    public int getNumeroGarras() {
        return numeroGarras;
    }

    public void setNumeroGarras(int numeroGarras) {
        this.numeroGarras = numeroGarras;
    }
}                                               