
import java.util.Scanner;

public class ex04 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x[] = new int[15];
        for(int i=0;i<x.length;i++){
            x[i] = ler.nextInt();
        }
        
        for(int i=0;i<x.length;i++){
            if(x[i] >= 10){
                System.out.println(x[i]);
            }
        }
        
    }
    
}
