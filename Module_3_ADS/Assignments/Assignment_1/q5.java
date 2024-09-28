import java.util.*;
class Gcd{
	
	static int gcd(int num1 , int num2){
		while(num2 != 0){
			int temp = num2;
			num2 = num1%num2;
			num1 = temp;
		}
		return num1;
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		
		System.out.println("The greatest common divisor is : " + gcd(num1, num2));
	}
	
}