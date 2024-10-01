import java.util.Scanner;

class StringPalindrome{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		
		String reversed = new StringBuilder(str).reverse().toString();
		
		if(str.equals(reversed)){
			System.out.println("The String is a Palindrome.");
		}
		else{
			System.out.println("The String is not a Palindrome.");
		}
		
		sc.close();
	}
}