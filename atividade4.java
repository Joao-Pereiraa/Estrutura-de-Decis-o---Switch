import java.util.Scanner;


public class atividade4 {

	public static void main(String[] args) {
		
      int number1;
      int number2;
      int number3;
      int number4;
 
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(" ---------------------------- ");
		System.out.println("| Op��o 1:|m�dia aritm�tica  |");
		System.out.println("| Op��o 2:|ponderada         |");
		System.out.println(" ---------------------------- ");	
		
		
		System.out.println(" digite a op��o ");
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
			System.out.println("n�o existe essa op��o");	
	}
} }
