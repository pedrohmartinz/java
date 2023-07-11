import java.util.Scanner;
public class ex05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Recebendo informações de 10 pessoas ***");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		
		int contM =0;
		int contF = 0;
		int somaM= 0;
		int somaF = 0;
		 
		 for (int i =0; i < 10; i++) {
			 
			 System.out.println("--------------");
			  
			 System.out.println("Digite o sexo da pessoa "+(i+1)+" :");
			 String sexo= myObj.next();
			 System.out.println("Digite a idade da pessoa "+(i+1)+" :");
			 int idade = myObj.nextInt();
			 
			
			
			 
			 
			
			
			 
			 if(sexo=="masculino" || sexo =="Masculino" || sexo == "MASCULINO" || sexo == "M"|| sexo=="m"	) {
				 contM= contM + 1;
				 somaM = somaM + idade;
				 
			 }
			 else if(sexo=="feminino" || sexo =="Feminino"  || sexo=="FEMININO" || sexo == "F"|| sexo=="f" ) {
				 contF= contF + 1;
				 somaF = somaF + idade;
				 
			 }
			
			 
			 
		 }
			
		 float mediaM = somaM/contM;
		 float mediaF = somaF/contF;
		 
		 float media = (somaM + somaF)/(contM + contF);
		 System.out.println("A média de idade dos "+contM+" homens é de "+mediaM+" anos.");
		 System.out.println("A média de idade das "+contF+" mulheres é de "+mediaF+" anos.");
		 System.out.println("A média de idade de todas as "+contM+contF+" pessoas é de "+media+" anos.");
	}
}
