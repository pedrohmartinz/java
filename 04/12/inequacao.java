/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;



/**
 *
 * 
 * @author CAMARGO
 */
public class inequacao {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Coloque o valor de a:");
        int a = sc.nextInt();
        
         System.out.println("Coloque o valor de b:");
         int b = sc.nextInt();
         
         System.out.println("Coloque o valor de c:");
         int c = sc.nextInt();
         
         int delta = b*b-4*a*c;
         double x1 = (-b+Math.sqrt(delta))/2*a;
         double x2 = (-b-Math.sqrt(delta))/2*a;
         
         System.out.println("O valor de x1 é: "+x1 );
         System.out.println("O valor de x2 é: "+x2 );
         
    }
    
}