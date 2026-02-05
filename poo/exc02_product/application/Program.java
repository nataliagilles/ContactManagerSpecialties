package poo.exc02_product.application;

import java.util.Scanner; 
import poo.exc02_product.entities.Employees;


public class Program {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    Employees func= new Employees();

    System.out.print("Nome:");
    func.nome = sc.nextLine();
    System.out.print("Salário Liquído:");
    func.salario = sc.nextDouble();
    System.out.print("Taxa: ");
    func.taxa = sc.nextDouble();

    System.out.println();
    System.out.println("Funcionário:" + func);
    System.out.println();
    System.out.print("Escolha a porcentagem para aumento salarial:");
    double porcentagem = sc.nextDouble();
    func.aumento_salario(porcentagem);

    System.out.println();
    System.out.println("Atualizado para: "+ func);

    sc.close();

    }
}

