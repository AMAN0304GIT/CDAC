import java.util.*;
 class ArmStrongNumber{
	
	public static boolean isArmstrong(int number){
		int original_no = number;
		int sum = 0;
		int numberOfDigits = String.valueOf(number).length();
		
		
		while(number>0){
			int digit = number%10;
			sum += Math.pow(digit, numberOfDigits);
			number = number/10;
		}
		return sum == original_no;
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		if(isArmstrong(number)){
			System.out.println(number + " is armstrong number.");
		}
		else{
			System.out.println(number + " is not an armstrong number.");
		}
		
		sc.close();
	}
	
}