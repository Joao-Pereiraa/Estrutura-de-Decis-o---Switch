import java.util.Scanner;


public class atividade4 {

	public static void main(String[] args) {
		
      int number1;
      int number2;
      int number3;
      int number4;
 
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(" ---------------------------- ");
		System.out.println("| Opção 1:|média aritmética  |");
		System.out.println("| Opção 2:|ponderada         |");
		System.out.println(" ---------------------------- ");	
		
		
		System.out.println(" digite a opção ");
		number1 = leitor.nextInt();
		
		
switch(number1){
		
		case 1:
			System.out.println(" digite as notas");
			number2 = leitor.nextInt();
			number3 = leitor.nextInt();
			number4 = leitor.nextInt();
			System.out.println(number2 + number3 + number4);
		break;
		
		case 2:
			System.out.println(" digite as notas");
			number2 = leitor.nextInt();
			number3 = leitor.nextInt();
			number4 = leitor.nextInt();
			System.out.println(number2 +"," +number3 +","  +number4);
			
		break;
		
		default:
			System.out.println("não existe essa opção");	
	}
} }
