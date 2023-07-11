package Agenda;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.io.*;
import java.lang.reflect.Array;


public class JavaApplication1 {
    public static final String ANSI_RED ="\u001B[31m";
    public static final String ANSI_BLUE ="\u001B[34m";
    public static final String ANSI_PURPLE ="\u001B[35m";
    public static final String ANSI_GREEN= "\u001B[32m";
    public static final String ANSI_RESET="\u001B[0m";
     public static final String ANSI_YELLOW="\u001B[33m";

	public static void main (String[] args) {
                Notas[] notas = new Notas[20];
             notas[0] = new Notas(1, 12, 2023, "Concluir o ensiono médio");
                 notas[1] = new Notas(22, 6, 2022, "Apresentação do trabalho sobre Alan Turing");
                  notas[2] = new Notas(23, 6, 2022, "Prova de ética e de história");
                     notas[3] = new Notas(29, 6, 2022, "Passeio da Pichuru");
                        notas[4] = new Notas(1,7 , 2022, "Férias");
               int contN = 5;
             
              Contato[] contatos = new Contato[30];
                  contatos[0] = new Contato("Pedro Henrique", "11111111111", "p@gmail.com");
                  contatos[1] = new Contato("Maria", "22222222222", "m@gmail.com");
                   contatos[2] = new Contato("Ana", "33333333333", "ana²gmail.com");
                    contatos[3] = new Contato("Marco", "44444444444", "mar@gmail.com");
                   contatos[4] = new Contato("Renan", "55555555555", "r@gmail.com");
                       
                   int contC = 5;
		//Cofig - NOME - DIA - MES - RECORRENTE - HORAI = HORAF
                  Compromisso[] arr = new Compromisso[10];
                arr[0] = new Compromisso("Aniversário Duda", 13, 7, "sim", 14, 17);
                arr[1] = new Compromisso("Aniversário Marco", 20, 12, "sim", 10, 11);
                arr[2] = new Compromisso("Aniversário Pedro", 27, 12, "sim", 9, 16);
                arr[3] = new Compromisso("Independência do Brasil", 7, 7, "sim", 13, 16);
                arr[4] = new Compromisso("Tiradentes", 21, 3, "sim", 20, 24);
                arr[5] = new Compromisso("Natal", 25, 12, "sim", 12, 16);
                int cont = 6;
                    
               /* String[][] v = new String[10][6];
                v[0][0] = "Aniversário Duda";
		v[0][1] = "13";
		v[0][2] = "7";
		v[0][3] = "Sim";
		v[0][4] = "14";
		v[0][5] = "17";
		
		v[1][0] = "Aniversário Marco";
		v[1][1] = "28";
		v[1][2] = "12";
		v[1][3] = "Sim";
		v[1][4] = "18";
		v[1][5] = "24";
		
		v[2][0] = "Aniversário Pedro";
		v[2][1] = "27";
		v[2][2] = "12";
		v[2][3] = "Sim";
		v[2][4] = "10";
		v[2][5] = "17";
		
		v[3][0] = "Independência do Brasil";
		v[3][1] = "7";
		v[3][2] = "7";
		v[3][3] = "Sim";
		v[3][4] = "10";
		v[3][5] = "19";
		
		v[4][0] = "Tiradentes";
		v[4][1] = "21";
		v[4][2] = "2";
		v[4][3] = "Sim";
		v[4][4] = "16";
		v[4][5] = "18";
                
                v[5][0] = "Natal";
		v[5][1] = "25";
		v[5][2] = "12";
		v[5][3] = "Sim";
		v[5][4] = "16";
		v[5][5] = "18";
                */
               System.out.println(ANSI_BLUE+"------------AGENDA------------"+ANSI_RESET);
                   
		MostrarCalendario(arr,6,2022, cont);
                 Scanner in = new Scanner(System.in);
                while(true){
                      System.out.println("");
				System.out.println(ANSI_GREEN+"MENU"+ANSI_RESET);
				System.out.println("Escolha uma oopção");
				System.out.println("[1] - Calendário");
				System.out.println("[2] - Contato");
				System.out.println("[3] - Notas");
                                   System.out.println("[4] - Sair");
				int deci= in.nextInt();
                              
                      if(deci == 1){
                          //Calendario
                           System.out.println("");
				System.out.println(ANSI_GREEN+"MENU"+ANSI_RESET);
				System.out.println("Escolha uma oopção");
				System.out.println("[1] - Ver um mês específico");
				System.out.println("[2] - Ver todos os meus compromissos");
				System.out.println("[3] - Criar um novo compromisso");
				System.out.println("[4] - Excluir todos os compromissos");
				System.out.println("[5] - Excluir um compromisso "  );
                                   System.out.println("[6] - Sair");
				int escolha = in.nextInt();
                                
                                if(escolha == 1) {
                                     Scanner in4 = new Scanner(System.in);
				    System.out.print(ANSI_RED+"Digite o mês e o ano: MM aaaa "+ANSI_RESET);
			        int mes = in4.nextInt();
			        int ano = in4.nextInt();
                           
			       MostrarCalendario(arr, mes,ano, cont);
			                                 System.out.println("");
                                 ListarC(arr, mes, cont);
                                  
					
				}
				else if(escolha == 2 ){
                                    System.out.println("");
					ListarT(arr, cont);
                                        
					
				}
				else if(escolha == 3) {
                          
					System.out.println(ANSI_RED+"Qual o nome do compromisso? "+ANSI_RESET);                              
                                             
                                        String nome3 = in.nextLine();
				
                                     
					System.out.println(ANSI_RED+"Em que dia será? "+ANSI_RESET);
					int dia = in.nextInt();
					
                                         
					System.out.println(ANSI_RED+"Qual o mês? "+ANSI_RESET);
					int mes = in.nextInt();
					 
                                         
					System.out.println(ANSI_RED+"Será um compromisso recorrente? "+ANSI_RESET);
					String rec = in.next();
					
                                         
					System.out.println(ANSI_RED+"Que horas começa? "+ANSI_RESET);
					int dataI = in.nextInt();
					
                                         
					System.out.println(ANSI_RED+"Que horas termina? "+ANSI_RESET);
					int dataF = in.nextInt();
					
					arr[cont] = new Compromisso(nome3, dia, mes, rec, dataI, dataF);
                                            cont++;

				}
				else if(escolha == 4) {
                                  
                                        System.out.println(ANSI_RED+"Tem certeza que quer excluir todos os seus "+cont+" compromissoa?"+ANSI_RESET);
                                        System.out.println(ANSI_RED+"[0] - Sim"+ANSI_RESET);
                                         System.out.println(ANSI_RED+"[1] - Não"+ANSI_RESET);
                                        
                                        int resp = in.nextInt();
                                  
                                        if(resp == 0){
                                            Zerar(arr, cont);
                                            System.out.println("Você não tem mais compromissos!! :)");
                                        }
                                        else{
                                            System.out.println("Ufa...");
                                            System.out.println("Acho que ainda temos muito trabalho a fazer!");
                                        }
                                      
				}
				else if(escolha == 5) {
                                 
                                    System.out.println(ANSI_RED+"Qual o nome do compromisso que você quer cancelar?"+ANSI_RESET);
                                   
                                    String resp2 = in.nextLine();
                               
                                    ExcluirUm(resp2, arr,cont);
                                    
                                  
				}
                                else if(escolha == 6){
                                System.out.println("Programa encerrado... :(");
                                                                       System.out.println("Obrigadooooo");
                          
                                    break;
                                
                                
                                }
                                else{
                                    System.out.println("Valor inválido");
                                }
                                
                                
                                
                                
                                
                                
                                
                                
                                
                      
                      }else if (deci == 2){
                          //contatos
                       System.out.println("");
				System.out.println(ANSI_GREEN+"MENU"+ANSI_RESET);
				System.out.println("Escolha uma oopção");
                                System.out.println("[1] - Ver meus contatos");
                                 System.out.println("[2] - Adicionar contato");
                                  System.out.println("[3] - Excluir contato");
                                   System.out.println("[4] - Sair");
				int escolha = in.nextInt();
                                 if(escolha == 1) {
                                    
					ListarContatos(contatos, contC);
					
				}
                                else if(escolha == 2) {
                                    System.out.println(ANSI_RED+"Qual o nome da pessoa que você quer adicionar?"+ANSI_RESET);                              
                                             
                                        String nome4 = in.next();
				
                                     
					System.out.println(ANSI_RED+"Me informe o telefone dessa pessoa. "+ANSI_RESET);
					String tel = in.next();
					
                                         
					System.out.println(ANSI_RED+"Digite o email agora "+ANSI_RESET);
					String email = in.next();
                                        contatos[contC] = new Contato(nome4, tel, email);
                                          
					contC++;
				}
                                else if(escolha == 3) {
					System.out.println(ANSI_RED+"Qual o nome da pessoa que você quer excluir?"+ANSI_RESET);                              
                                             
                                        String nome4 = in.next();
                                        ExcluirContatos(contatos, contC, nome4);
                                      
				
				}
                                else if(escolha == 4) {
					                 System.out.println("Programa encerrado... :(");
                                                                       System.out.println("Obrigadooooo");                       
					break;
				}
				else {
					System.out.println("Valor inválido");
					
				}
                                
                                
                                
                                
                                
                      }else if(deci == 3){
                          //notas
                           System.out.println("");
				System.out.println(ANSI_GREEN+"MENU"+ANSI_RESET);
				System.out.println("Escolha uma oopção");
                                System.out.println("[1] - Ver minhas notas");
                                 System.out.println("[2] - Adicionar nota");
                                  System.out.println("[3] - Excluir nota");
                                   System.out.println("[4] - Sair");
				int escolha = in.nextInt();
                             if(escolha == 1) {
                                    
					VerNotas(notas, contN);
					
				}
                                else if(escolha == 2) {
                                    System.out.println(ANSI_RED+"Qual o dia da nota que você quer adicionar?"+ANSI_RESET);                              
                                             
                                        int ddd = in.nextInt();
				
                                     
					System.out.println(ANSI_RED+"Me informe o mês da nota . "+ANSI_RESET);
					int mmm = in.nextInt();
					
                                         
					System.out.println(ANSI_RED+"Digite o ano dessa nota."+ANSI_RESET);
					int aaa = in.nextInt();
                                        
                                        System.out.println(ANSI_RED+"Digite a nota."+ANSI_RESET);
					String nota = in.next();
                                        
                                        
                                        
                                        
                                        notas[contN] = new Notas(ddd, mmm, aaa, nota);
                                          
					contN++;
				}
                                else if(escolha == 3) {
					 System.out.println(ANSI_RED+"Qual o dia da nota que você quer adicionar?"+ANSI_RESET);                              
                                             
                                        int ddd = in.nextInt();
				
                                     
					System.out.println(ANSI_RED+"Me informe o mês da nota . "+ANSI_RESET);
					int mmm = in.nextInt();
					
                                         
					System.out.println(ANSI_RED+"Digite o ano dessa nota."+ANSI_RESET);
					int aaa = in.nextInt();
                                       
                                        
                                        
                                        
                                        ExcluirNota(notas, ddd, mmm, aaa, contN);
                                      
				
				}
                                else if(escolha == 4) {
					                 System.out.println("Programa encerrado... :(");
                                                                       System.out.println("Obrigadooooo");                       
					break;
				}
				else {
					System.out.println("Valor inválido");
					
				}
                                
                                
                                
                                
                                
                                
                                
                          
                      }
                      
                      else if(deci == 4){
                          System.out.println("Programa encerrado... :(");
                                                                       System.out.println("Obrigadooooo");
                          
                          break;
                      
                      }
                      else{
                      System.out.println("Valor inválido");
                      
                      }
                
                
                
                
                }
		
                  
             
		
		
			
		
		
		
			//Comeco codigo
			
	    
		
		
	}
             public static void VerNotas(Notas[]a, int cont){
                 
               for (int i =0; i < cont; i++){
                  if(a[i].dia !=0){
                                             System.out.println(ANSI_RED+a[i].dia+"/"+a[i].mes+" - "+a[i].notas+ANSI_RESET);
                     
                  
                  }

                   
                     
                       
                  
                  
               }
              
        }
        
        public static void ExcluirNota(Notas[] a, int dia,int mes, int ano, int cont){
              
                for(int i = 0; i < cont; i++ ){
                    
                    if(a[i].dia == dia && a[i].mes == mes && a[i].ano == ano){
                        a[i].dia =  0;
                         a[i].mes = 0;
                          a[i].ano = 0;
                          a[i].notas = "";
                   System.out.println("Nota do dia ("+dia+"/"+mes+"/"+ano+"excluída!");
                }
                   
            }
                
        cont--;
 }
           public static void ExcluirContatos(Contato[]a, int cont, String nome){
              
                for(int i = 0; i < cont; i++ ){
                    
                    if(a[i].nome.equalsIgnoreCase(nome)){
                        a[i].nome = "";
                         a[i].tel = "";
                          a[i].email = "";
                          
                   
                }
                   
            }
                System.out.println("Pessoa ("+nome+") excluída!");
        cont--;
 }
               
       
        
         public static void AdicionarContatos(Contato[]a, int cont, String nome, String tel, String email){
                if(cont != 29){
                    
                       a[cont].nome = nome;
                       a[cont].tel = tel;
                       a[cont].email = email;
                   
                    
                    
                
                
                }else{
                    System.out.println("Sua lista de contatos já está cheia :(");
                
                }  
               
        }
        
                public static void ListarContatos(Contato[]a, int cont){
                 
               for (int i =0; i < cont; i++){
                   if(a[i].nome!=""){
                       System.out.println(ANSI_RED+a[i].nome+" - tel: "+a[i].tel+" - email: "+a[i].email+ANSI_RESET);
                     
                   }
                     
                       
                  
                  
               }
              
        }
        public static void Zerar(Compromisso[]a, int cont){
            for(int i = 0; i < cont; i++ ){
                
                    a[i].nome = "";
                    a[i].dia = 0;
                    a[i].mes= 0;
                    a[i].recorrente = "";
                    a[i].dataF = 0;
                    a[i].dataI = 0;
                    
                
                
            }
        cont =1;
        }
         public static void ExcluirUm(String resp2, Compromisso[] a, int cont){
            
                    for(int i = 0; i < cont; i++ ){
                    
                    if(a[i].nome.equalsIgnoreCase(resp2)){
                        a[i].nome = "";
                         a[i].dia = 0;
                          a[i].mes = 0;
                          a[i].recorrente = "";
                          a[i].dataI = 0;
                          a[i].dataF = 0;
                   
                }
                   
            }
                System.out.println("Compromisso ("+resp2+") excluída!");
        cont--;
             
          
        }

        
        
        public static void Registra(Compromisso[] v , int cont, String nome, int dia, int mes, String rec, int dataI, int dataF){
   
                v[cont].nome = nome;
                v[cont].dia = dia;
                v[cont].mes = mes;
                v[cont].recorrente = rec;
                v[cont].dataI = dataI;
                v[cont].dataF = dataF;
          cont++;
				
        }
            
       public static void ListarC(Compromisso[] a, int mes, int cont){
         for (int i =0; i < cont; i++){
                                    
                                    if(a[i].mes == mes){
                                     System.out.println(ANSI_RED+a[i].dia+" - "+ a[i].nome+" dás "+a[i].dataI+" ás "+a[i].dataF+ANSI_RESET);
                                       
                                        
                                    }
                                }
       
       }
        
       public static void ListarT(Compromisso[] a, int cont){
           int c2 = 1;
             for (int i = 0; i< cont; i++) {
                 if(a[i].nome != ""){
                       if(a[i].recorrente == "sim" ) {
                            System.out.println((i+1)+"° - "+a[i].nome+": "+a[i].dia+"/"+a[i].mes+" - recorrente -dàs "+a[i].dataI+" às "+a[i].dataF+".");


                    }
                    else {
                        int t = Calendar.MONTH;
                        
                        if( a[i].mes > t){

                            System.out.println((i+1)+"° - "+a[i].nome+": "+a[i].dia+"/"+a[i].mes+"/"+2023+" -dàs "+a[i].dataI+" às "+a[i].dataF+".");

                        }else{

                            System.out.println((i+1)+"° - "+a[i].nome+": "+a[i].dia+"/"+a[i].mes+"/"+2022+" -dàs "+a[i].dataI+" às "+a[i].dataF+".");

                        }

                    }
                     
                 
                 }else{
                 c2++;
                 
                 }
                 if(c2 == cont){
                    System.out.println("Você não tem mais compromissos /_o_/");
                    System.out.println("                                 |");
                    System.out.println("                                | |");
                 }

            }
           
           
       
                
               
           }
      
         
       
       
    private static void MostrarCalendario( Compromisso[] a, int mes, int ano, int cont) {
        Calendar cal = new GregorianCalendar();
        cal.clear();
        cal.set(ano, mes - 1, 1);  
        System.out.println(ANSI_GREEN+"Calendario  "+ cal.getDisplayName(Calendar.MONTH, Calendar.LONG,
                        Locale.forLanguageTag("pt - BR")) + " " + cal.get(Calendar.YEAR)+ANSI_RESET);
        int primeiroDiaDaSemana = cal.get(Calendar.DAY_OF_WEEK);
        int numeroDeDias = cal.getActualMaximum(Calendar.DAY_OF_MONTH); 
        
        printCalendar(a, numeroDeDias, primeiroDiaDaSemana, mes, cont);
    }
    private static void printCalendar( Compromisso[] arr, int numeroDeDias, int primeiroDiaDaSemana, int mes, int cont) {
    	//Configs
		
		
    	
    	
        int weekdayIndex = 0; 
        System.out.println(ANSI_GREEN+"Do  Se  Te  Qa  Qi  Se  Sa"+ANSI_RESET); 

        for (int day = 1; day < primeiroDiaDaSemana; day++) {
        	
            System.out.print("    "); 
            weekdayIndex++;
            
        
            
        }
        for (int day = 1; day <= numeroDeDias; day++) {

            if (day<10) {
            	for (int ii = 0; ii<cont; ii++) {
            		
            		if (mes == arr[ii].mes && day == arr[ii].dia ) {
                		System.out.print(ANSI_RED+"0"+day+ANSI_RESET+"  ");
                		day++;
                                weekdayIndex++;
                		
                	}
            		
                		
                		
                	
            		
            	}
                System.out.print(ANSI_YELLOW+"0"+day+ANSI_RESET);
               
            	
            }
            else { 
            	for (int ii = 0; ii<cont; ii++) {
            		
            		if (mes == arr[ii].mes && day == arr[ii].dia ) {
                		System.out.print(ANSI_RED+day+ANSI_RESET+"  ");
                		day++;
                                 weekdayIndex++;
                		
                	}
            		
                		
                		
                	
            		
            	}
            	System.out.print(ANSI_YELLOW+day+ANSI_RESET);
            } 
            weekdayIndex++;
            if (weekdayIndex == 7) {
                weekdayIndex = 0;
                System.out.println();
            } else { 
                System.out.print("  ");
            }}}
		

	

}




