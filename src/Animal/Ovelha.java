package Animal;
import java.util.Random;
import java.util.Scanner;
public class Ovelha extends Ovino {
    private String la;
    
    
     public void chifrada(){
        Random gerador = new Random();
        Scanner prosseguir = new Scanner(System.in);  
        int dado;
        dado =0;
        dado = gerador.nextInt(19)+1;
        String ler ;
        System.out.println("+-------------------|Minigame Ovelha|---------------------+");
        System.out.println("Para efetuar um ataque, voce ter� que contar com a sorte.\nJogue um dado(1-20) apertando ENTER e teste sua sorte!");
        System.out.print("\nPressione ENTER para continuar:");
        ler = prosseguir.nextLine();
        
        if(ler.equals("")){
            if(dado>=10){
      System.out.println("  ??????????????????????????????");
      System.out.println("  ??????????????????????????????");
      System.out.println("  ??????????????????????????????");
      System.out.println("  ??????????????????????????????");
      System.out.println("  ??????????????????????????????");
      System.out.println("  ??????????????????????????????");
      System.out.println("  ??????????????????????????????");
      System.out.println("  ??????????????????????????????");
      System.out.println("  ??????????????????????????????");
      System.out.println("  ??????????????????????????????");
      System.out.println("  ??????????????????????????????");
      System.out.println("  ??????????????????????????????");
      System.out.println("  ??????????????????????????????");
      System.out.println("  ??????????????????????????????  ");                              
                System.out.println("\nVoce Conseguiu Atacar a sua presa! Parabens \n O resultado do seu dado foi:"+dado);
                System.out.println("+---------------------------------------------------------+");
            
            }
            
            else{
            System.out.println("\nVoc� Errou seu ataque, mais sorte na proxima vez! ;-;\nO resultado do seu dado foi:"+dado);
            System.out.println("+---------------------------------------------------------+");
            }
        }
    }
     
     public void Pastar(){
          System.out.println("+-------------------|Historia Ovelha|---------------------+");
          System.out.println("Voce esta pastano a tarde proximo a um pequeno estasbulo.\nVultos parecem estar se aproximando da cerca.");
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
