

import java.util.Scanner;

public class ex03 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x[] = new int[10];
        for(int i=0;i<x.length;i++){
            x[i] = ler.nextInt();
        }
        
        for(int i=0;i<x.length;i++){
            if(x[i] % 2 == 0){
                System.out.println(x[i]);
            }
        }
        
    }
    
}