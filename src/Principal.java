import Animal.*;
import java.util.*;
import java.io.IOException;
public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner read = new Scanner(System.in);
        int opcao;
        boolean rodando = true;
        limpaTela limpaTela = new limpaTela();
        
        while(rodando){
            System.out.println("MENU");
            System.out.println("\n1 - Cadastrar");
            System.out.println("2 - Mostrar");
            System.out.println("3 - Sair");
            System.out.print("\nOpção: ");
            opcao = read.nextInt();

            while(opcao < 1 || opcao > 3){
                System.out.println("\nDigite novamente.");
                System.out.print("\nOpção: ");
                opcao = read.nextInt();
            }
            
            limpaTela.limpaTela();
            
            if(opcao == 1){
                System.out.println("\nSelecione o que deseja cadastrar:");
                System.out.println("\n1 - Animal Genérico");
                System.out.println("2 - Espécie Genérica");
                System.out.println("3 - Animal Específico");
                System.out.print("\nOpção: ");
                opcao = read.nextInt();
                
                while(opcao < 1 || opcao > 3){
                    System.out.println("\nDigite novamente.");
                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                }
                
                if(opcao == 1){
                    System.out.println("\nSelecione o que deseja cadastrar:");
                    System.out.println("\n1 - Mamífero");
                    System.out.println("2 - Réptil");
                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 2){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                    }
                    
                    if(opcao == 1){
                        
                    } else {
                        
                    }
                } else if(opcao == 2){
                    
                } else {
                    
                }
                
            } else if(opcao == 2){

            } else {
                System.out.println("\nVocê saiu.");
                rodando = false;
            }
        }
    }
}
