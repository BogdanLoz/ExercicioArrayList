package exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Registo {
    String nome,telefone;
    float salario;
    int bi;

    public Registo(String nome, String telefone, float salario, int bi) {
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
        this.bi = bi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getBi() {
        return bi;
    }

    public void setBi(int bi) {
        this.bi = bi;
    }
    
    
    public Registo(ArrayList<Registo> emp){
        int opcao = 0;
        
        do{
        System.out.println("Registo de Empregados");
        System.out.print("Nome : ");
        nome = new Scanner(System.in).nextLine();
        System.out.print("Telefone : ");
        telefone = new Scanner(System.in).nextLine();
        System.out.print("Salario(Anual) : ");
        salario = new Scanner(System.in).nextFloat();
        System.out.print("BI : ");
        bi = new Scanner(System.in).nextInt();
        Registo empregado = new Registo(nome , telefone, salario, bi);
        emp.add(empregado);
        
        System.out.println("Quer Introduzir mais Sim[1]Nao[0]");
        opcao = new Scanner(System.in).nextInt();
        
        }while(opcao != 0);
    }
    
}
