package Animal;
import java.util.*;
public class Principal{
    public static void main(String[] args){
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
            System.out.println("3 - A��es");
            System.out.println("4 - Cr�ditos");
            System.out.println("5 - Sair");
            System.out.print("\nOp��o: ");
            opcao = read.nextInt();

            while(opcao < 1 || opcao > 5){
                System.out.println("\nDigite novamente.");
                System.out.print("\nOp��o: ");
                opcao = read.nextInt();
            }
            
            read.nextLine();
            
            if(opcao == 1){
                System.out.println("\nSelecione o que deseja cadastrar:");
                System.out.println("\n1 - Animal Gen�rico");//ex: Animal
                System.out.println("2 - Classe de Animal");//ex: Mam�fero e R�ptil
                System.out.println("3 - Ordem de Animal");//ex: Ovino e Primata
                System.out.println("4 - Esp�cie de Animal");//ex: Cobra, Jacar� e Ovelha
                System.out.println("5 - Voltar ao MENU");
                System.out.print("\nOp��o: ");
                opcao = read.nextInt();
                
                while(opcao < 1 || opcao > 5){
                    System.out.println("\nDigite novamente.");
                    System.out.print("\nOp��o: ");
                    opcao = read.nextInt();
                }
                
                read.nextLine();

                if(opcao == 1){
                    System.out.println("\n| ANIMAL |");
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
                    System.out.println("3 - Voltar ao MENU");

                    System.out.print("\nOp��o: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 3){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOp��o: ");
                        opcao = read.nextInt();
                    }
                    
                    read.nextLine();
                    
                    if(opcao == 1){
                        System.out.println("\n| MAM�FERO |");
                        System.out.println("\nOBS: Se quiser n�o cadastrar uma das informa��es, d� ENTER (em caso de n�meros, digite 0)");
                        System.out.print("\nDigite o nome do animal: ");
                        mamifero.setNome(read.nextLine());
                        System.out.println("Classe do animal j� definida.");
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
                    } else if(opcao == 2){
                        System.out.println("\n| REPTIL |");
                        System.out.println("\nOBS: Se quiser n�o cadastrar uma das informa��es, d� ENTER (em caso de n�meros, digite 0)");
                        System.out.print("\nDigite o nome do animal: ");
                        reptil.setNome(read.nextLine());
                        System.out.println("Classe do animal j� definida.");
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
                        
                        System.out.print("\nDigite a quantidade de patas do reptil: ");
                        reptil.setNumeroPatas(read.nextInt());
                    }
                } else if(opcao == 3){
                    System.out.println("\nSelecione a ordem do animal:");
                    System.out.println("\n1 - Ovino");
                    System.out.println("2 - Primata");
                    System.out.println("3 - Voltar ao MENU");

                    System.out.print("\nOp��o: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 3){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOp��o: ");
                        opcao = read.nextInt();
                    }
                    
                    read.nextLine();
                    
                    if(opcao == 1){
                        System.out.println("\n| OVINO |");
                        System.out.println("\nOBS: Se quiser n�o cadastrar uma das informa��es, d� ENTER (em caso de n�meros, digite 0)");
                        System.out.print("\nDigite o nome do animal: ");
                        ovino.setNome(read.nextLine());
                        System.out.println("Classe do animal j� definida.");
                        ovino.setClasse("Mam�fero");
                        System.out.println("Ordem do animal j� definida.");
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
                        read.nextLine();
                        System.out.print("Digite o tipo de pelo do mam�fero: ");
                        ovino.setTipoDePelo(read.nextLine());
                        
                        System.out.print("\nO ovino possui chifre? Sim ou N�o? ");
                        resposta = read.nextLine();
                        
                        while(!resposta.equalsIgnoreCase("SIM") && !resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N�O") && !resposta.equalsIgnoreCase("N")){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOp��o: ");
                            resposta = read.nextLine();
                        }
                        
                        ovino.setChifre(resposta);
                    } else if(opcao == 2){
                        System.out.println("\n| PRIMATA |");
                        System.out.println("\nOBS: Se quiser n�o cadastrar uma das informa��es, d� ENTER (em caso de n�meros, digite 0)");
                        System.out.print("\nDigite o nome do animal: ");
                        primata.setNome(read.nextLine());
                        System.out.println("Classe do animal j� definida.");
                        primata.setClasse("Mam�fero");
                        System.out.println("Ordem do animal j� definida.");
                        primata.setOrdem("Primata");
                        System.out.print("Tamanho do animal em metros: ");
                        primata.setTamanho(read.nextDouble());
                        System.out.print("Peso do animal em quilos: ");
                        primata.setPeso(read.nextDouble());
                        read.nextLine();
                        System.out.print("Digite a cor do animal: ");
                        primata.setCor(read.nextLine());
                        System.out.print("Digite o habitat do animal: ");
                        primata.setHabitat(read.nextLine());
                        System.out.print("Digite a dieta do animal: ");
                        primata.setDieta(read.nextLine());
                        
                        System.out.print("\nDigite a quantidade de mamas do mam�fero: ");
                        primata.setNumeroMamas(read.nextInt());
                        read.nextLine();
                        System.out.print("Digite o tipo de pelo do mam�fero: ");
                        primata.setTipoDePelo(read.nextLine());
                        
                        System.out.print("\nDigite o n�mero de dedos do primata: ");
                        primata.setNumeroDedos(read.nextInt());
                    }
                } else if(opcao == 4) {
                    System.out.println("\nSelecione o animal espec�fico:");
                    System.out.println("\n1 - Cobra");
                    System.out.println("2 - Jacar�");
                    System.out.println("3 - Ovelha");
                    System.out.println("4 - Voltar ao MENU");

                    System.out.print("\nOp��o: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 4){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOp��o: ");
                        opcao = read.nextInt();
                    }
                    
                    read.nextLine();
                    
                    if(opcao == 1){
                        System.out.println("\n| COBRA |");
                        System.out.println("\nOBS: Se quiser n�o cadastrar uma das informa��es, d� ENTER (em caso de n�meros, digite 0)");
                        System.out.println("\nNome do animal j� definido.");
                        cobra.setNome("Cobra");
                        System.out.println("Classe do animal j� definida.");
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
                        
                        System.out.print("\nDigite a quantidade de patas do reptil: ");
                        reptil.setNumeroPatas(read.nextInt());
                        read.nextLine();
                        System.out.print("\nA cobra � pe�onhenta? Sim ou N�o? ");
                        resposta = read.nextLine();
                        
                        while(!resposta.equalsIgnoreCase("SIM") && !resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N�O") && !resposta.equalsIgnoreCase("N")){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOp��o: ");
                            resposta = read.nextLine();
                        }
                        
                        cobra.setPeconha(resposta);
                        
                        System.out.print("A cobra possui vis�o infravermelha? Sim ou N�o? ");
                        resposta = read.nextLine();
                        
                        while(!resposta.equalsIgnoreCase("SIM") && !resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N�O") && !resposta.equalsIgnoreCase("N")){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOp��o: ");
                            resposta = read.nextLine();
                        }
                        
                        cobra.setSensorDeCalor(resposta);
                    } else if(opcao == 2){
                        System.out.println("\n| JACAR� |");
                        System.out.println("\nOBS: Se quiser n�o cadastrar uma das informa��es, d� ENTER (em caso de n�meros, digite 0)");
                        System.out.println("\nNome do animal j� definido.");
                        jacare.setNome("Jacar�");
                        System.out.println("Classe do animal j� definida.");
                        jacare.setClasse("Reptil");
                        System.out.print("Digite a ordem do animal: ");
                        jacare.setOrdem(read.nextLine());
                        System.out.print("Tamanho do animal em metros: ");
                        jacare.setTamanho(read.nextDouble());
                        System.out.print("Peso do animal em quilos: ");
                        jacare.setPeso(read.nextDouble());
                        read.nextLine();
                        System.out.print("Digite a cor do animal: ");
                        jacare.setCor(read.nextLine());
                        System.out.print("Digite o habitat do animal: ");
                        jacare.setHabitat(read.nextLine());
                        System.out.print("Digite a dieta do animal: ");
                        jacare.setDieta(read.nextLine());
                        
                        System.out.print("\nDigite a quantidade de patas do reptil: ");
                        jacare.setNumeroPatas(read.nextInt());
                        
                        System.out.print("\nDigite a quantidade de garras do jacar�: ");
                        jacare.setNumeroGarras(read.nextInt());
                    } else if(opcao == 3){
                        System.out.println("\n| OVELHA |");
                        System.out.println("\nOBS: Se quiser n�o cadastrar uma das informa��es, d� ENTER (em caso de n�meros, digite 0)");
                        System.out.println("\nNome do animal j� definido.");
                        ovelha.setNome("Ovelha");
                        System.out.println("Classe do animal j� definida.");
                        ovelha.setClasse("Mam�fero");
                        System.out.println("Ordem do animal j� definida.");
                        ovelha.setOrdem("Ovino");
                        System.out.print("Tamanho do animal em metros: ");
                        ovelha.setTamanho(read.nextDouble());
                        System.out.print("Peso do animal em quilos: ");
                        ovelha.setPeso(read.nextDouble());
                        read.nextLine();
                        System.out.print("Digite a cor do animal: ");
                        ovelha.setCor(read.nextLine());
                        System.out.print("Digite o habitat do animal: ");
                        ovelha.setHabitat(read.nextLine());
                        System.out.print("Digite a dieta do animal: ");
                        ovelha.setDieta(read.nextLine());
                        
                        System.out.print("\nDigite a quantidade de mamas do mam�fero: ");
                        ovelha.setNumeroMamas(read.nextInt());
                        read.nextLine();
                        System.out.print("Digite o tipo de pelo do mam�fero: ");
                        ovelha.setTipoDePelo(read.nextLine());
                        
                        System.out.print("\nO ovino possui chifre? Sim ou N�o? ");
                        resposta = read.nextLine();
                        
                        while(!resposta.equalsIgnoreCase("SIM") && !resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N�O") && !resposta.equalsIgnoreCase("N")){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOp��o: ");
                            resposta = read.nextLine();
                        }
                        
                        ovelha.setChifre(resposta);
                        
                        System.out.print("\nA ovelha est� com l�? Sim ou N�o? ");
                        resposta = read.nextLine();
                        
                        while(!resposta.equalsIgnoreCase("SIM") && !resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N�O") && !resposta.equalsIgnoreCase("N")){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOp��o: ");
                            resposta = read.nextLine();
                        }
                        
                        ovelha.setLa(resposta);
                    }
                }
            } else if(opcao == 2){
                System.out.println("\nSelecione o que deseja mostrar:");
                System.out.println("\n1 - Animal Gen�rico");
                System.out.println("2 - Classe de Animal");
                System.out.println("3 - Ordem de Animal");
                System.out.println("4 - Esp�cie de Animal");
                System.out.println("5 - Voltar ao MENU");
                System.out.print("\nOp��o: ");
                opcao = read.nextInt();
                
                while(opcao < 1 || opcao > 5){
                    System.out.println("\nDigite novamente.");
                    System.out.print("\nOp��o: ");
                    opcao = read.nextInt();
                }
                
                read.nextLine();
                
                if(opcao == 1){
                    System.out.println("\nNome do Animal: "+animal.getNome());
                    System.out.println("Classe do Animal: "+animal.getClasse());
                    System.out.println("Ordem do Animal: "+animal.getOrdem());
                    System.out.println("Tamanho do Animal: "+animal.getTamanho()+"m");
                    System.out.println("Peso do Animal: "+animal.getPeso()+"kg");
                    System.out.println("Cor do Animal: "+animal.getCor());
                    System.out.println("Habitat do Animal: "+animal.getHabitat());
                    System.out.println("Dieta do Animal: "+animal.getDieta());
                    System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU");
                    read.nextLine();
                } else if(opcao == 2){
                    System.out.println("\nSelecione a classe que deseja mostrar:");
                    System.out.println("\n1 - Mam�fero");
                    System.out.println("2 - Reptil");
                    System.out.println("3 - Voltar ao MENU");
                    System.out.print("\nOp��o: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 3){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOp��o: ");
                        opcao = read.nextInt();
                    }
                    
                    read.nextLine();
                    
                    if(opcao == 1){
                        System.out.println("\nNome do Animal: "+mamifero.getNome());
                        System.out.println("Classe do Animal: "+mamifero.getClasse());
                        System.out.println("Ordem do Animal: "+mamifero.getOrdem());
                        System.out.println("Tamanho do Animal: "+mamifero.getTamanho()+"m");
                        System.out.println("Peso do Animal: "+mamifero.getPeso()+"kg");
                        System.out.println("Cor do Animal: "+mamifero.getCor());
                        System.out.println("Habitat do Animal: "+mamifero.getHabitat());
                        System.out.println("Dieta do Animal: "+mamifero.getDieta());
                        System.out.println("\nN�mero de Mamas do Mam�fero: "+mamifero.getNumeroMamas());
                        System.out.println("Tipo de Pelo do Mam�fero: "+mamifero.getTipoDePelo());
                        read.nextLine();
                    } else if(opcao == 2){
                        System.out.println("\nNome do Animal: "+reptil.getNome());
                        System.out.println("Classe do Animal: "+reptil.getClasse());
                        System.out.println("Ordem do Animal: "+reptil.getOrdem());
                        System.out.println("Tamanho do Animal: "+reptil.getTamanho()+"m");
                        System.out.println("Peso do Animal: "+reptil.getPeso()+"kg");
                        System.out.println("Cor do Animal: "+reptil.getCor());
                        System.out.println("Habitat do Animal: "+reptil.getHabitat());
                        System.out.println("Dieta do Animal: "+reptil.getDieta());
                        System.out.println("\nN�mero de Patas do Reptil: "+reptil.getNumeroPatas());
                        read.nextLine();
                    }
                } else if(opcao == 3){
                    System.out.println("\nSelecione a ordem que deseja mostrar:");
                    System.out.println("\n1 - Ovino");
                    System.out.println("2 - Primata");
                    System.out.println("3 - Voltar ao MENU");
                    System.out.print("\nOp��o: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 3){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOp��o: ");
                        opcao = read.nextInt();
                    }
                    
                    read.nextLine();
                    
                    if(opcao == 1){
                        System.out.println("\nNome do Animal: "+ovino.getNome());
                        System.out.println("Classe do Animal: "+ovino.getClasse());
                        System.out.println("Ordem do Animal: "+ovino.getOrdem());
                        System.out.println("Tamanho do Animal: "+ovino.getTamanho()+"m");
                        System.out.println("Peso do Animal: "+ovino.getPeso()+"kg");
                        System.out.println("Cor do Animal: "+ovino.getCor());
                        System.out.println("Habitat do Animal: "+ovino.getHabitat());
                        System.out.println("Dieta do Animal: "+ovino.getDieta());
                        System.out.println("\nN�mero de Mamas do Mam�fero: "+ovino.getNumeroMamas());
                        System.out.println("Tipo de Pelo do Mam�fero: "+ovino.getTipoDePelo());
                        System.out.println("\nO ovino tem chifre? "+ovino.getChifre());
                        read.nextLine();
                    } else if(opcao == 2){
                        System.out.println("\nNome do Animal: "+primata.getNome());
                        System.out.println("Classe do Animal: "+primata.getClasse());
                        System.out.println("Ordem do Animal: "+primata.getOrdem());
                        System.out.println("Tamanho do Animal: "+primata.getTamanho()+"m");
                        System.out.println("Peso do Animal: "+primata.getPeso()+"kg");
                        System.out.println("Cor do Animal: "+primata.getCor());
                        System.out.println("Habitat do Animal: "+primata.getHabitat());
                        System.out.println("Dieta do Animal: "+primata.getDieta());
                        System.out.println("\nN�mero de Mamas do Mam�fero: "+primata.getNumeroMamas());
                        System.out.println("Tipo de Pelo do Mam�fero: "+primata.getTipoDePelo());
                        System.out.println("\nN�mero de Dedos do Primata: "+primata.getNumeroDedos());
                        read.nextLine();
                    }
                } else if(opcao == 4){
                    System.out.println("\nSelecione a esp�cie que deseja mostrar:");
                    System.out.println("\n1 - Cobra");
                    System.out.println("2 - Jacar�");
                    System.out.println("3 - Ovelha");
                    System.out.println("4 - Voltar ao MENU");
                    System.out.print("\nOp��o: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 4){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOp��o: ");
                        opcao = read.nextInt();
                    }
                    
                    read.nextLine();
                    
                    if(opcao == 1){
                        System.out.println("\nNome do Animal: "+cobra.getNome());
                        System.out.println("Classe do Animal: "+cobra.getClasse());
                        System.out.println("Ordem do Animal: "+cobra.getOrdem());
                        System.out.println("Tamanho do Animal: "+cobra.getTamanho()+"m");
                        System.out.println("Peso do Animal: "+cobra.getPeso()+"kg");
                        System.out.println("Cor do Animal: "+cobra.getCor());
                        System.out.println("Habitat do Animal: "+cobra.getHabitat());
                        System.out.println("Dieta do Animal: "+cobra.getDieta());
                        System.out.println("\nN�mero de Patas do Reptil: "+cobra.getNumeroPatas());
                        System.out.println("\nA cobra � pe�onhenta? "+cobra.getPeconha());
                        System.out.println("A cobra possui vis�o infravermelha? "+cobra.getSensorDeCalor());
                        read.nextLine();
                    } else if(opcao == 2){
                        System.out.println("\nNome do Animal: "+jacare.getNome());
                        System.out.println("Classe do Animal: "+jacare.getClasse());
                        System.out.println("Ordem do Animal: "+jacare.getOrdem());
                        System.out.println("Tamanho do Animal: "+jacare.getTamanho()+"m");
                        System.out.println("Peso do Animal: "+jacare.getPeso()+"kg");
                        System.out.println("Cor do Animal: "+jacare.getCor());
                        System.out.println("Habitat do Animal: "+jacare.getHabitat());
                        System.out.println("Dieta do Animal: "+jacare.getDieta());
                        System.out.println("\nN�mero de Patas do Reptil: "+jacare.getNumeroPatas());
                        System.out.println("\nN�mero de Garras do Jacar�: "+jacare.getNumeroGarras());
                        read.nextLine();
                    } else if(opcao == 3){
                        System.out.println("\nNome do Animal: "+ovelha.getNome());
                        System.out.println("Classe do Animal: "+ovelha.getClasse());
                        System.out.println("Ordem do Animal: "+ovelha.getOrdem());
                        System.out.println("Tamanho do Animal: "+ovelha.getTamanho()+"m");
                        System.out.println("Peso do Animal: "+ovelha.getPeso()+"kg");
                        System.out.println("Cor do Animal: "+ovelha.getCor());
                        System.out.println("Habitat do Animal: "+ovelha.getHabitat());
                        System.out.println("Dieta do Animal: "+ovelha.getDieta());
                        System.out.println("\nN�mero de Mamas do Mam�fero: "+ovelha.getNumeroMamas());
                        System.out.println("Tipo de Pelo do Mam�fero: "+ovelha.getTipoDePelo());
                        System.out.println("\nO ovino tem chifre? "+ovelha.getChifre());
                        System.out.println("\nA ovelha est� com l�? "+ovelha.getLa());
                        read.nextLine();
                    }
                }
            } else if(opcao == 3){
                
            } else if(opcao == 4){
                System.out.println("\nPrograma feito por Luan Gibson e Rafael Yu");
                System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                read.nextLine();
            } else {
                System.out.println("\nVoc� saiu.");
                rodando = false;
            }
        }
    }
}
