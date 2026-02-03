package poo.exc01_rectangle.application;

import java.util.Scanner;

import poo.exc01_rectangle.entities.Rectangle;

public class program {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    
    Rectangle rec= new Rectangle();
    
    System.out.println("Digite a LARGURA e ALTURA do retangulo:");
    rec.largura=sc.nextDouble();
    rec.altura= sc.nextDouble();

    System.out.println("Area= " + rec.area());
    System.out.println("Perimetro= " + rec.perimetro());
    System.out.println("Diagonal= " + rec.diagonal());

    sc.close();
    }
}

