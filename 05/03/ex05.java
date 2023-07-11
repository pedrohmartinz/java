
import java.util.Scanner;

public class ex05 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x[] = new int[20];
        int soma = 0;
        for(int i=0;i<x.length;i++){
            x[i] = ler.nextInt();
        }
        
        for(int i=0;i<x.length-10;i++){
            soma += x[i];
        }
        
        for(int i=0;i<x.length;i++){           
            System.out.println(x[i]);
        }
        System.out.println("Soma = "+ soma);
        
    }
    
}