
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("***Soma dos números ímpares mutiplos de 3***");
			int soma = 0;
			for(int i = 1; i != 500; i++ ) {
				if (i % 2 != 0) {
					if(i%3==0) {
						soma = soma + i;
						
					}
					
					
				}
				
				
			}
			System.out.println("A soma desses números é "+soma);
	}

}
