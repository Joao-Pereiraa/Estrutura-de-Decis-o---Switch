import java.util.Scanner;


public class Atividade2 {
	public static void main(String[] args) {
		
		int number1;
		int number2;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("  ----------------------------- ");
		System.out.println(" |Especificação  |Código| Preço|");
		System.out.println(" |Cachorro quente| 100  | 3,20 |");
		System.out.println(" |Bauru simples  | 101  | 4,30 |");
		System.out.println(" |Bauru com ovo  | 102  | 5,50 |");
		System.out.println(" |Hambúrger      | 103  | 3,20 |");
		System.out.println(" |Cheeseburguer  | 104  | 4,30 |");
		System.out.println(" |Refrigerante   | 105  | 4,00 |");
		System.out.println("  ----------------------------- ");
		
		System.out.println("  digite o código do item: ");
		number1 = leitor.nextInt();
		
switch(number1){
		
		case 100:
			System.out.println( "digite a quantidade do produto");
			number2 = leitor.nextInt();
			
			System.out.println("Cachorro Quente");
			System.out.println( number2 * 3.20  +" Reais");
		break;
		
		case 101:
			System.out.println( "digite a quantidade do produto");
			number2 = leitor.nextInt();
			
			System.out.println("Bauru simples");
			System.out.println( number2 * 4.30  +" Reais");
		break;
		
		case 102:
			System.out.println( "digite a quantidade do produto");
			number2 = leitor.nextInt();
			
			System.out.println("Bauru com ovo");
			System.out.println( number2 * 5.50  +" Reais");
		break;
		
		case 103:
			System.out.println( "digite a quantidade do produto");
			number2 = leitor.nextInt();
			
			System.out.println("Hambúrger");
			System.out.println( number2 * 3.20  +" Reais");
		break;
		
		case 104:
			System.out.println( "digite a quantidade do produto");
			number2 = leitor.nextInt();
			
			System.out.println("Cheeseburguer");
			System.out.println( number2 * 4.30  +" Reais");
		break;
		
		case 105:
			System.out.println( "digite a quantidade do produto");
			number2 = leitor.nextInt();
			
			System.out.println("Refrigerante");
			System.out.println( number2 * 4.00  +" Reais");
		break;
		
		default:
			System.out.println("não existe esse produto");
	

} }
}


