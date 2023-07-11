/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

public class ex01 {

  
    public static void main(String[] args) {
         	//Novo sálario
	    System.out.println("*** Cálculo do sálario líquido ***");
				
				
				Scanner myObj = new Scanner(System.in);  // Create a Scanner object
				
				System.out.println("Digite o seu salário bruto:");
			    String sal = myObj.nextLine();  // Read user input
			    float salario = Integer.parseInt(sal);
				
                            if (salario < 1556.94){
                                float inss = (salario/ 100)*8;
                                float calculado = salario - inss;
                                                                System.out.println("O valor do seu INSS é de R$ "+inss);
                                //IRRF
                                if(calculado < 1903.98 ){
                                    System.out.println("Você está isento do IRRF.");  
                                    double irrf = 0;
                                      double fim = calculado-irrf;
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                }
                                
                                else if(calculado > 1903.99 && calculado < 2826.65){
                                    double irrf =  Math.round((calculado/ 100)*7.5);
                                    double x = 142.80;
                                    int y = (int) (irrf/ x);
                                    double z = (irrf/x) - y;
                                  double w = Math.round(irrf -(y * x)) ;
                                    
                                    System.out.println("O valor do seu IRRF é de R$ "+irrf+" que será dividido em aproximadamente "+y+" parcelas de R$ 142,80 e uma de mais ou menos R$"+w+".");
                                    double fim = Math.round(calculado-irrf);
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                }
                                
                                else if(calculado > 2826.66 && calculado < 3751.05){
                                         double irrf =  Math.round((calculado/ 100)*15);
                                    double x = 354.80;
                                    int y = (int) (irrf/ x);
                                    double z = (irrf/x) - y;
                                      double w = Math.round(irrf -(y * x)) ;
                                      System.out.println("O valor do seu IRRF é de R$ "+irrf+" que será dividido em aproximadamente "+y+" parcelas de R$ 354,80 e uma de mais ou menos R$"+w+".");
                                   double fim = Math.round(calculado-irrf);
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                     
                                }
                                
                                else if(calculado > 3751.06 && calculado < 4664.68 ){
                                        double irrf =  Math.round((calculado/ 100)*22.5);
                                    double x = 636.13;
                                    int y = (int) (irrf/ x);
                                    double z = (irrf/x) - y;
                                  double w = Math.round(irrf -(y * x)) ;
                                      System.out.println("O valor do seu IRRF é de R$ "+irrf+" que será dividido em aproximadamente "+y+" parcelas de R$ 636,13 e uma de mais ou menos R$"+w+".");
                                  double fim = Math.round(calculado-irrf);
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                }
                                
                                else{
                                         double irrf =  Math.round((calculado/ 100)*27.5);
                                    double x = 869.36;
                                    int y = (int) (irrf/ x);
                                    double z = (irrf/x) - y;
                                      double w = Math.round(irrf -(y * x)) ;
                                      System.out.println("O valor do seu IRRF é de R$ "+irrf+" que será dividido em aproximadamente "+y+" parcelas de R$ 869,36 e uma de mais ou menos R$"+w+".");
                                     double fim = Math.round(calculado-irrf);
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                    
                                }
                            
                            
                            }
                            
                            else if( salario > 1556.95  && salario < 2594.92){
                                float inss = (salario/ 100)*9;
                                float calculado = salario - inss;
                                System.out.println("O valor do seu INSS é de R$ "+inss);
                                //IRRF
                                if(calculado < 1903.98 ){
                                    System.out.println("Você está isento do IRRF.");    
                                    double irrf= 0.0;
                                      double fim = calculado-irrf;
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                }
                                
                                else if(calculado > 1903.99 && calculado < 2826.65){
                                    double irrf =  Math.round((calculado/ 100)*7.5);
                                    double x = 142.80;
                                    int y = (int) (irrf/ x);
                                    double z = (irrf/x) - y;
                                      double w = Math.round(irrf -(y * x)) ;
                                    
                                    System.out.println("O valor do seu IRRF é de R$ "+irrf+" que será dividido em aproximadamente "+y+" parcelas de R$ 142,80 e uma de mais ou menos R$"+w+".");
                                      double fim = Math.round(calculado-irrf);
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                }
                                
                                else if(calculado > 2826.66 && calculado < 3751.05){
                                         double irrf =  Math.round((calculado/ 100)*15);
                                    double x = 354.80;
                                    int y = (int) (irrf/ x);
                                    double z = (irrf/x) - y;
                                        double w = Math.round(irrf -(y * x)) ;
                                      System.out.println("O valor do seu IRRF é de R$ "+irrf+" que será dividido em aproximadamente "+y+" parcelas de R$ 354,80 e uma de mais ou menos R$"+w+".");
                                    double fim = Math.round(calculado-irrf);
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                     
                                }
                                
                                else if(calculado > 3751.06 && calculado < 4664.68 ){
                                        double irrf =  Math.round((calculado/ 100)*22.5);
                                    double x = 636.13;
                                    int y = (int) (irrf/ x);
                                    double z = (irrf/x) - y;
                                double w = Math.round(irrf -(y * x)) ;
                                      System.out.println("O valor do seu IRRF é de R$ "+irrf+" que será dividido em aproximadamente "+y+" parcelas de R$ 636,13 e uma de mais ou menos R$"+w+".");
                                     double fim = Math.round(calculado-irrf);
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                }
                                
                                else{
                                         double irrf =  Math.round((calculado/ 100)*27.5);
                                    double x = 869.36;
                                    int y = (int) (irrf/ x);
                                    double z = (irrf/x) - y;
                                       double w = Math.round(irrf -(y * x)) ;
                                      System.out.println("O valor do seu IRRF é de R$ "+irrf+" que será dividido em aproximadamente "+y+" parcelas de R$ 869,36 e uma de mais ou menos R$"+w+".");
                                    double fim = Math.round(calculado-irrf);
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                    
                                }
                                
                                
                            
                            }
                           
                            
                            else if(salario > 2594.93 && salario < 5189.82){
                                float inss = (salario/ 100)*11;
                                float calculado = salario - inss;
                                 System.out.println("O valor do seu INSS é de R$ "+inss);
                                //IRRF
                                if(calculado < 1903.98 ){
                                    System.out.println("Você está isento do IRRF.");  
                                    double irrf =0.0;
                                      double fim = calculado-irrf;
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                }
                                
                                else if(calculado > 1903.99 && calculado < 2826.65){
                                    double irrf =  Math.round((calculado/ 100)*7.5);
                                    double x = 142.80;
                                    int y = (int) (irrf/ x);
                                    double z = (irrf/x) - y;
                                    double w = Math.round(irrf -(y * x)) ;
                                    
                                    System.out.println("O valor do seu IRRF é de R$ "+irrf+" que será dividido em aproximadamente "+y+" parcelas de R$ 142,80 e uma de mais ou menos R$"+w+".");
                                      double fim = Math.round(calculado-irrf);
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                }
                                
                                else if(calculado > 2826.66 && calculado < 3751.05){
                                         double irrf =  Math.round((calculado/ 100)*15);
                                    double x = 354.80;
                                    int y = (int) (irrf/ x);
                                    double z = (irrf/x) - y;
                                     double w = Math.round(irrf -(y * x)) ;
                                     System.out.println("O valor do seu IRRF é de R$ "+irrf+" que será dividido em aproximadamente "+y+" parcelas de R$ 354,80 e uma de mais ou menos R$"+w+".");
                                     double fim = Math.round(calculado-irrf);
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                     
                                }
                                
                                else if(calculado > 3751.06 && calculado < 4664.68 ){
                                        double irrf =  Math.round((calculado/ 100)*22.5);
                                    double x = 636.13;
                                    int y = (int) (irrf/ x);
                                    double z = (irrf/x) - y;
                                       double w = Math.round(irrf -(y * x)) ;
                                     System.out.println("O valor do seu IRRF é de R$ "+irrf+" que será dividido em aproximadamente "+y+" parcelas de R$ 636,13 e uma de mais ou menos R$"+w+".");
                                     double fim = Math.round(calculado-irrf);
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                }
                                
                                else{
                                         double irrf =  Math.round((calculado/ 100)*27.5);
                                    double x = 869.36;
                                    int y = (int) (irrf/ x);
                                    double z = (irrf/x) - y;
                               double w = Math.round(irrf -(y * x)) ;
                                    System.out.println("O valor do seu IRRF é de R$ "+irrf+" que será dividido em aproximadamente "+y+" parcelas de R$ 869,36 e uma de mais ou menos R$"+w+".");
                                     double fim = Math.round(calculado-irrf);
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                    
                                }
                            
                            
                            }
                            
                            else{
                                float inss = (salario/ 100)*11;
                                if(inss > 570.88 ){
                                    inss = (float) 570.88;
                                }
                                float calculado = salario - inss;
                                System.out.println("O valor do seu INSS é de R$ "+inss);
                                //IRRF
                                if(calculado < 1903.98 ){
                                    System.out.println("Você está isento do IRRF.");     
                                    double irrf =0.0;
                                      double fim = calculado-irrf;
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                }
                                
                                else if(calculado > 1903.99 && calculado < 2826.65){
                                    double irrf =  Math.round((calculado/ 100)*7.5);
                                    double x = 142.80;
                                    int y = (int) (irrf/ x);
                                    double z = (irrf/x) - y;
                                    double w = Math.round(irrf -(y * x)) ;
                                    
                                    System.out.println("O valor do seu IRRF é de R$ "+irrf+" que será dividido em aproximadamente "+y+" parcelas de R$ 142,80 e uma de mais ou menos R$"+w+".");
                                    double fim = Math.round(calculado-irrf);
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                }
                                
                                else if(calculado > 2826.66 && calculado < 3751.05){
                                         double irrf =  Math.round((calculado/ 100)*15);
                                    double x = 354.80;
                                    int y = (int) (irrf/ x);
                                    double z = (irrf/x) - y;
                        double w = Math.round(irrf -(y * x)) ;
                                      System.out.println("O valor do seu IRRF é de R$ "+irrf+" que será dividido em aproximadamente "+y+" parcelas de R$ 354,80 e uma de mais ou menos R$"+w+".");
                                    double fim = Math.round(calculado-irrf);
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                     
                                }
                                
                                else if(calculado > 3751.06 && calculado < 4664.68 ){
                                        double irrf =  Math.round((calculado/ 100)*22.5);
                                    double x = 636.13;
                                    int y = (int) (irrf/ x);
                                    double z = (irrf/x) - y;
                                     double w = Math.round(irrf -(y * x)) ;
                                      System.out.println("O valor do seu IRRF é de R$ "+irrf+" que será dividido em aproximadamente "+y+" parcelas de R$ 636,13  e uma de mais ou menos R$"+w+".");
                                    double fim = Math.round(calculado-irrf);
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                }
                                
                                else{
                                         double irrf =  Math.round((calculado/ 100)*27.5);
                                    double x = 869.36;
                                    int y = (int) (irrf/ x);
                                    double z = (irrf/x) - y;
                                     double w = Math.round(irrf -(y * x)) ;
                                      System.out.println("O valor do seu IRRF é de R$ "+irrf+" que será dividido em aproximadamente "+y+" parcelas de R$ 869,36 e uma de mais ou menos R$"+w+".");
                                    double fim = Math.round(calculado-irrf);
                                    System.out.println("O valor do seu sálario líquido é de R$ "+fim);
                                    
                                }
                            }
                           
    }
    
}
