
import java.util.Scanner;

public class ex01 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x[] = new int[10];
        for(int i=0;i<x.length;i++){
            x[i] = ler.nextInt();
        }
        
        for(int i=0;i<x.length;i++){
            System.out.print(x[i] +", ");
        }
        
    }
    
}