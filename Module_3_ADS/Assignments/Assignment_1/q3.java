import java.util.*;


class factorial{
	
	static int fact(int num){
		if(num<=1){
			return 1;
		}
		else{
			return num*fact(num-1);
		}
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int factorial  = fact(num);
		System.out.println("the factorial of " + num + " is " +  factorial);
	}
}