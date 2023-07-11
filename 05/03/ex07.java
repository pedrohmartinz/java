
import java.util.Scanner;

public class ex07 {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
         int soma = 0;
         int[] num= new int [31];
         int maior= 0;
         int menor = 0;
         int[] pares= new int[30];
                 
         for(int i =0; i<31; i++){
            System.out.println("Número "+ (i)+ ":");
            num[i] = sc.nextInt();
            soma += num[i];          
            
            if(num[i] % 2 == 0){
               
                int a = pares.length;
                pares[i] = num[i]; 
            
            }
            if(menor < num[i]){
                menor = num[i];
            }    
             if(maior > num[i]){
                maior = num[i];
            } 
       
         }
         int cont = 0;
         int media = soma/30;
         for (int i =0; i < 31; i++){
             if(num[i]> media){
              cont++;
             }
         
        }
        System.out.println("Os números pares existentes são: ");
        
        for (int cont2=0; cont2 < pares.length; cont2++){
            System.out.print(pares[cont2]+", ");       
        }        
        System.out.println("O menor número é: "+maior);  
        System.out.println("O maior número é: "+menor);      
        System.out.println("Os números maiores que a média,"+media+", são "+cont);
        
    }
    
}