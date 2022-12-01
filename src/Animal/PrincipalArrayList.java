package Animal;
import java.util.*;
public class PrincipalArrayList{
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
        
        ArrayList<Animal> vAnimal = new ArrayList();
        ArrayList<Mamifero> vMamifero = new ArrayList();
        ArrayList<Reptil> vReptil = new ArrayList();
        ArrayList<Ovino> vOvino = new ArrayList();
        ArrayList<Primata> vPrimata = new ArrayList();
        ArrayList<Cobra> vCobra = new ArrayList();
        ArrayList<Jacare> vJacare = new ArrayList();
        ArrayList<Ovelha> vOvelha = new ArrayList();
        
        while(rodando){
            System.out.println("\nMENU");
            System.out.println("\n1 - Cadastrar");
            System.out.println("2 - Mostrar");
            System.out.println("3 - Ações");
            System.out.println("4 - Créditos");
            System.out.println("5 - Sair");
            System.out.print("\nOpção: ");
            opcao = read.nextInt();

            while(opcao < 1 || opcao > 5){
                System.out.println("\nDigite novamente.");
                System.out.print("\nOpção: ");
                opcao = read.nextInt();
            }
            
            read.nextLine();
            
            if(opcao == 1){
                System.out.println("\nSelecione o que deseja cadastrar:");
                System.out.println("\n1 - Animal Genérico");//ex: Animal
                System.out.println("2 - Classe de Animal");//ex: Mamífero e Réptil
                System.out.println("3 - Ordem de Animal");//ex: Ovino e Primata
                System.out.println("4 - Espécie de Animal");//ex: Cobra, Jacaré e Ovelha
                System.out.println("5 - Voltar ao MENU");
                System.out.print("\nOpção: ");
                opcao = read.nextInt();
                
                while(opcao < 1 || opcao > 5){
                    System.out.println("\nDigite novamente.");
                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                }
                
                read.nextLine();

                if(opcao == 1){
                    animal = new Animal();
                    System.out.println("\n| ANIMAL |");
                    System.out.println("\nOBS: Se quiser não cadastrar uma das informações, dê ENTER (em caso de números, digite 0)");
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
                    vAnimal.add(animal);
                } else if(opcao == 2){
                    System.out.println("\nSelecione qual classe de animal quer cadastrar:");
                    System.out.println("\n1 - Mamífero");
                    System.out.println("2 - Réptil");
                    System.out.println("3 - Voltar ao MENU");

                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 3){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                    }
                    
                    read.nextLine();
                    
                    if(opcao == 1){
                        mamifero = new Mamifero();
                        System.out.println("\n| MAMÍFERO |");
                        System.out.println("\nOBS: Se quiser não cadastrar uma das informações, dê ENTER (em caso de números, digite 0)");
                        System.out.print("\nDigite o nome do animal: ");
                        mamifero.setNome(read.nextLine());
                        System.out.println("Classe do animal já definida.");
                        mamifero.setClasse("Mamífero");
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
                        
                        System.out.print("\nDigite a quantidade de mamas do mamífero: ");
                        mamifero.setNumeroMamas(read.nextInt());
                        read.nextLine();
                        System.out.print("Digite o tipo de pelo do mamífero: ");
                        mamifero.setTipoDePelo(read.nextLine());
                        vMamifero.add(mamifero);
                    } else if(opcao == 2){
                        reptil = new Reptil();
                        System.out.println("\n| REPTIL |");
                        System.out.println("\nOBS: Se quiser não cadastrar uma das informações, dê ENTER (em caso de números, digite 0)");
                        System.out.print("\nDigite o nome do animal: ");
                        reptil.setNome(read.nextLine());
                        System.out.println("Classe do animal já definida.");
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
                        vReptil.add(reptil);
                    }
                } else if(opcao == 3){
                    System.out.println("\nSelecione qual ordem de animal quer cadastrar:");
                    System.out.println("\n1 - Ovino");
                    System.out.println("2 - Primata");
                    System.out.println("3 - Voltar ao MENU");

                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 3){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                    }
                    
                    read.nextLine();
                    
                    if(opcao == 1){
                        ovino = new Ovino();
                        System.out.println("\n| OVINO |");
                        System.out.println("\nOBS: Se quiser não cadastrar uma das informações, dê ENTER (em caso de números, digite 0)");
                        System.out.print("\nDigite o nome do animal: ");
                        ovino.setNome(read.nextLine());
                        System.out.println("Classe do animal já definida.");
                        ovino.setClasse("Mamífero");
                        System.out.println("Ordem do animal já definida.");
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
                        
                        System.out.print("\nDigite a quantidade de mamas do mamífero: ");
                        ovino.setNumeroMamas(read.nextInt());
                        read.nextLine();
                        System.out.print("Digite o tipo de pelo do mamífero: ");
                        ovino.setTipoDePelo(read.nextLine());
                        
                        System.out.print("\nO ovino possui chifre? Sim ou Não? ");
                        resposta = read.nextLine();
                        
                        while(!resposta.equalsIgnoreCase("SIM") && !resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("NÃO") && !resposta.equalsIgnoreCase("N")){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            resposta = read.nextLine();
                        }
                        
                        ovino.setChifre(resposta);
                        vOvino.add(ovino);
                    } else if(opcao == 2){
                        primata = new Primata();
                        System.out.println("\n| PRIMATA |");
                        System.out.println("\nOBS: Se quiser não cadastrar uma das informações, dê ENTER (em caso de números, digite 0)");
                        System.out.print("\nDigite o nome do animal: ");
                        primata.setNome(read.nextLine());
                        System.out.println("Classe do animal já definida.");
                        primata.setClasse("Mamífero");
                        System.out.println("Ordem do animal já definida.");
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
                        
                        System.out.print("\nDigite a quantidade de mamas do mamífero: ");
                        primata.setNumeroMamas(read.nextInt());
                        read.nextLine();
                        System.out.print("Digite o tipo de pelo do mamífero: ");
                        primata.setTipoDePelo(read.nextLine());
                        
                        System.out.print("\nDigite o número de dedos do primata: ");
                        primata.setNumeroDedos(read.nextInt());
                        vPrimata.add(primata);
                    }
                } else if(opcao == 4) {
                    System.out.println("\nSelecione qual espécie de animal quer mostrar:");
                    System.out.println("\n1 - Cobra");
                    System.out.println("2 - Jacaré");
                    System.out.println("3 - Ovelha");
                    System.out.println("4 - Voltar ao MENU");

                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 4){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                    }
                    
                    read.nextLine();
                    
                    if(opcao == 1){
                        cobra = new Cobra();
                        System.out.println("\n| COBRA |");
                        System.out.println("\nOBS: Se quiser não cadastrar uma das informações, dê ENTER (em caso de números, digite 0)");
                        System.out.println("\nNome do animal já definido.");
                        cobra.setNome("Cobra");
                        System.out.println("Classe do animal já definida.");
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
                        System.out.print("\nA cobra é peçonhenta? Sim ou Não? ");
                        resposta = read.nextLine();
                        
                        while(!resposta.equalsIgnoreCase("SIM") && !resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("NÃO") && !resposta.equalsIgnoreCase("N")){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            resposta = read.nextLine();
                        }
                        
                        cobra.setPeconha(resposta);
                        
                        System.out.print("A cobra possui visão infravermelha? Sim ou Não? ");
                        resposta = read.nextLine();
                        
                        while(!resposta.equalsIgnoreCase("SIM") && !resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("NÃO") && !resposta.equalsIgnoreCase("N")){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            resposta = read.nextLine();
                        }
                        
                        cobra.setSensorDeCalor(resposta);
                        vCobra.add(cobra);
                    } else if(opcao == 2){
                        jacare = new Jacare();
                        System.out.println("\n| JACARÉ |");
                        System.out.println("\nOBS: Se quiser não cadastrar uma das informações, dê ENTER (em caso de números, digite 0)");
                        System.out.println("\nNome do animal já definido.");
                        jacare.setNome("Jacaré");
                        System.out.println("Classe do animal já definida.");
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
                        
                        System.out.print("\nDigite a quantidade de garras do jacaré: ");
                        jacare.setNumeroGarras(read.nextInt());
                        vJacare.add(jacare);
                    } else if(opcao == 3){
                        ovelha = new Ovelha();
                        System.out.println("\n| OVELHA |");
                        System.out.println("\nOBS: Se quiser não cadastrar uma das informações, dê ENTER (em caso de números, digite 0)");
                        System.out.println("\nNome do animal já definido.");
                        ovelha.setNome("Ovelha");
                        System.out.println("Classe do animal já definida.");
                        ovelha.setClasse("Mamífero");
                        System.out.println("Ordem do animal já definida.");
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
                        
                        System.out.print("\nDigite a quantidade de mamas do mamífero: ");
                        ovelha.setNumeroMamas(read.nextInt());
                        read.nextLine();
                        System.out.print("Digite o tipo de pelo do mamífero: ");
                        ovelha.setTipoDePelo(read.nextLine());
                        
                        System.out.print("\nO ovino possui chifre? Sim ou Não? ");
                        resposta = read.nextLine();
                        
                        while(!resposta.equalsIgnoreCase("SIM") && !resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("NÃO") && !resposta.equalsIgnoreCase("N")){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            resposta = read.nextLine();
                        }
                        
                        ovelha.setChifre(resposta);
                        
                        System.out.print("\nA ovelha está com lã? Sim ou Não? ");
                        resposta = read.nextLine();
                        
                        while(!resposta.equalsIgnoreCase("SIM") && !resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("NÃO") && !resposta.equalsIgnoreCase("N")){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            resposta = read.nextLine();
                        }
                        
                        ovelha.setLa(resposta);
                        vOvelha.add(ovelha);
                    }
                }
            } else if(opcao == 2){
                System.out.println("\nSelecione o que deseja mostrar:");
                System.out.println("\n1 - Animal Genérico");
                System.out.println("2 - Classe de Animal");
                System.out.println("3 - Ordem de Animal");
                System.out.println("4 - Espécie de Animal");
                System.out.println("5 - Voltar ao MENU");
                System.out.print("\nOpção: ");
                opcao = read.nextInt();
                
                while(opcao < 1 || opcao > 5){
                    System.out.println("\nDigite novamente.");
                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                }
                
                read.nextLine();
                
                if(opcao == 1){
                    System.out.println("\nSelecione qual animal quer mostrar: \n");
                    
                    for (int i = 0; i < vAnimal.size(); i++) {
                        System.out.println(i+" - "+vAnimal.get(i).getNome());
                    }
                    
                    System.out.println("\n100 - TODOS");
                    System.out.println("999 - Voltar ao MENU");
                    
                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 0 || opcao > vAnimal.lastIndexOf(animal) && opcao != 100 && opcao != 999){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                    }
                    
                    read.nextLine();
                    
                    if(opcao == 100){
                        for (int i = 0; i < vAnimal.size(); i++) {
                            System.out.println("\n| Animal #"+i+" |");
                            System.out.println("\nNome do Animal: "+vAnimal.get(i).getNome());
                            System.out.println("Classe do Animal: "+vAnimal.get(i).getClasse());
                            System.out.println("Ordem do Animal: "+vAnimal.get(i).getOrdem());
                            System.out.println("Tamanho do Animal: "+vAnimal.get(i).getTamanho()+"m");
                            System.out.println("Peso do Animal: "+vAnimal.get(i).getPeso()+"kg");
                            System.out.println("Cor do Animal: "+vAnimal.get(i).getCor());
                            System.out.println("Habitat do Animal: "+vAnimal.get(i).getHabitat());
                            System.out.println("Dieta do Animal: "+vAnimal.get(i).getDieta());
                        }
                        System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                        read.nextLine();
                    } else if(opcao == 999){
                    } else {
                        System.out.println("\n| Animal #"+opcao+" |");
                        System.out.println("\nNome do Animal: "+vAnimal.get(opcao).getNome());
                        System.out.println("Classe do Animal: "+vAnimal.get(opcao).getClasse());
                        System.out.println("Ordem do Animal: "+vAnimal.get(opcao).getOrdem());
                        System.out.println("Tamanho do Animal: "+vAnimal.get(opcao).getTamanho()+"m");
                        System.out.println("Peso do Animal: "+vAnimal.get(opcao).getPeso()+"kg");
                        System.out.println("Cor do Animal: "+vAnimal.get(opcao).getCor());
                        System.out.println("Habitat do Animal: "+vAnimal.get(opcao).getHabitat());
                        System.out.println("Dieta do Animal: "+vAnimal.get(opcao).getDieta());
                        System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                        read.nextLine();
                    }
                } else if(opcao == 2){
                    System.out.println("\nSelecione a classe que deseja mostrar:");
                    System.out.println("\n1 - Mamífero");
                    System.out.println("2 - Reptil");
                    System.out.println("3 - Voltar ao MENU");
                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 3){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                    }
                    
                    read.nextLine();
                    
                    if(opcao == 1){
                        System.out.println("\nSelecione qual mamífero quer mostrar: \n");
                        
                        for (int i = 0; i < vMamifero.size(); i++) {
                            System.out.println(i+" - "+vMamifero.get(i).getNome());
                        }

                        System.out.println("\n100 - TODOS");
                        System.out.println("999 - Voltar ao MENU");

                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                        
                        while(opcao < 0 || opcao > vMamifero.lastIndexOf(mamifero) && opcao != 100 && opcao != 999){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            opcao = read.nextInt();
                        }

                        read.nextLine();

                        if(opcao == 100){
                            for (int i = 0; i < vMamifero.size(); i++) {
                                System.out.println("\n| Mamífero #"+i+" |");
                                System.out.println("\nNome do Animal: "+vMamifero.get(i).getNome());
                                System.out.println("Classe do Animal: "+vMamifero.get(i).getClasse());
                                System.out.println("Ordem do Animal: "+vMamifero.get(i).getOrdem());
                                System.out.println("Tamanho do Animal: "+vMamifero.get(i).getTamanho()+"m");
                                System.out.println("Peso do Animal: "+vMamifero.get(i).getPeso()+"kg");
                                System.out.println("Cor do Animal: "+vMamifero.get(i).getCor());
                                System.out.println("Habitat do Animal: "+vMamifero.get(i).getHabitat());
                                System.out.println("Dieta do Animal: "+vMamifero.get(i).getDieta());
                                System.out.println("\nNúmero de Mamas do Mamífero: "+vMamifero.get(i).getNumeroMamas());
                                System.out.println("Tipo de Pelo do Mamífero: "+vMamifero.get(i).getTipoDePelo());
                            }
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        } else if(opcao == 999){
                        } else {
                            System.out.println("\n| Mamífero #"+opcao+" |");
                            System.out.println("\nNome do Animal: "+vMamifero.get(opcao).getNome());
                            System.out.println("Classe do Animal: "+vMamifero.get(opcao).getClasse());
                            System.out.println("Ordem do Animal: "+vMamifero.get(opcao).getOrdem());
                            System.out.println("Tamanho do Animal: "+vMamifero.get(opcao).getTamanho()+"m");
                            System.out.println("Peso do Animal: "+vMamifero.get(opcao).getPeso()+"kg");
                            System.out.println("Cor do Animal: "+vMamifero.get(opcao).getCor());
                            System.out.println("Habitat do Animal: "+vMamifero.get(opcao).getHabitat());
                            System.out.println("Dieta do Animal: "+vMamifero.get(opcao).getDieta());
                            System.out.println("\nNúmero de Mamas do Mamífero: "+vMamifero.get(opcao).getNumeroMamas());
                            System.out.println("Tipo de Pelo do Mamífero: "+vMamifero.get(opcao).getTipoDePelo());
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                    } else if(opcao == 2){
                        System.out.println("\nSelecione qual reptil quer mostrar: \n");

                        for (int i = 0; i < vReptil.size(); i++) {
                            System.out.println(i+" - "+vReptil.get(i).getNome());
                        }

                        System.out.println("\n100 - TODOS");
                        System.out.println("999 - Voltar ao MENU");

                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                        
                        while(opcao < 0 || opcao > vReptil.lastIndexOf(reptil) && opcao != 100 && opcao != 999){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            opcao = read.nextInt();
                        }

                        read.nextLine();

                        if(opcao == 100){
                            for (int i = 0; i < vReptil.size(); i++) {
                                System.out.println("\n| Reptil #"+i+" |");
                                System.out.println("\nNome do Animal: "+vReptil.get(i).getNome());
                                System.out.println("Classe do Animal: "+vReptil.get(i).getClasse());
                                System.out.println("Ordem do Animal: "+vReptil.get(i).getOrdem());
                                System.out.println("Tamanho do Animal: "+vReptil.get(i).getTamanho()+"m");
                                System.out.println("Peso do Animal: "+vReptil.get(i).getPeso()+"kg");
                                System.out.println("Cor do Animal: "+vReptil.get(i).getCor());
                                System.out.println("Habitat do Animal: "+vReptil.get(i).getHabitat());
                                System.out.println("Dieta do Animal: "+vReptil.get(i).getDieta());
                                System.out.println("\nNúmero de Patas do Reptil: "+vReptil.get(i).getNumeroPatas());
                            }
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        } else if(opcao == 999){
                        } else {
                            System.out.println("\n| Reptil #"+opcao+" |");
                            System.out.println("\nNome do Animal: "+vReptil.get(opcao).getNome());
                            System.out.println("Classe do Animal: "+vReptil.get(opcao).getClasse());
                            System.out.println("Ordem do Animal: "+vReptil.get(opcao).getOrdem());
                            System.out.println("Tamanho do Animal: "+vReptil.get(opcao).getTamanho()+"m");
                            System.out.println("Peso do Animal: "+vReptil.get(opcao).getPeso()+"kg");
                            System.out.println("Cor do Animal: "+vReptil.get(opcao).getCor());
                            System.out.println("Habitat do Animal: "+vReptil.get(opcao).getHabitat());
                            System.out.println("Dieta do Animal: "+vReptil.get(opcao).getDieta());
                            System.out.println("\nNúmero de Patas do Reptil: "+vReptil.get(opcao).getNumeroPatas());
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                    }
                } else if(opcao == 3){
                    System.out.println("\nSelecione a ordem que deseja mostrar:");
                    System.out.println("\n1 - Ovino");
                    System.out.println("2 - Primata");
                    System.out.println("3 - Voltar ao MENU");
                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 3){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                    }
                    
                    read.nextLine();
                    
                    if(opcao == 1){
                        System.out.println("\nSelecione qual ovino quer mostrar: \n");

                        for (int i = 0; i < vOvino.size(); i++) {
                            System.out.println(i+" - "+vOvino.get(i).getNome());
                        }

                        System.out.println("\n100 - TODOS");
                        System.out.println("999 - Voltar ao MENU");

                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                        
                        while(opcao < 0 || opcao > vOvino.lastIndexOf(ovino) && opcao != 100 && opcao != 999){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            opcao = read.nextInt();
                        }
                        
                        read.nextLine();

                        if(opcao == 100){
                            for (int i = 0; i < vOvino.size(); i++) {
                                System.out.println("\n| Ovino #"+i+" |");
                                System.out.println("\nNome do Animal: "+vOvino.get(i).getNome());
                                System.out.println("Classe do Animal: "+vOvino.get(i).getClasse());
                                System.out.println("Ordem do Animal: "+vOvino.get(i).getOrdem());
                                System.out.println("Tamanho do Animal: "+vOvino.get(i).getTamanho()+"m");
                                System.out.println("Peso do Animal: "+vOvino.get(i).getPeso()+"kg");
                                System.out.println("Cor do Animal: "+vOvino.get(i).getCor());
                                System.out.println("Habitat do Animal: "+vOvino.get(i).getHabitat());
                                System.out.println("Dieta do Animal: "+vOvino.get(i).getDieta());
                                System.out.println("\nNúmero de Mamas do Mamífero: "+vOvino.get(i).getNumeroMamas());
                                System.out.println("Tipo de Pelo do Mamífero: "+vOvino.get(i).getTipoDePelo());
                                System.out.println("\nO ovino tem chifre? "+vOvino.get(i).getChifre());
                            }
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        } else if(opcao == 999){
                        } else {
                            System.out.println("\n| Ovino #"+opcao+" |");
                            System.out.println("\nNome do Animal: "+vOvino.get(opcao).getNome());
                            System.out.println("Classe do Animal: "+vOvino.get(opcao).getClasse());
                            System.out.println("Ordem do Animal: "+vOvino.get(opcao).getOrdem());
                            System.out.println("Tamanho do Animal: "+vOvino.get(opcao).getTamanho()+"m");
                            System.out.println("Peso do Animal: "+vOvino.get(opcao).getPeso()+"kg");
                            System.out.println("Cor do Animal: "+vOvino.get(opcao).getCor());
                            System.out.println("Habitat do Animal: "+vOvino.get(opcao).getHabitat());
                            System.out.println("Dieta do Animal: "+vOvino.get(opcao).getDieta());
                            System.out.println("\nNúmero de Mamas do Mamífero: "+vOvino.get(opcao).getNumeroMamas());
                            System.out.println("Tipo de Pelo do Mamífero: "+vOvino.get(opcao).getTipoDePelo());
                            System.out.println("\nO ovino tem chifre? "+vOvino.get(opcao).getChifre());
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                    } else if(opcao == 2){
                        System.out.println("\nSelecione qual primata quer mostrar: \n");

                        for (int i = 0; i < vPrimata.size(); i++) {
                            System.out.println(i+" - "+vPrimata.get(i).getNome());
                        }

                        System.out.println("\n100 - TODOS");
                        System.out.println("999 - Voltar ao MENU");

                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();

                        while(opcao < 0 || opcao > vPrimata.lastIndexOf(primata) && opcao != 100 && opcao != 999){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            opcao = read.nextInt();
                        }
                        
                        read.nextLine();

                        if(opcao == 100){
                            for (int i = 0; i < vPrimata.size(); i++) {
                                System.out.println("\n| Primata #"+i+" |");
                                System.out.println("\nNome do Animal: "+vPrimata.get(i).getNome());
                                System.out.println("Classe do Animal: "+vPrimata.get(i).getClasse());
                                System.out.println("Ordem do Animal: "+vPrimata.get(i).getOrdem());
                                System.out.println("Tamanho do Animal: "+vPrimata.get(i).getTamanho()+"m");
                                System.out.println("Peso do Animal: "+vPrimata.get(i).getPeso()+"kg");
                                System.out.println("Cor do Animal: "+vPrimata.get(i).getCor());
                                System.out.println("Habitat do Animal: "+vPrimata.get(i).getHabitat());
                                System.out.println("Dieta do Animal: "+vPrimata.get(i).getDieta());
                                System.out.println("\nNúmero de Mamas do Mamífero: "+vPrimata.get(i).getNumeroMamas());
                                System.out.println("Tipo de Pelo do Mamífero: "+vPrimata.get(i).getTipoDePelo());
                                System.out.println("\nNúmero de Dedos do Primata: "+vPrimata.get(i).getNumeroDedos());
                            }
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        } else if(opcao == 999){
                        } else {
                            System.out.println("\n| Primata #"+opcao+" |");
                            System.out.println("\nNome do Animal: "+vPrimata.get(opcao).getNome());
                            System.out.println("Classe do Animal: "+vPrimata.get(opcao).getClasse());
                            System.out.println("Ordem do Animal: "+vPrimata.get(opcao).getOrdem());
                            System.out.println("Tamanho do Animal: "+vPrimata.get(opcao).getTamanho()+"m");
                            System.out.println("Peso do Animal: "+vPrimata.get(opcao).getPeso()+"kg");
                            System.out.println("Cor do Animal: "+vPrimata.get(opcao).getCor());
                            System.out.println("Habitat do Animal: "+vPrimata.get(opcao).getHabitat());
                            System.out.println("Dieta do Animal: "+vPrimata.get(opcao).getDieta());
                            System.out.println("\nNúmero de Mamas do Mamífero: "+vPrimata.get(opcao).getNumeroMamas());
                            System.out.println("Tipo de Pelo do Mamífero: "+vPrimata.get(opcao).getTipoDePelo());
                            System.out.println("\nNúmero de Dedos do Primata: "+vPrimata.get(opcao).getNumeroDedos());
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                    }
                } else if(opcao == 4){
                    System.out.println("\nSelecione a espécie que deseja mostrar:");
                    System.out.println("\n1 - Cobra");
                    System.out.println("2 - Jacaré");
                    System.out.println("3 - Ovelha");
                    System.out.println("4 - Voltar ao MENU");
                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 4){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                    }
                    
                    read.nextLine();
                    
                    if(opcao == 1){
                        System.out.println("\nSelecione qual cobra quer mostrar: \n");

                        for (int i = 0; i < vCobra.size(); i++) {
                            System.out.println(i+" - "+vCobra.get(i).getNome());
                        }

                        System.out.println("\n100 - TODOS");
                        System.out.println("999 - Voltar ao MENU");

                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                        
                        while(opcao < 0 || opcao > vCobra.lastIndexOf(cobra) && opcao != 100 && opcao != 999){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            opcao = read.nextInt();
                        }

                        read.nextLine();

                        if(opcao == 100){
                            for (int i = 0; i < vCobra.size(); i++) {
                                System.out.println("\n| Cobra #"+i+" |");
                                System.out.println("\nNome do Animal: "+vCobra.get(i).getNome());
                                System.out.println("Classe do Animal: "+vCobra.get(i).getClasse());
                                System.out.println("Ordem do Animal: "+vCobra.get(i).getOrdem());
                                System.out.println("Tamanho do Animal: "+vCobra.get(i).getTamanho()+"m");
                                System.out.println("Peso do Animal: "+vCobra.get(i).getPeso()+"kg");
                                System.out.println("Cor do Animal: "+vCobra.get(i).getCor());
                                System.out.println("Habitat do Animal: "+vCobra.get(i).getHabitat());
                                System.out.println("Dieta do Animal: "+vCobra.get(i).getDieta());
                                System.out.println("\nNúmero de Patas do Reptil: "+vCobra.get(i).getNumeroPatas());
                                System.out.println("\nA cobra é peçonhenta? "+vCobra.get(i).getPeconha());
                                System.out.println("A cobra possui visão infravermelha? "+vCobra.get(i).getSensorDeCalor());
                            }
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        } else if(opcao == 999){
                        } else {
                            System.out.println("\n| Cobra #"+opcao+" |");
                            System.out.println("\nNome do Animal: "+vCobra.get(opcao).getNome());
                            System.out.println("Classe do Animal: "+vCobra.get(opcao).getClasse());
                            System.out.println("Ordem do Animal: "+vCobra.get(opcao).getOrdem());
                            System.out.println("Tamanho do Animal: "+vCobra.get(opcao).getTamanho()+"m");
                            System.out.println("Peso do Animal: "+vCobra.get(opcao).getPeso()+"kg");
                            System.out.println("Cor do Animal: "+vCobra.get(opcao).getCor());
                            System.out.println("Habitat do Animal: "+vCobra.get(opcao).getHabitat());
                            System.out.println("Dieta do Animal: "+vCobra.get(opcao).getDieta());
                            System.out.println("\nNúmero de Patas do Reptil: "+vCobra.get(opcao).getNumeroPatas());
                            System.out.println("\nA cobra é peçonhenta? "+vCobra.get(opcao).getPeconha());
                            System.out.println("A cobra possui visão infravermelha? "+vCobra.get(opcao).getSensorDeCalor());
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                    } else if(opcao == 2){
                        System.out.println("\nSelecione qual jacaré quer mostrar: \n");

                        for (int i = 0; i < vJacare.size(); i++) {
                            System.out.println(i+" - "+vJacare.get(i).getNome());
                        }

                        System.out.println("\n100 - TODOS");
                        System.out.println("999 - Voltar ao MENU");

                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                        
                        while(opcao < 0 || opcao > vJacare.lastIndexOf(jacare) && opcao != 100 && opcao != 999){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            opcao = read.nextInt();
                        }

                        read.nextLine();

                        if(opcao == 100){
                            for (int i = 0; i < vJacare.size(); i++) {
                                System.out.println("\n| Jacaré #"+i+" |");
                                System.out.println("\nNome do Animal: "+vJacare.get(i).getNome());
                                System.out.println("Classe do Animal: "+vJacare.get(i).getClasse());
                                System.out.println("Ordem do Animal: "+vJacare.get(i).getOrdem());
                                System.out.println("Tamanho do Animal: "+vJacare.get(i).getTamanho()+"m");
                                System.out.println("Peso do Animal: "+vJacare.get(i).getPeso()+"kg");
                                System.out.println("Cor do Animal: "+vJacare.get(i).getCor());
                                System.out.println("Habitat do Animal: "+vJacare.get(i).getHabitat());
                                System.out.println("Dieta do Animal: "+vJacare.get(i).getDieta());
                                System.out.println("\nNúmero de Patas do Reptil: "+vJacare.get(i).getNumeroPatas());
                                System.out.println("\nNúmero de Garras do Jacaré: "+vJacare.get(i).getNumeroGarras());
                            }
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        } else if(opcao == 999){
                        } else {
                            System.out.println("\n| Jacaré #"+opcao+" |");
                            System.out.println("\nNome do Animal: "+vJacare.get(opcao).getNome());
                            System.out.println("Classe do Animal: "+vJacare.get(opcao).getClasse());
                            System.out.println("Ordem do Animal: "+vJacare.get(opcao).getOrdem());
                            System.out.println("Tamanho do Animal: "+vJacare.get(opcao).getTamanho()+"m");
                            System.out.println("Peso do Animal: "+vJacare.get(opcao).getPeso()+"kg");
                            System.out.println("Cor do Animal: "+vJacare.get(opcao).getCor());
                            System.out.println("Habitat do Animal: "+vJacare.get(opcao).getHabitat());
                            System.out.println("Dieta do Animal: "+vJacare.get(opcao).getDieta());
                            System.out.println("\nNúmero de Patas do Reptil: "+vJacare.get(opcao).getNumeroPatas());
                            System.out.println("\nNúmero de Garras do Jacaré: "+vJacare.get(opcao).getNumeroGarras());
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                    } else if(opcao == 3){
                        System.out.println("\nSelecione qual ovelha quer mostrar: \n");

                        for (int i = 0; i < vOvelha.size(); i++) {
                            System.out.println(i+" - "+vOvelha.get(i).getNome());
                        }

                        System.out.println("\n100 - TODOS");
                        System.out.println("999 - Voltar ao MENU");

                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                        
                        while(opcao < 0 || opcao > vOvelha.lastIndexOf(ovelha) && opcao != 100 && opcao != 999){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            opcao = read.nextInt();
                        }

                        read.nextLine();

                        if(opcao == 100){
                            for (int i = 0; i < vOvelha.size(); i++) {
                                System.out.println("\n| Ovelha #"+i+" |");
                                System.out.println("\nNome do Animal: "+vOvelha.get(i).getNome());
                                System.out.println("Classe do Animal: "+vOvelha.get(i).getClasse());
                                System.out.println("Ordem do Animal: "+vOvelha.get(i).getOrdem());
                                System.out.println("Tamanho do Animal: "+vOvelha.get(i).getTamanho()+"m");
                                System.out.println("Peso do Animal: "+vOvelha.get(i).getPeso()+"kg");
                                System.out.println("Cor do Animal: "+vOvelha.get(i).getCor());
                                System.out.println("Habitat do Animal: "+vOvelha.get(i).getHabitat());
                                System.out.println("Dieta do Animal: "+vOvelha.get(i).getDieta());
                                System.out.println("\nNúmero de Mamas do Mamífero: "+vOvelha.get(i).getNumeroMamas());
                                System.out.println("Tipo de Pelo do Mamífero: "+vOvelha.get(i).getTipoDePelo());
                                System.out.println("\nO ovino tem chifre? "+vOvelha.get(i).getChifre());
                                System.out.println("\nA ovelha está com lã? "+vOvelha.get(i).getLa());
                            }
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        } else if(opcao == 999){
                        } else {
                            System.out.println("\n| Ovelha #"+opcao+" |");
                            System.out.println("\nNome do Animal: "+vOvelha.get(opcao).getNome());
                            System.out.println("Classe do Animal: "+vOvelha.get(opcao).getClasse());
                            System.out.println("Ordem do Animal: "+vOvelha.get(opcao).getOrdem());
                            System.out.println("Tamanho do Animal: "+vOvelha.get(opcao).getTamanho()+"m");
                            System.out.println("Peso do Animal: "+vOvelha.get(opcao).getPeso()+"kg");
                            System.out.println("Cor do Animal: "+vOvelha.get(opcao).getCor());
                            System.out.println("Habitat do Animal: "+vOvelha.get(opcao).getHabitat());
                            System.out.println("Dieta do Animal: "+vOvelha.get(opcao).getDieta());
                            System.out.println("\nNúmero de Mamas do Mamífero: "+vOvelha.get(opcao).getNumeroMamas());
                            System.out.println("Tipo de Pelo do Mamífero: "+vOvelha.get(opcao).getTipoDePelo());
                            System.out.println("\nO ovino tem chifre? "+vOvelha.get(opcao).getChifre());
                            System.out.println("\nA ovelha está com lã? "+vOvelha.get(opcao).getLa());
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                    }
                }
            } else if(opcao == 3){
                System.out.println("\n| AÇÕES |");
                System.out.println("\nSelecione o tipo de animal que deseja fazer a ação:");
                System.out.println("\n1 - Animal Genérico");
                System.out.println("2 - Classe de Animal"); // Mamifero Reptil
                System.out.println("3 - Ordem de Animal");
                System.out.println("4 - Espécie de Animal");
                System.out.println("5 - Voltar ao MENU");
                System.out.print("\nOpção: ");
                opcao = read.nextInt();
                
                while(opcao < 1 || opcao > 5){
                    System.out.println("\nDigite novamente.");
                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                }
                
                if(opcao == 1){
                    System.out.println("\n| ANIMAL |");
                    System.out.println("\nOpções de ações:");
                    System.out.println("\n1 - Comer");
                    System.out.println("2 - Beber");
                    System.out.println("3 - Voltar ao MENU");
                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 3){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                    }
                    
                    if(opcao == 1)
                        animal.Comer();
                    else if(opcao == 2)
                        animal.Beber();
                } else if(opcao == 2){
                    System.out.println("\nSelecione a classe que deseja fazer a ação:");
                    System.out.println("\n1 - Mamífero");
                    System.out.println("2 - Reptil");
                    System.out.println("3 - Voltar ao MENU");
                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 3){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                    }
                    
                    if(opcao == 1){
                        System.out.println("\n| MAMÍFERO |");
                        System.out.println("\nOpções de ações:");
                        System.out.println("\n1 - Comer");
                        System.out.println("2 - Beber");
                        System.out.println("3 - Quem são?");
                        System.out.println("4 - Exemplos");
                        System.out.println("5 - Voltar ao MENU");
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                        
                        while(opcao < 1 || opcao > 5){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            opcao = read.nextInt();
                        }
                    
                        read.nextLine();
                        
                        if(opcao == 1)
                            mamifero.Comer();
                        else if(opcao == 2)
                            mamifero.Beber();
                        else if(opcao == 3){
                            mamifero.Quem();
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                        else if(opcao == 4){
                            mamifero.Exemplo();
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                    } else if(opcao == 2){
                        // AÇÕES REPTEIS
                        System.out.println("\n| REPTIL |");
                        System.out.println("\nOpções de ações:");
                        System.out.println("\n1 - Comer");
                        System.out.println("2 - Beber");
                        System.out.println("3 - Trocar de Pele");
                        System.out.println("4 - Botar Ovos");
                        System.out.println("5 - Voltar ao MENU");

                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();

                        while(opcao < 1 || opcao > 5){
                              System.out.println("\nDigite novamente.");
                              System.out.print("\nOpção: ");
                              opcao = read.nextInt();
                        }
                        
                        read.nextLine();

                        if(opcao == 1)
                            reptil.Comer();
                        else if(opcao == 2)
                            reptil.Beber();
                        else if(opcao == 3){
                            reptil.TrocaPele();
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                        else if(opcao == 4)
                            reptil.Ovo();
                    }
                } else if(opcao == 3){
                    System.out.println("\nSelecione a ordem que deseja fazer a ação:");
                    System.out.println("\n1 - Ovino");
                    System.out.println("2 - Primata");
                    System.out.println("3 - Voltar ao MENU");
                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 3){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                    }
                    
                    read.nextLine();
                    
                    if(opcao == 1){
                        // AÇÕES OVINOS 
                        System.out.println("\n| OVINO |");
                        System.out.println("\nOpções de ações:");
                        System.out.println("\n1 - Comer");
                        System.out.println("2 - Beber");
                        System.out.println("3 - Berrar");
                        System.out.println("4 - Chifrada");
                        System.out.println("5 - Voltar ao MENU");

                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                        
                        while(opcao < 1 || opcao > 5){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            opcao = read.nextInt();
                        }
                        
                        read.nextLine();
                    
                        if(opcao == 1)
                            ovino.Comer();
                        else if(opcao == 2)
                            ovino.Beber();
                        else if(opcao == 3){
                            ovino.Berrar();
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                        else if (opcao == 4)
                            ovino.Chifrada();
                    } else if(opcao == 2){
                        // AÇÕES PRIMATA
                        System.out.println("\n| PRIMATA |");
                        System.out.println("\nOpções de ações:");
                        System.out.println("\n1 - Comer");
                        System.out.println("2 - Beber");
                        System.out.println("3 - Descascar Banana");
                        System.out.println("4 - Sorrir");
                        System.out.println("5 - Voltar ao MENU");

                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                        
                        while(opcao < 1 || opcao > 5){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            opcao = read.nextInt();
                        }
                        
                        read.nextLine();
                    
                        if (opcao == 1)
                            primata.Comer();
                        else if (opcao == 2)
                            primata.Beber();
                        else if (opcao == 3){
                            primata.Banana();
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                        else if (opcao == 4){
                            primata.Sorrir();
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                    }
                } else if(opcao == 4){
                    System.out.println("\nSelecione a espécie que deseja fazer a ação:");
                    System.out.println("\n1 - Cobra");
                    System.out.println("2 - Jacaré");
                    System.out.println("3 - Ovelha");
                    System.out.println("4 - Voltar ao MENU");
                    System.out.print("\nOpção: ");
                    opcao = read.nextInt();
                    
                    while(opcao < 1 || opcao > 4){
                        System.out.println("\nDigite novamente.");
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                    }
                    
                    if(opcao == 1){
                        // AÇÕES  COBRA 
                        System.out.println("\n| COBRA |");
                        System.out.println("\nOpções de ações:");
                        System.out.println("\n1 - Comer");
                        System.out.println("2 - Beber");
                        System.out.println("3 - Trocar de Pele");
                        System.out.println("4 - Botar Ovo");
                        System.out.println("5 - Dar Bote");
                        System.out.println("6 - Injetar Veneno");
                        System.out.println("7 - Voltar ao MENU");
                        
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                        
                        while(opcao < 1 || opcao > 7){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            opcao = read.nextInt();
                        }
                        
                        read.nextLine();

                        if(opcao == 1)
                            cobra.Comer();
                        else if(opcao == 2)
                            cobra.Beber();
                        else if (opcao == 3){
                            cobra.TrocaPele();
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                        else if(opcao == 4)
                            cobra.Ovo();
                        else if(opcao == 5)
                            cobra.Bote();
                        else if(opcao == 6)
                            cobra.Veneno();
                    } else if(opcao == 2){
                        // AÇÕES  JACARÉ
                        System.out.println("\n| JACARÉ |");
                        System.out.println("\nOpções de ações:");
                        System.out.println("\n1 - Comer");
                        System.out.println("2 - Beber");
                        System.out.println("3 - Trocar de Pele");
                        System.out.println("4 - Botar Ovo");
                        System.out.println("5 - Abocanhar");
                        System.out.println("6 - Nadar");
                        System.out.println("7 - Voltar ao MENU");
                        
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                        
                        while(opcao < 1 || opcao > 7){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            opcao = read.nextInt();
                        }
                        
                        read.nextLine();

                        if(opcao == 1)
                            jacare.Comer();
                        else if(opcao == 2)
                            jacare.Beber();
                        else if (opcao == 3){
                            jacare.TrocaPele();
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                        else if(opcao == 4)
                            jacare.Ovo();
                        else if(opcao == 5)
                            jacare.Abocanhar();
                        else if(opcao == 6){
                            jacare.Nadar();
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                    } else if(opcao == 3){
                        // AÇÕES  OVELHAS  
                        System.out.println("\n| OVELHA |");
                        System.out.println("\nOpções de ações:");
                        System.out.println("\n1 - Comer");
                        System.out.println("2 - Beber");
                        System.out.println("3 - Berrar");
                        System.out.println("4 - Chifrada");
                        System.out.println("5 - Tirar Lã");
                        System.out.println("6 - Pastar");
                        System.out.println("7 - Voltar ao MENU");
                    
                        System.out.print("\nOpção: ");
                        opcao = read.nextInt();
                        
                        while(opcao < 1 || opcao > 7){
                            System.out.println("\nDigite novamente.");
                            System.out.print("\nOpção: ");
                            opcao = read.nextInt();
                        }
                        
                        read.nextLine();
                    
                        if(opcao == 1)
                            ovelha.Comer();
                        else if(opcao == 2)
                            ovelha.Beber();
                        else if(opcao == 3){
                            ovelha.Berrar();
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                        else if(opcao == 4)
                            ovelha.Chifrada();
                        else if(opcao == 5)
                            ovelha.La();
                        else if(opcao == 6){
                            ovelha.Pastar();
                            System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                            read.nextLine();
                        }
                    }
                }
            } else if(opcao == 4){
                System.out.println("\nPrograma feito por Luan Gibson e Rafael Yu");
                System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
                read.nextLine();
            } else {
                System.out.println("\nVocê saiu.");
                rodando = false;
            }
        }
    }
}
