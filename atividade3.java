import java.util.Scanner;


public class atividade3 {
	
	public static void main(String[] args) {
		
		int number1;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println( "          Menu de Op��es "    );
		System.out.println(" ----------------------------------------------- ");
		System.out.println("| 1    |Executa a rotina de Inclus�o de Alunos  |");
		System.out.println("| 2    |Executa a rotina de Altera��o de Alunos |");
		System.out.println("| 3    |Executa a rotina de Exclus�o de Alunos  |");
		System.out.println("| 4    |Executa a rotina de Consulta de Alunos  |");
		System.out.println(" ----------------------------------------------- ");
		
		
		System.out.println("digite a op��o ");
		number1 = leitor.nextInt();
		
	switch(number1){
		
		case 1:
			System.out.println("Executa a rotina de Inclus�o de Alunos");
		break;
		
		case 2:
			System.out.println("Executa a rotina de Altera��o de Alunos ");
		break;
		
		case 3:
			System.out.println("Executa a rotina de Exclus�o de Alunos");
		break;
		
		case 4:
			System.out.println("Executa a rotina de Consulta de Alunos");
		break;
		
		default:
			System.out.println("n�o existe essa op��o");
	

}}}
