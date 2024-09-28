import java.util.Scanner;
class Palindrome{
	
	static boolean checkPalindrome(int num){
		if(num<0){
			return false;
		}	
		int original = num;
		int reverse = 0;
		while(num>0){
			int lastDigit = num%10;
			reverse = reverse*10 + lastDigit;
			num = num/10;
		}
		return original == reverse;
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer for which you want ot check palindrome : ");
		int num = sc.nextInt();
		
		boolean result = checkPalindrome(num);
		System.out.println(result);
		
	}
}