package Animal;
import java.util.*;
public class Reptil extends Animal {
    private int numeroPatas;

    public void TrocaPele(){
        Random gerador = new Random();  
        int dado = gerador.nextInt(74)+1;
        
        System.out.println("\nVocê irá trocar de pele. Tome cuidado, este é um processo demorado.\n");
        System.out.println("Pronto você conseguiu depois de "+dado+" horas.");
    }
    
    public void Ovo(){
        Scanner ler = new Scanner(System.in); 
        String ovo1, ovo2, ovo3;
       
        System.out.println("\n+-------------------|MINIGAME REPTIL|---------------------+");
        System.out.println("Você está parindo ovos e o parto foi bem sucedido. Parabéns!\n");
        
        System.out.println("                       .-~-. ");
        System.out.println("                     .'     '. ");
        System.out.println("                    /         | ");
        System.out.println("            .-~-.  :          | ");
        System.out.println("          .'     '.|           | ");
        System.out.println("         /         |           : ");
        System.out.println("        :           ; .-~''~-,| ");
        System.out.println("        |           /`        `'. ");
        System.out.println("        :          |             | ");
        System.out.println("         |         |             | ");
        System.out.println("          `.     .' |          .' ");
        System.out.println("            `~~~`    '-.____.-' ");

        System.out.print("\nDê um nome para os seus 3 filhotes.");
        
        System.out.print("\n\nNome para o primerio ovo: ");
        ovo1 = ler.nextLine();
        System.out.print("Nome para o segundo ovo: ");
        ovo2 = ler.nextLine();
        System.out.print("Nome para o terceiro ovo: ");
        ovo3 = ler.nextLine();

        System.out.print("\nAperte ENTER ou digite qualquer coisa para finalizar ");
        ler.nextLine();
        
        System.out.println("\nNome do primeiro ovo: "+ovo1);
        System.out.println("Nome do segundo ovo: "+ovo2);
        System.out.println("Nome do terceiro ovo: "+ovo3);
        
        System.out.print("\nAperte ENTER ou digite qualquer coisa para Voltar ao MENU ");
        ler.nextLine();
    }
    
    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
}