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
            System.out.print("\nOp��o: ");
            opcao = read.nextInt();

            while(opcao < 1 || opcao > 3){
                System.out.println("\nDigite novamente.");
                System.out.print("\nOp��o: ");
                opcao = read.nextInt();
            }
            
            limpaTela.limpaTela();
            
            if(opcao == 1){
                System.out.println("\nSelecione o que deseja cadastrar:");
                System.out.println("\n1 - Animal Gen�rico");
                System.out.println("2 - Esp�cie Gen�rica");
                System.out.println("3 - Animal Espec�fico");
                System.out.print("\nOp��o: ");
                opcao = read.nextInt();
                
                while(opcao < 1 || opcao > 3){
                    System.out.println("\nDigite novamente.");
                    System.out.print("\nOp��o: ");
                    opcao = read.nextInt();
                }
                
                if(opcao == 1){
                    System.out.println("\nSelecione o que deseja cadastrar:");
                    System.out.println("\n1 - Mam�fero");
                    System.out.println("2 - R�ptil");
                    System.out.print("\nOp��o: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 2){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOp��o: ");
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
                System.out.println("\nVoc� saiu.");
                rodando = false;
            }
        }
    }
}
