
import java.util.Scanner;

public class ex08 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x[] = new int[10];
        int A = ler.nextInt();
        int n1 = 0;
        int B = ler.nextInt();
        int n2 = 0;
        int C = ler.nextInt();
        int n3 = 0;
        for(int i=0;i<x.length;i++){
            x[i] = ler.nextInt();
            if(x[i] == A){
                n1++;
            }            
            else if(x[i] == B){
                n2++;
            }            
            else if(x[i] == C){
                n3++;
            }
        }
        System.out.println("O Valor de A apareceu "+ n1 +" vezes");
        System.out.println("O Valor de B apareceu "+ n2 +" vezes");
        System.out.println("O Valor de C apareceu "+ n3 +" vezes");
        
    }
    
}