

import java.util.ArrayList;

public class Listagem {
    public Listagem(ArrayList<Registo> emp){
       
        System.out.println("Lista de Empregados");
        
        for(int i = 0;i<emp.size();i++){
            System.out.println(emp.get(i).getNome());
            System.out.println(emp.get(i).getTelefone());
            System.out.println(emp.get(i).getSalario());
            System.out.println(emp.get(i).getBi());
        }
        
    }
            
}
