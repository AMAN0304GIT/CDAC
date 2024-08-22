import java.util.Scanner;
class calculatorProg{
	public static void main( String args[]){	
	Scanner scanner = new Scanner(System.in);
	System.out.println("ENTER THE FIRST NUMBER:");
	double num1 = scanner.nextDouble();
	System.out.println("ENTER THE SECOND NUMBER:");
	double num2 = scanner.nextDouble();
	System.out.println("ENTER THE operator (+,-,*,/):");
	char operator = scanner.next().charAt(0);
	
	double result;
	
	switch(operator){
		case '+':
				result = num1+num2;
				System.out.println("the result is :" + result);
				break;
		case '-':
				result = num1-num2;
				System.out.println("the result is :" + result);
				break;
		case '*':
				result = num1*num2;
				System.out.println("the result is :" + result);
				break;
		case '/':
				if(num2 != 0){
					result = num1/num2;
					System.out.println("the result is :" + result);
				}
				else{
					System.out.println("ERROR: DIVISION BY ZERO IS NOT ALLOWED");
				}
				break;
		default: 
				System.out.println("OPERATOR IS NOT VALID");
				break;
				
	}
	
	
	}
}