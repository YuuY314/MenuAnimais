package Animal;
import java.util.*;
import java.io.IOException;
public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner read = new Scanner(System.in);
        int opcao; String resposta;
        boolean rodando = true;
        
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
                    System.out.println("\nOBS: Se quiser n�o cadastrar uma das informa��es, d� ENTER (em caso de n�meros, digite 0)");
                    System.out.print("\nDigite o nome do animal: ");
                    animal.setNome(read.nextLine());
                    System.out.print("Digite a classe do animal: ");
                    animal.setClasse(read.nextLine());
                    System.out.print("Digite a ordem do animal: ");
                    animal.setOrdem(read.nextLine());
                    System.out.print("Tamanho do animal em metros: ");
                    animal.setTamanho(read.nextDouble());
                    System.out.print("Peso do animal em quilos: ");
                    animal.setPeso(read.nextDouble());
                    read.nextLine();
                    System.out.print("Digite a cor do animal: ");
                    animal.setCor(read.nextLine());
                    System.out.print("Digite o habitat do animal: ");
                    animal.setHabitat(read.nextLine());
                    System.out.print("Digite a dieta do animal: ");
                    animal.setDieta(read.nextLine());
                } else if(opcao == 2){
                    System.out.println("\nSelecione a classe do animal:");
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
                        System.out.println("\nOBS: Se quiser n�o cadastrar uma das informa��es, d� ENTER (em caso de n�meros, digite 0)");
                        System.out.print("\nDigite o nome do animal: ");
                        mamifero.setNome(read.nextLine());
                        System.out.print("Classe do animal j� definida.");
                        mamifero.setClasse("Mam�fero");
                        System.out.print("Digite a ordem do animal: ");
                        mamifero.setOrdem(read.nextLine());
                        System.out.print("Tamanho do animal em metros: ");
                        mamifero.setTamanho(read.nextDouble());
                        System.out.print("Peso do animal em quilos: ");
                        mamifero.setPeso(read.nextDouble());
                        read.nextLine();
                        System.out.print("Digite a cor do animal: ");
                        mamifero.setCor(read.nextLine());
                        System.out.print("Digite o habitat do animal: ");
                        mamifero.setHabitat(read.nextLine());
                        System.out.print("Digite a dieta do animal: ");
                        mamifero.setDieta(read.nextLine());
                        
                        System.out.print("\nDigite a quantidade de mamas do mam�fero: ");
                        mamifero.setNumeroMamas(read.nextInt());
                        read.nextLine();
                        System.out.print("Digite o tipo de pelo do mam�fero: ");
                        mamifero.setTipoDePelo(read.nextLine());
                    } else {
                        System.out.println("\nOBS: Se quiser n�o cadastrar uma das informa��es, d� ENTER (em caso de n�meros, digite 0)");
                        System.out.print("\nDigite o nome do animal: ");
                        reptil.setNome(read.nextLine());
                        System.out.print("Classe do animal j� definida.");
                        reptil.setClasse("Reptil");
                        System.out.print("Digite a ordem do animal: ");
                        reptil.setOrdem(read.nextLine());
                        System.out.print("Tamanho do animal em metros: ");
                        reptil.setTamanho(read.nextDouble());
                        System.out.print("Peso do animal em quilos: ");
                        reptil.setPeso(read.nextDouble());
                        read.nextLine();
                        System.out.print("Digite a cor do animal: ");
                        reptil.setCor(read.nextLine());
                        System.out.print("Digite o habitat do animal: ");
                        reptil.setHabitat(read.nextLine());
                        System.out.print("Digite a dieta do animal: ");
                        reptil.setDieta(read.nextLine());
                    }
                } else if(opcao == 3){
                    System.out.println("\nSelecione a ordem do animal:");
                    System.out.println("\n1 - Ovino");
                    System.out.println("2 - Primata");
                    System.out.print("\nOp��o: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 2){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOp��o: ");
                        opcao = read.nextInt();
                    }
                    
                    if(opcao == 1){
                        System.out.println("\nOBS: Se quiser n�o cadastrar uma das informa��es, d� ENTER (em caso de n�meros, digite 0)");
                        System.out.print("\nDigite o nome do animal: ");
                        ovino.setNome(read.nextLine());
                        System.out.print("Classe do animal j� definida.");
                        ovino.setClasse("Mam�fero");
                        System.out.print("Ordem do animal j� definida.");
                        ovino.setOrdem("Ovino");
                        System.out.print("Tamanho do animal em metros: ");
                        ovino.setTamanho(read.nextDouble());
                        System.out.print("Peso do animal em quilos: ");
                        ovino.setPeso(read.nextDouble());
                        read.nextLine();
                        System.out.print("Digite a cor do animal: ");
                        ovino.setCor(read.nextLine());
                        System.out.print("Digite o habitat do animal: ");
                        ovino.setHabitat(read.nextLine());
                        System.out.print("Digite a dieta do animal: ");
                        ovino.setDieta(read.nextLine());
                        
                        System.out.print("\nDigite a quantidade de mamas do mam�fero: ");
                        ovino.setNumeroMamas(read.nextInt());
                        System.out.print("Digite o tipo de pelo do mam�fero: ");
                        ovino.setTipoDePelo(read.nextLine());
                        
                        System.out.println("\nO ovino possui chifre? Sim ou N�o? ");
                        resposta = read.nextLine();
                        
                        while(!resposta.equalsIgnoreCase("SIM") && !resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N�O") && !resposta.equalsIgnoreCase("N")){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOp��o: ");
                            resposta = read.nextLine();
                        }
                        
                        if(resposta.equalsIgnoreCase("SIM") || resposta.equalsIgnoreCase("S")){
                            ovino.setChifre("SIM");
                        } else {
                            ovino.setChifre("N�O");
                        }
                    } else {
                        
                    }
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
                    
                    if(opcao == 1){
                        System.out.println("\nOBS: Se quiser n�o cadastrar uma das informa��es, d� ENTER (em caso de n�meros, digite 0)");
                        System.out.print("\nNome do animal j� definido.");
                        cobra.setNome("Cobra");
                        System.out.print("Classe do animal j� definida.");
                        cobra.setClasse("Reptil");
                        System.out.print("Digite a ordem do animal: ");
                        cobra.setOrdem(read.nextLine());
                        System.out.print("Tamanho do animal em metros: ");
                        cobra.setTamanho(read.nextDouble());
                        System.out.print("Peso do animal em quilos: ");
                        cobra.setPeso(read.nextDouble());
                        read.nextLine();
                        System.out.print("Digite a cor do animal: ");
                        cobra.setCor(read.nextLine());
                        System.out.print("Digite o habitat do animal: ");
                        cobra.setHabitat(read.nextLine());
                        System.out.print("Digite a dieta do animal: ");
                        cobra.setDieta(read.nextLine());
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
                    System.out.println("Tamanho do Animal: "+animal.getTamanho()+"m");
                    System.out.println("Peso do Animal: "+animal.getPeso()+"kg");
                    System.out.println("Cor do Animal: "+animal.getCor());
                    System.out.println("Habitat do Animal: "+animal.getHabitat());
                    System.out.println("Dieta do Animal: "+animal.getDieta());
                    read.nextLine();
                }
                
            } else {
                System.out.println("\nVoc� saiu.");
                rodando = false;
            }
        }
    }
}
