import java.util.Scanner;


public class atividade6 {

	public static void main(String[] args) {
		 
		int number1;
		int number2;
		
		
		Scanner leitor = new Scanner(System.in);

		
		System.out.println("  -----------------  ");
		System.out.println(" |Cargo      |C�digo|");
		System.out.println(" |Diretor    | 101  |");
		System.out.println(" |Engenheiro | 102  |");
		System.out.println(" |T�cnico    | 103  |");
		System.out.println(" |Gerente    | 104  |");
		System.out.println(" |Analista   | 105  |");
		System.out.println(" |Coordenador| 106  |");
		System.out.println("  -----------------  ");
		
		
		System.out.println(" digite o c�digo do cargo " );
		number1 = leitor.nextInt();
		
		switch(number1) {
		
		case 101:
			System.out.println(" digite seu sal�rio");
			number2 = leitor.nextInt();
			System.out.println("diretor");
			System.out.println("sal�rio antigo:" + number2 + " reais");
			System.out.println("sal�rio atual:" + ( number2 + (number2 *10 /100)) + " reais");
			System.out.println("diferen�a :" + (number2 *10 /100) + " reais");	
		break;
		
		case 102:
			System.out.println(" digite seu sal�rio");
			number2 = leitor.nextInt();
			System.out.println("Engenheiro");
			System.out.println("sal�rio antigo:" + number2 + " reais");
			System.out.println("sal�rio atual:" + ( number2 + (number2 *20 /100)) + " reais");
			System.out.println("diferen�a :" + (number2 *20 /100) + " reais");	
		break;
		
		case 103:
			System.out.println(" digite seu sal�rio");
			number2 = leitor.nextInt();
			System.out.println("T�cnico");
			System.out.println("sal�rio antigo:" + number2 + " reais");
			System.out.println("sal�rio atual:" + ( number2 + (number2 *30 /100)) + " reais");
			System.out.println("diferen�a :" + (number2 *30 /100) + " reais");	
		break;
		
		case 104:
			System.out.println(" digite seu sal�rio");
			number2 = leitor.nextInt();
			System.out.println("Gerente ");
			System.out.println("sal�rio antigo:" + number2 + " reais");
			System.out.println("sal�rio atual:" + ( number2 + (number2 *10 /100)) + " reais");
			System.out.println("diferen�a :" + (number2 *10 /100) + " reais");	
		break;
		
		case 105:
			System.out.println(" digite seu sal�rio");
			number2 = leitor.nextInt();
			System.out.println("Analista");
			System.out.println("sal�rio antigo:" + number2 + " reais");
			System.out.println("sal�rio atual:" + ( number2 + (number2 *30 /100)) + " reais");
			System.out.println("diferen�a :" + (number2 *30 /100) + " reais");	
		break;
		
		case 106:
			System.out.println(" digite seu sal�rio");
			number2 = leitor.nextInt();
			System.out.println("Coordenador");
			System.out.println("sal�rio antigo:" + number2 + " reais");
			System.out.println("sal�rio atual:" + ( number2 + (number2 *20 /100)) + " reais");
			System.out.println("diferen�a :" + (number2 *20 /100) + " reais");	
		break;
	
		default:
			System.out.println(" digite seu sal�rio");
			number2 = leitor.nextInt();
			System.out.println("sal�rio antigo:" + number2 + " reais");
			System.out.println("sal�rio atual:" + ( number2 + (number2 *40 /100)) + " reais");
			System.out.println("diferen�a :" + (number2 *40 /100) + " reais");	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
	}
	
}
