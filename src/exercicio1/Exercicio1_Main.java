
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1_Main {

    public static void main(String[] args) {
      ArrayList<Registo> emp = new ArrayList<Registo>();
        int opcao;
        do{
              System.out.println("1->Registar Empregados");
              System.out.println("2->Listar Empregados");
              System.out.println("0->Sair");
              opcao = new Scanner(System.in).nextInt();
              
                switch(opcao){
                    case 1 :
                       new Registo(emp);
                       break;
                    case 2 : 
                        new Listagem(emp);
                        break;
                    default : 
                        break;
                              
                }
        }while(opcao!=0);
    }
    
}
