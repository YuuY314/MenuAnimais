package Animal;
import java.util.*;
public class Animal {
    protected String nome;
    protected String classe; //ex: Peixes, Anf�bios, R�pteis, Aves e Mam�feros
    protected String ordem; //ex: Primatas, Ovinos, Su�nos, Equinos, Bovinos, etc...
    protected double tamanho;
    protected double peso;
    protected String cor;
    protected String habitat;
    protected String dieta; //ex: Carn�voro, Herb�voro e On�voro

    Animal(){}
    
    public void Comer(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("+-------------------|COMENDO|------------------+");
        System.out.println("Loading  0%");                       
        System.out.println("       :~!!!!~:.                                ");                        
        System.out.println("      .~?Y5YYYY5YJ7~:                           ");                       
        System.out.println("      .^^!7JYYYYYY55J7~7P7!777!^:               ");               
        System.out.println("           ..:75GGPP555P#?!!77?7!!~~:           ");           
        System.out.println("            :YGBGYJJJYY5Y?!~~~~!7?YYYJ~         ");        
        System.out.println("           ~B#BBGJ!~~~!~~~~~!!7?J5GGGGGJ.       ");      
        System.out.println("          :B#BBBBBGPPPP555PGGGBBBB###BBBJ.      ");     
        System.out.println("          J#BBBBBBBBBBBBBBB###B#B####BB#5^      ");    
        System.out.println("          5#BBBBB####################BP5Y~      ");    
        System.out.println("          Y###B#BB####BB############BP5J?:      ");   
        System.out.println("          ^G################BB##B###BGYJ~       ");  
        System.out.println("           ~5B#############BBB###BB#BP?~        ");   
        System.out.println("            :JPB##########B#BBB#####BJ^         ");     
        System.out.println("             .!YGBB################GJ^          ");     
        System.out.println("               :?G###&############P?^           ");   
        System.out.println("             ...:!5#&&#&&&&&&&&&#G7^:....       ");      
        System.out.println("              ...:^~~!!!!7777!!~^::...          ");     

        System.out.print("\nAperte ENTER ou digite qualquer coisa para continuar ");
        ler.nextLine();
        
        System.out.println("Loading 100%");
        System.out.println("                       :7^                      ");   
        System.out.println("                        :5~                     ");
        System.out.println("                :!?JYYJ?~~Y^7?JYYJ7~.           ");
        System.out.println("              ~YGGGGGGGGGGGGGGGGGGGGP?:         ");   
        System.out.println("             7GGGP5YJJY5PGGGGGG5?!~^^^:         ");   
        System.out.println("             .:!^:::::::^~?PGY~:::.             ");   
        System.out.println("                   ..::::::~7:::.               ");   
        System.out.println("                      .::::^:::.                ");   
        System.out.println("                       .:7^^7^.                 ");   
        System.out.println("                        :7:^7:                  ");   
        System.out.println("                       .:::^^:                  ");   
        System.out.println("                      .:::^~~^.                 ");   
        System.out.println("                     .::~^^^^~^:                ");   
        System.out.println("                   .::~JGY?!~~!7?!.             ");   
        System.out.println("                 .7J5PGGGGGGGGGGG?.             ");   
        System.out.println("                   :!77!~::!77!~.               ");
        System.out.println("+-------------------|COMENDO|------------------+");

        System.out.println("\nParab�ns voc� conseguiu comer!");
        System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
        ler.nextLine();
    }
    
    public void Beber(){
        Scanner ler = new Scanner(System.in);
        int opcao;
        
        System.out.println("+--------------------------------|ESCOLHA SEU CAMINHO|---------------------------------------+");
        System.out.println("Fa�a suas escolhas e lide com suas consequ�ncias.\n");
        System.out.println("Escolha o ambiente:\n");
        System.out.println("1 - Floresta");
        System.out.println("2 - Deserto");
        System.out.println("3 - Oceano");
        System.out.print("\nOp��o: ");
        opcao = ler.nextInt();
        
        while(opcao < 1 || opcao > 3){
            System.out.println("\nDigite novamente.");
            System.out.print("\nOp��o: ");
            opcao = ler.nextInt();
        }
        
        if(opcao == 1){
            System.out.println("                                      .-.                   ");
            System.out.println("                                       ) )                  ");
            System.out.println("                                      '-'                   ");
            System.out.println("                                                            ");
            System.out.println("       ^  ^  ^   ^     ____I__      ^  ^   ^  ^  ^   ^  ^   ");
            System.out.println("      /|)/|)/|) /|)   / |-_-- |    /|)/|) /|)/|)/|) /|)/|)  ");
            System.out.println("      /|)/|)/|) /|)  /  |_-__ |    /|)/|) /|)/|)/|) /|)/|)  ");
            System.out.println("______/|)/|)/|)_/|)__|[]| []  |____/|)/|)_/|)/|)/|)_/|)/|)_ ");
            System.out.println("\nEscolha onde voc� ir� beber �gua:\n");
            System.out.println("1 - Riacho");
            System.out.println("2 - Lago");
            System.out.println("3 - Balde pr�ximo a Cabana");
            System.out.print("\nOp��o: ");
            opcao = ler.nextInt();
            
            while(opcao < 1 || opcao > 3){
                System.out.println("\nDigite novamente.");
                System.out.print("\nOp��o: ");
                opcao = ler.nextInt();
            }
                
            if(opcao == 1){
                System.out.println("\nEnquanto voc� se aproxima do riacho, voc� encontra diversos tipos de plantas e pequenos animais, que se re�nem pr�ximos ao riacho.\n"
                + "Voc� consegue se deliciar com as �guas limpidas do riacho.");
            } else if(opcao == 2){
                System.out.println("\nSe aproximando do lago, voc� se depara com diversos vultos nadando entre as �guas.\n"
                + "Ainda assim, voc� consegue beber �gua e sair, antes que qualquer ser te atacasse.");
            } else {
                System.out.println("\nSe aproximando do balde, voc� ouve estrondosas vozes vindo da Cabana. Assim, voc� se assusta e faz barulho.\n"
                + "Da cabana sai um homem parrudo e com uma espingarda em suas m�os.\n"
                + "Ele te encontra e atira: BAMMM!!\n\n"
                + "Voc� MORREU. Boa sorte da pr�xima vez!");
            }
        } else if(opcao == 2){
            System.out.println("            ,,                              .-.            ");
            System.out.println("          || |                               ) )            ");
            System.out.println("          || |   ,                          '-'             ");
            System.out.println("          || |  | |                                         ");
            System.out.println("          || '--' |                                         ");
            System.out.println("    ,,    || .----'                                         ");
            System.out.println("   || |   || |                                              ");
            System.out.println("   |  '---'| |                                              ");
            System.out.println("   '------.| |                                  _____       ");
            System.out.println("   ((_))  || |      (  _                       [ [|] ]      ");
            System.out.println("   (o o)  || |      ))(')                      | | | |       ");
            System.out.println("____[V]___||_|_____((__^_))____________________[_[|]_]__ldb ");           
            System.out.println("\nEscolha onde voc� ir� beber �gua:\n");
            System.out.println("1 - Cacto");
            System.out.println("2 - O�sis");
            System.out.println("3 - Barril");
            System.out.print("\nOp��o: ");
            opcao = ler.nextInt();
            
            while(opcao < 1 || opcao > 3){
                System.out.println("\nDigite novamente.");
                System.out.print("\nOp��o: ");
                opcao = ler.nextInt();
            }
            
            if(opcao == 1){
                System.out.println("\nVoc� sorrateiramente se esgueira at� o cacto e consegue quebr�-lo, mesmo se espetando em alguns espinhos.\n"
                + "Ainda assim, voc� consegue beber a �gua presente no seu interior.");
            } else if(opcao == 2){
                System.out.println("\nSe aproximando do o�sis, voc� percebe uma inconsist�ncia na paisagem como se aquilo mudasse a cada segundo.\n"
                + "O oasis � uma miragem.\n"
                + "Voc� ainda sente muita sede.");
            } else {
                System.out.println("\nSe aproximando do barril, voc� ouve um barulho parecido com o de um chocalho.\n"
                + "Do Barril surge uma imensa e voraz cascavel, que te morde.\n"
                + "Lentamente, voc� vai se desprendendo deste mundo.\n\n"
                + "Voc� MORREU. Boa sorte da pr�xima vez!");
            }
        } else {
            System.out.println("                   .               _         /             ");
            System.out.println("                          .    ,../...     /|              ");
            System.out.println("                            .  |      `|   / |             ");
            System.out.println("     |              o         < '  )     =<  |             ");
            System.out.println("     |'                        | /      |   ''  __         ");
            System.out.println("   >=)'>                        `'(''''' '                 ");
            System.out.println("     |/               o              /,                    ");
            System.out.println("     /                             <')=<            o      ");
            System.out.println("                                    |                      ");
            System.out.println("           o                                               ");
            System.out.println("    (                                     .   __           ");
            System.out.println("     )                                       <'_><      (  ");
            System.out.println("    (          (           �     ,/..          `         ) ");
            System.out.println("     )     (    )             <')   `=<                (   ");
            System.out.println("    (       )  (      o        ``|```          o         ) ");
            System.out.println("_____)_____(____)______________________________________(___");
            System.out.println("\nVoc� est� num ambiente aqu�tico, a �gua � vasta ao seu redor.\n"
            + "Voc� ou consegue absorver-la pelas suas guelras ou ir� beb�-la de outra forma.\n"
            + "N�o se preocupe, voc� n�o passar� sede.\n"
            + "Se n�o for um animal aqu�tico, n�o sei porqu� est� fazendo t�o abaixo da superf�cie.");
        }
        System.out.println("+--------------------------------|ESCOLHA SEU CAMINHO|---------------------------------------+");
        System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
        ler.nextLine(); ler.nextLine();
    }
    
    public void Andar(){
        System.out.println("Andando...");
    }
    
    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public String getOrdem() {
        return ordem;
    }

    public double getTamanho() {
        return tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public String getCor() {
        return cor;
    }

    public String getHabitat() {
        return habitat;
    }
    
    public String getDieta() {
        return dieta;
    }

    public void setNome(String nome) {
        if(nome.equals("")){
            this.nome = "N�o informado";
        } else {
            this.nome = nome;
        }
    }

    public void setClasse(String classe) {
        if(classe.equals("")){
            this.classe = "N�o informado";
        } else {
            this.classe = classe;
        }
    }

    public void setOrdem(String ordem) {
        if(ordem.equals("")){
            this.ordem = "N�o informado";
        } else {
            this.ordem = ordem;
        }
    }

    public void setTamanho(double tamanho) {
      if(tamanho == 0){
          this.tamanho = 0;
        } else {
            this.tamanho = tamanho; 
        }
    }

    public void setPeso(double peso) {
        if(peso == 0){
            this.peso = 0;
        } else {
            this.peso = peso; 
        }
    }

    public void setCor(String cor) {
        if(cor.equals("")){
            this.cor = "N�o informado";
        } else {
            this.cor = cor;     
        }
    }

    public void setHabitat(String habitat) {
        if(habitat.equals("")){
            this.habitat = "N�o informado";
        } else {
            this.habitat = habitat;        
        }
    }
    
    public void setDieta(String dieta) {
        if(dieta.equals("")){
            this.dieta = "N�o informado";
        } else {
            this.dieta = dieta;     
        }
    }  
}