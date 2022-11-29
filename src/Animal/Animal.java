package Animal;
import java.util.*;
public class Animal {
    protected String nome;
    protected String classe; //ex: Peixes, Anfíbios, Répteis, Aves e Mamíferos
    protected String ordem; //ex: Primatas, Ovinos, Suínos, Equinos, Bovinos, etc...
    protected double tamanho;
    protected double peso;
    protected String cor;
    protected String habitat;
    protected String dieta; //ex: Carnívoro, Herbívoro e Onívoro

    Animal(){}

    
    public void Comer(){
    Scanner prosseguir = new Scanner(System.in);   
    String ler ;
    System.out.println("+-------------------|Comendo------------------+");
    System.out.println("loading  0%");                       
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

    System.out.println("Pressione ENTER para continuar:"); 
    ler = prosseguir.nextLine();

        if(ler.equals("")){
            System.out.println("loading 100%");
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

            System.out.println("Parabens voce conseguiu comer");

        }else{}
    }
    
    public void beber(){
    Scanner prosseguir = new Scanner(System.in);   
    Scanner escolha = new Scanner(System.in);   
    String ler ;
    int resposta;
    System.out.println("+--------------------------------|Escolha seu caminho|---------------------------------------+");
    System.out.println("FAça suas escolhas e lide com suas consequencias. Escolha o ambiente: ");
    
        System.out.println("1 - Floresta");
        System.out.println("2 - Deserto");
        System.out.println("3 - Oceano/Lago");
        System.out.print("\nOpção: ");
        resposta = escolha.nextInt();
        
            if (resposta == 1) {
                System.out.println("                                      .-.                   ");
                System.out.println("                                       ) )                  ");
                System.out.println("                                      '-'                   ");
                System.out.println("                                                            ");
                System.out.println("       ^  ^  ^   ^     ____I__      ^  ^   ^  ^  ^   ^  ^   ");
                System.out.println("      /|)/|)/|) /|)   / |-_-- |    /|)/|) /|)/|)/|) /|)/|)  ");
                System.out.println("      /|)/|)/|) /|)  /  |_-__ |    /|)/|) /|)/|)/|) /|)/|)  ");
                System.out.println("______/|)/|)/|)_/|)__|[]| []  |____/|)/|)_/|)/|)/|)_/|)/|)_ ");
                System.out.println("Escolha onde vc irá beber água:");
                System.out.println("1 - Riacho");
                System.out.println("2 - Lago");
                System.out.println("3 - Balde proximo a Cabana");
                System.out.print("\nOpção: ");
                resposta = escolha.nextInt();
                
                    if (resposta == 1) {
                        System.out.println("Enquanto voce apeoxima do riacho vc encontra diversos tipo de plantas e pequenos animais, que se reunem proximos ao riacho.\nVoce consegue se deliciar com as águas limpidas do riacho");
                }
                    else if (resposta == 2) {
                        System.out.println("Se aproximando do lago voce se depara com um diversos vultos, nadando entre as águas, ainda assim voce consegue beber agua e sair, antes que qualquer ser te atacasse. ");
                }
                    else if (resposta == 3) {
                        System.out.println("Se aproximando do balde vc ouve estrodosas vozes vindo da Cabana,assim repentinamente se assustando e fazendo barulho.\nDa cabana sai um homem parrudo e com uma espingarda em suas mãos.");
                        System.out.println("Ele te encontra e atira: BAMMM!!");
                        System.out.println("\n Voce MORREU, Boa sorte da proxima vez");
                }
            
            }
            else if (resposta == 2) {
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
                System.out.println("Escolha onde vc irá beber água:");
                System.out.println("1 - Cactus");
                System.out.println("2 - Oasis");
                System.out.println("3 - Barril");
                System.out.print("\nOpção: ");
                resposta = escolha.nextInt();

                if (resposta == 1) {
                    System.out.println("\nVoce sorrateiramente se esgueira até o cactus e consegue quebra-lo, mesmo se espetando em alguns espinhos.\n Ainda assim voce consegue beber a agua presente no seu interior  ");
                }
                else if (resposta == 2) {
                    System.out.println("Se aproximando do oasis voce percebe uma inconsistenciana paisagem como se aquilo mudasse a cada Segundo. O Oasis é uma miragem. Voce ainda sente muita SEDE. ");
                }
                else if (resposta == 3) {
                    System.out.println("Se aproximando do barril vc ouve um barulho parecido com o de um chocalho. Do Barril surje uma imensa e voraz Cascavel, que te morde.\nLentamente, voce vai se desprendendo deste mundo.");
                    System.out.println("\nVoce MORREU, boa sorte da proxima vez");
                }
            }
            else if (resposta == 3) {
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
                System.out.println("    (          (           º     ,/..          `         ) ");
                System.out.println("     )     (    )             <')   `=<                (   ");
                System.out.println("    (       )  (      o        ``|```          o         ) ");
                System.out.println("_____)_____(____)______________________________________(___");
                System.out.println("Voce esta num ambiente aquatico, a agua é vasta ao seu redor.\n Voce ou consegue absorve-la pelas suas guelras ou irá bebe-la de outra forma. Não se preocupe voce n passará sede");
            }
           System.out.print("Pressione ENTER para continuar:"); 
           ler = prosseguir.nextLine(); 
           System.out.println(" +--------------------------------------------------------------------------------------------+ ");
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
            this.nome = "Não informado";
        } else {
            this.nome = nome;
        }
    }

    public void setClasse(String classe) {
        if(classe.equals("")){
            this.classe = "Não informado";
        } else {
            this.classe = classe;
        }
    }

    public void setOrdem(String ordem) {
        if(ordem.equals("")){
            this.ordem = "Não informado";
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
            this.cor = "Não informado";
        } else {
            this.cor = cor;     
        }
    }

    public void setHabitat(String habitat) {
        if(habitat.equals("")){
            this.habitat = "Não informado";
        } else {
            this.habitat = habitat;        
        }
    }
    
    public void setDieta(String dieta) {
        if(dieta.equals("")){
            this.dieta = "Não informado";
        } else {
            this.dieta = dieta;     
        }
    }
    
    public void andar(){
        System.out.println("Andando...");
    }
    
}