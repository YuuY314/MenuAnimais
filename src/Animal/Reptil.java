package Animal;
import java.util.Random;
import java.util.Scanner;
public class Reptil extends Animal {
    private int numeroPatas;

    public void trocapele(){
        Random gerador = new Random();
        Scanner prosseguir = new Scanner(System.in);  
        int dado;
        dado =0;
        dado = gerador.nextInt(74)+1;
        String ler ;
        
        System.out.println("Voce ira trocar de pele, tome cuidado. Este é um processo demorado.\n ");
        System.out.println("Pronto voce sconseguiu depois de  "+ dado +"horas");
    
    }
    public void ovo(){
       
       Scanner prosseguir = new Scanner(System.in); 
       Scanner entrada = new Scanner(System.in);  
       String ler; 
       String ovo1;
       String ovo2;
       String ovo3;
       
    System.out.println("+-------------------|Minigame Reptil|---------------------+");
        System.out.println("Voce esta gravido. O parto foi bem sucedido. Parabens ");
        
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
System.out.println("     jgs    `~~~`    '-.____.-' ");

System.out.print("\nDe um nome para os seus 3 filhos ");
        System.out.println("\nDe um nome ao primerio ovo:");
        ovo1 = entrada.nextLine();
        System.out.println("\nDe um nome ao segundo ovo:");
        ovo2 = entrada.nextLine();
        System.out.println("\nDe um nome ao terceiro ovo:");
        ovo3 = entrada.nextLine();

        System.out.println("De ENTER para finalizaar");
         ler = prosseguir.nextLine();
}
    
    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
}