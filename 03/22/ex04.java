import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// Vendedor maluco
		
		System.out.println("*** Cálculo do vendedor maluco ***");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Digite o valor da parcela em atraso:");
		 double parcela = myObj.nextDouble();
		
		 
		 double conta = ((parcela/100) * 10) + parcela;
		 
		 double conta02 =  conta - ((conta/100)*10);
		 
		 double prejuizo = conta - conta02;
		 
		 System.out.println("O valor da parcela em atraso com 10% de juros fica R$ "+conta);
		 System.out.println("Com o desconto do vendedor o valor final é de R$ "+conta02);
		 System.out.println("O prejuízo do vendedor é de R$ "+prejuizo);
		

	}

}
