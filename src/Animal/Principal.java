package Animal;
import java.util.*;
public class Principal {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opcao, vezes = 1;
        boolean rodando = true;
        
        while(rodando){
            if(vezes == 1){
                System.out.println("MENU");
            } else {
                System.out.println("\nMENU");
            }
            System.out.println("\n1 - Cadastrar");
            System.out.println("2 - Mostrar");
            System.out.println("3 - Sair");
            System.out.print("\nOpção: ");
            opcao = read.nextInt();

            while(opcao < 1 || opcao > 3){
                System.out.println("\nDigite novamente.");
                System.out.print("Opção: ");
                opcao = read.nextInt();
            }

            if(opcao == 1){
                System.out.println("\nSelecione o que deseja cadastrar:");
                System.out.println("\n--- Animal Genérico ---");
                System.out.println("\n1 - Mamífero");
                System.out.println("2 - Réptil");
                System.out.println("\n--- Espécie Genérica ---");
                System.out.println("\n3 - Primata");
                System.out.println("4 - Ovino");
                System.out.println("\n--- Animal Específico ---");
                System.out.println("\n5 - Ovelha");
                System.out.println("6 - Cobra");
                System.out.println("7 - Jacaré");
                System.out.print("\nOpção: ");
                opcao = read.nextInt();
                
                while(opcao < 1 || opcao > 7){
                    System.out.println("\nDigite novamente.");
                    System.out.print("Opção: ");
                    opcao = read.nextInt();
                }
                
            } else if(opcao == 2){

            } else {
                System.out.println("\nVocê saiu.");
                rodando = false;
            }
        }
    }
}
