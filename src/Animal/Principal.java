package Animal;

import Animal.*;
import java.util.*;
import java.io.IOException;
public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner read = new Scanner(System.in);
        int opcao; String resposta;
        boolean rodando = true;
        limpaTela limpaTela = new limpaTela();
        
        Animal animal = new Animal();
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Ovino ovino = new Ovino();
        Primata primata = new Primata();
        Cobra cobra = new Cobra();
        Jacare jacare = new Jacare();
        Ovelha ovelha = new Ovelha();
        
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
            
            if(opcao == 1){
                System.out.println("\nSelecione o que deseja cadastrar:");
                System.out.println("\n1 - Animal Genérico");//ex: Animal
                System.out.println("2 - Classe de Animal");//ex: Mamífero e Réptil
                System.out.println("3 - Ordem de Animal");//ex: Ovino e Primata
                System.out.println("4 - Espécie de Animal");//ex: Cobra, Jacaré e Ovelha
                System.out.print("\nOpção: ");
                opcao = read.nextInt();
                
                while(opcao < 1 || opcao > 4){
                    System.out.println("\nDigite novamente.");
                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                }
                
                read.nextLine();

                if(opcao == 1){
                    System.out.println("\nOBS: Se quiser não cadastrar uma das informações, dê ENTER");
                    System.out.print("\nDigite o nome do animal: ");
                    animal.setNome(read.nextLine());
                    System.out.print("Digite a classe do animal: ");
                    animal.setClasse(read.nextLine());
                    System.out.print("Digite a ordem do animal: ");
                    animal.setOrdem(read.nextLine());
                    /*System.out.print("Deseja colocar a ordem do animal? Sim ou Não?");;
                    resposta = read.nextLine();
                    if(resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s")){
                        System.out.println("Digite a ordem do animal: ");
                        animal.get
                    }*/
                } else if(opcao == 2){
                    System.out.println("\nSelecione a classe do animal:");
                    System.out.println("\n1 - Mamífero");
                    System.out.println("2 - Réptil");

                } else {
                    System.out.println("\nSelecione o animal específico:");
                    System.out.println("\n1 - Cobra");
                    System.out.println("2 - Jacaré");
                    System.out.println("3 - Ovelha");
                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 3){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                    }
                }
                
            } else if(opcao == 2){
                System.out.println("\nSelecione o que deseja mostrar:");
                System.out.println("\n1 - Animal Genérico");
                System.out.println("2 - Classe de Animal");
                System.out.println("3 - Ordem de Animal");
                System.out.println("4 - Espécie de Animal");
                System.out.print("\nOpção: ");
                opcao = read.nextInt();
                
                while(opcao < 1 || opcao > 4){
                    System.out.println("\nDigite novamente.");
                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                }
                
                if(opcao == 1){
                    System.out.println("Nome do Animal: "+animal.getNome());
                    System.out.println("Classe do Animal: "+animal.getClasse());
                    System.out.println("Ordem do Animal: "+animal.getOrdem());
                }
                
            } else {
                System.out.println("\nVocê saiu.");
                rodando = false;
            }
        }
    }
}
