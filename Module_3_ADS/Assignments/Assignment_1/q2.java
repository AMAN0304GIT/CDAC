import java.util.*;
class PrimeOrNotPrime{
	
	public static boolean isPrime(int number){
		
		if(number <= 1){
			return false;
		}
		
		else if(number == 2){
			return true;
		}
		else if(number%2 == 0){
			return false;
		}
		else{
			return true;
		}
		
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		if(isPrime(number)){
			System.out.println(number + " is a prime number.");
		}
		else{
			System.out.println(number + " is not a prime number.");
		}
		
		sc.close();
	}
}