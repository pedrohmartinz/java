import java.util.Scanner;
public class salarioPer {

	public static void main(String[] args) {
		//Novo sálario
	    System.out.println("*** Reajustando salário ***");
				
				
				Scanner myObj = new Scanner(System.in);  // Create a Scanner object
				
				System.out.println("Digite o o salário:");
			    String sal = myObj.nextLine();  // Read user input
			    float salario = Integer.parseInt(sal);
				
				
			    System.out.println("Digite o percentual de reajuste:");
			   
			    String percentual = myObj.nextLine();  // Read user input
			    float res = Integer.parseInt(percentual);
				float reajuste = res/100 * salario;
				float ul = reajuste+ salario;
				System.out.println("Com um reajuste de "+percentual+"% o sálario final será de R$"+ul+".");
				

	}

}
