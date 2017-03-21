package exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2_Main {

    public static void main(String[] args) {
        ArrayList<String> pess = new ArrayList<String>();
        int option;
        String name;
          pess.add("Andre");
	  pess.add("Joao");
	  pess.add("Maria");
	  pess.add("Jorge");
	  pess.add("Sofia");
          
       do{
        System.out.println("Menu");
        System.out.println("1->Ver ArrayList");
        System.out.println("2->Adicionar a ArreyList");
        System.out.println("3->Remover elementos da ArrayList");
        option = new Scanner(System.in).nextInt();

          switch(option){
              case 1 : 
                  System.out.println("A ArrayList Contem : " + pess);
                  break;
              case 2 :
                  System.out.print("Adicionar : ");
                  name = new Scanner(System.in).nextLine();
                  pess.add(0, name);
                  break;
                                  
              case 3 :
                  System.out.print("Pessoa a Remover : ");
                  name = new Scanner(System.in).nextLine();
                  pess.remove(name);
                  break;
                
          }
        }while(option != 0);
    }
    
}
