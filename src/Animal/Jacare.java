package Animal;
import java.util.Random;
import java.util.Scanner;
public class Jacare extends Reptil{
    private int numeroGarras;

public void abocanhar(){
        Random gerador = new Random();
        Scanner prosseguir = new Scanner(System.in);  
        int dado;
        dado =0;
        dado = gerador.nextInt(19)+1;
        String ler ;
        System.out.println("+-------------------|Minigame Jacaré|---------------------+");
        System.out.println("Para efetuar um ataque, voce terá que contar com a sorte.\nJogue um dado(1-20) apertando ENTER e teste sua sorte!");
        System.out.print("\nPressione ENTER para continuar:");
        ler = prosseguir.nextLine();
        
        if(ler.equals("")){
            if(dado>=10){
                System.out.println("                                         .^^        "); 
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
                System.out.println("\nVoce Conseguiu Atacar a sua presa! Parabens \n O resultado do seu dado foi:"+dado);
                System.out.println("+---------------------------------------------------------+");
            
            }
            
            else{
            System.out.println("\nVocê Errou seu ataque, mais sorte na proxima vez! ;-;\nO resultado do seu dado foi:"+dado);
            System.out.println("+---------------------------------------------------------+");
            }
        
        
        }
}
    
    public int getNumeroGarras() {
        return numeroGarras;
    }

    public void setNumeroGarras(int numeroGarras) {
        this.numeroGarras = numeroGarras;
    }
}                                               