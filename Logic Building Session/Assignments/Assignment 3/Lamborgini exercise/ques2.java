// q2. Write a program to compute the factorial of the number 10. 
class factorial{
	public static void main(String args[]){
		int num = 10;
		int factorial = 1;
		
		for(int i= 1; i<=num; i++ ){
			factorial = factorial *i;
		}
		System.out.println("The factorial of 10 is " + factorial);
	}
}
