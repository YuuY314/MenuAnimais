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
            System.out.print("\nOp��o: ");
            opcao = read.nextInt();

            while(opcao < 1 || opcao > 3){
                System.out.println("\nDigite novamente.");
                System.out.print("\nOp��o: ");
                opcao = read.nextInt();
            }
            
            if(opcao == 1){
                System.out.println("\nSelecione o que deseja cadastrar:");
                System.out.println("\n1 - Animal Gen�rico");//ex: Animal
                System.out.println("2 - Classe de Animal");//ex: Mam�fero e R�ptil
                System.out.println("3 - Ordem de Animal");//ex: Ovino e Primata
                System.out.println("4 - Esp�cie de Animal");//ex: Cobra, Jacar� e Ovelha
                System.out.print("\nOp��o: ");
                opcao = read.nextInt();
                
                while(opcao < 1 || opcao > 4){
                    System.out.println("\nDigite novamente.");
                    System.out.print("\nOp��o: ");
                    opcao = read.nextInt();
                }
                
                read.nextLine();

                if(opcao == 1){
                    System.out.println("\nOBS: Se quiser n�o cadastrar uma das informa��es, d� ENTER");
                    System.out.print("\nDigite o nome do animal: ");
                    animal.setNome(read.nextLine());
                    System.out.print("Digite a classe do animal: ");
                    animal.setClasse(read.nextLine());
                    System.out.print("Digite a ordem do animal: ");
                    animal.setOrdem(read.nextLine());
                    /*System.out.print("Deseja colocar a ordem do animal? Sim ou N�o?");;
                    resposta = read.nextLine();
                    if(resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s")){
                        System.out.println("Digite a ordem do animal: ");
                        animal.get
                    }*/
                } else if(opcao == 2){
                    System.out.println("\nSelecione a classe do animal:");
                    System.out.println("\n1 - Mam�fero");
                    System.out.println("2 - R�ptil");

                } else {
                    System.out.println("\nSelecione o animal espec�fico:");
                    System.out.println("\n1 - Cobra");
                    System.out.println("2 - Jacar�");
                    System.out.println("3 - Ovelha");
                    System.out.print("\nOp��o: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 3){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOp��o: ");
                        opcao = read.nextInt();
                    }
                }
                
            } else if(opcao == 2){
                System.out.println("\nSelecione o que deseja mostrar:");
                System.out.println("\n1 - Animal Gen�rico");
                System.out.println("2 - Classe de Animal");
                System.out.println("3 - Ordem de Animal");
                System.out.println("4 - Esp�cie de Animal");
                System.out.print("\nOp��o: ");
                opcao = read.nextInt();
                
                while(opcao < 1 || opcao > 4){
                    System.out.println("\nDigite novamente.");
                    System.out.print("\nOp��o: ");
                    opcao = read.nextInt();
                }
                
                if(opcao == 1){
                    System.out.println("Nome do Animal: "+animal.getNome());
                    System.out.println("Classe do Animal: "+animal.getClasse());
                    System.out.println("Ordem do Animal: "+animal.getOrdem());
                }
                
            } else {
                System.out.println("\nVoc� saiu.");
                rodando = false;
            }
        }
    }
}
