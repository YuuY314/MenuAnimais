package Animal;
import java.util.*;
public class PrincipalArrayList {
    public static void main(String[] args) {
        boolean rodando = true;
        Animal a = new Animal();
        Scanner read = new Scanner(System.in);
        int opcao;
        ArrayList<Animal> arrayAnimal = new ArrayList();
        
        while(rodando){
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Mostrar");
            System.out.println("3 - Sair");
            opcao = read.nextInt();
            read.nextLine();
            
            if(opcao == 1){
                a = new Animal();
                System.out.print("Digite o nome: ");
                a.setNome(read.nextLine());
                
                arrayAnimal.add(a);
            } else if(opcao == 2){
                for (int i = 0; i < arrayAnimal.size(); i++) {
                    System.out.println(arrayAnimal.get(i).getNome());
                }
            } else {
                rodando = false;
            }
        }
    }
}
