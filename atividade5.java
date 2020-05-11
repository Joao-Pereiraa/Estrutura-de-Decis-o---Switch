import java.util.Scanner;


public class atividade5 {
	
	public static void main(String[] args) {
		
		int number1;
		int number2;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("  ------------------------------------- ");
		System.out.println(" |Código|  Condição de pagamento       |");
		System.out.println(" |  1   | À vista em dinheiro ou cheque|");
		System.out.println(" |  2   | À vista com cartão de crédito|");
		System.out.println(" |  3   | Em 2 vezes                   |");
		System.out.println(" |  4   | Em 3 vezes                   |");
		System.out.println("  ------------------------------------- ");
		
		System.out.println(" digite o código da forma de pagamento" );
		number1 = leitor.nextInt();
		
		switch(number1){
		
		case 1:
			System.out.println(" 10% de desconto ");
			System.out.println("digite o preço da etiqueta do produto");
			number2 = leitor.nextInt();
			
			System.out.println(" valor do pagamento: " + ( number2 - (number2 *10 /100)) + " reais");
		break;

		case 2:
			System.out.println(" 5% de desconto ");
			System.out.println("digite o preço da etiqueta do produto");
			number2 = leitor.nextInt();
			
			System.out.println(" valor do pagamento: " + ( number2 - (number2 *5 /100)) + " reais");
		break;
		
		case 3:
			System.out.println(" sem desconto ");
			System.out.println("digite o preço da etiqueta do produto");
			number2 = leitor.nextInt();
			
			System.out.println(" valor do pagamento: " + ( number2 ) + " reais");
		break;
		
		case 4:
			System.out.println(" acréscimo de 10% ");
			System.out.println("digite o preço da etiqueta do produto");
			number2 = leitor.nextInt();
			
			System.out.println(" valor do pagamento: " + ( number2 + (number2 *10 /100)) + " reais");
		break;
		
		
		
	
	}}

}
