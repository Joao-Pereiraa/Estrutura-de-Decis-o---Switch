import java.util.Scanner;


public class atividade6 {

	public static void main(String[] args) {
		 
		int number1;
		int number2;
		
		
		Scanner leitor = new Scanner(System.in);

		
		System.out.println("  -----------------  ");
		System.out.println(" |Cargo      |Código|");
		System.out.println(" |Diretor    | 101  |");
		System.out.println(" |Engenheiro | 102  |");
		System.out.println(" |Técnico    | 103  |");
		System.out.println(" |Gerente    | 104  |");
		System.out.println(" |Analista   | 105  |");
		System.out.println(" |Coordenador| 106  |");
		System.out.println("  -----------------  ");
		
		
		System.out.println(" digite o código do cargo " );
		number1 = leitor.nextInt();
		
		switch(number1) {
		
		case 101:
			System.out.println(" digite seu salário");
			number2 = leitor.nextInt();
			System.out.println("diretor");
			System.out.println("salário antigo:" + number2 + " reais");
			System.out.println("salário atual:" + ( number2 + (number2 *10 /100)) + " reais");
			System.out.println("diferença :" + (number2 *10 /100) + " reais");	
		break;
		
		case 102:
			System.out.println(" digite seu salário");
			number2 = leitor.nextInt();
			System.out.println("Engenheiro");
			System.out.println("salário antigo:" + number2 + " reais");
			System.out.println("salário atual:" + ( number2 + (number2 *20 /100)) + " reais");
			System.out.println("diferença :" + (number2 *20 /100) + " reais");	
		break;
		
		case 103:
			System.out.println(" digite seu salário");
			number2 = leitor.nextInt();
			System.out.println("Técnico");
			System.out.println("salário antigo:" + number2 + " reais");
			System.out.println("salário atual:" + ( number2 + (number2 *30 /100)) + " reais");
			System.out.println("diferença :" + (number2 *30 /100) + " reais");	
		break;
		
		case 104:
			System.out.println(" digite seu salário");
			number2 = leitor.nextInt();
			System.out.println("Gerente ");
			System.out.println("salário antigo:" + number2 + " reais");
			System.out.println("salário atual:" + ( number2 + (number2 *10 /100)) + " reais");
			System.out.println("diferença :" + (number2 *10 /100) + " reais");	
		break;
		
		case 105:
			System.out.println(" digite seu salário");
			number2 = leitor.nextInt();
			System.out.println("Analista");
			System.out.println("salário antigo:" + number2 + " reais");
			System.out.println("salário atual:" + ( number2 + (number2 *30 /100)) + " reais");
			System.out.println("diferença :" + (number2 *30 /100) + " reais");	
		break;
		
		case 106:
			System.out.println(" digite seu salário");
			number2 = leitor.nextInt();
			System.out.println("Coordenador");
			System.out.println("salário antigo:" + number2 + " reais");
			System.out.println("salário atual:" + ( number2 + (number2 *20 /100)) + " reais");
			System.out.println("diferença :" + (number2 *20 /100) + " reais");	
		break;
	
		default:
			System.out.println(" digite seu salário");
			number2 = leitor.nextInt();
			System.out.println("salário antigo:" + number2 + " reais");
			System.out.println("salário atual:" + ( number2 + (number2 *40 /100)) + " reais");
			System.out.println("diferença :" + (number2 *40 /100) + " reais");	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
	}
	
}
