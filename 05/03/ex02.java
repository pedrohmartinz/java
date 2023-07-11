
import java.util.Scanner;

public class ex02 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A[] = new int[8];
        int B[] = new int[8];
        
        for(int i=0;i<A.length;i++){
            A[i] = ler.nextInt();
         }
        
        for(int i=0;i<A.length;i++){
            System.out.println(A[i] +" * 3 = "+ (B[i] = A[i] * 3));
        }
        
    }
    
}