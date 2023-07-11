/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class ex02 {
    public static void main(String[] args) {
            System.out.println("*** Descubra a classificação do produto ***");
				
				
				Scanner myObj = new Scanner(System.in);  // Create a Scanner object
				
				System.out.println("Digite o código do produto: ");
			    String cod02 = myObj.nextLine();  // Read user input
                               int cod= Integer.parseInt(cod02);
                            if(cod == 1){
                                System.out.println("Este produto é um alimento não-perecível.");
                            }
                            
                            
                            else if(cod == 2 || cod == 3 || cod == 4){
                                System.out.println("Este produto é um alimento perecível.");
                            
                            }
                            
                            
                            else if(cod == 5 || cod == 6){
                                System.out.println("Este produto é de vestuário.");
                            
                            }
                            
                            else if(cod == 7){
                                System.out.println("Este produto é de higiene pessoal.");
                            
                            
                            }
                            
                            else if(cod == 8 || cod == 9 || cod == 10 || cod == 11 || cod == 12 || cod ==13 || cod == 14 || cod ==15){
                                System.out.println("Este produto é de limpeza e utensílios domésticos.");
                            
                            }
                            else {
                                System.out.println("O código digitado é inválido");
                            
                            }
                            
                            
    }
}
