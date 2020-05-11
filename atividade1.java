import java.util.Scanner;


public class atividade1 {
	public static void main(String[] args) {
		
int number1;
		
		Scanner leitor = new Scanner(System.in);

		System.out.println(" -------------------------- ");
		System.out.println("|código “001” : Parafuso   |");
		System.out.println("|código “002” : Porca      |");
		System.out.println("|código “003” : Prego      |");
		System.out.println("|código “004” : Ferramenta |");
		System.out.println(" -------------------------- ");
		
		
		System.out.println(" digite o código do produto: ");
		number1 = leitor.nextInt();
		
		switch(number1){
		
		case 001:
			System.out.println("Parafuso");
		break;
		
		case 002:
			System.out.println("Porca");
		break;
		
		case 003:
			System.out.println("Prego");
		break;
		
		case 004:
			System.out.println("Ferramenta");
		break;
		
		default:
			System.out.println("Diversos");
	

} } }
