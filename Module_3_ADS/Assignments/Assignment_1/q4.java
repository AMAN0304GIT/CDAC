import java.util.Scanner;

class fibonacci{
	
	static int fib(int n){
		if(n<=1){
			return n;
		}
		else{
			return fib(n-1)+fib(n-2);
		}
		
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :  ");
		int num = sc.nextInt();
		
		for(int i = 0; i<= num; i++ )
		{
			System.out.print(fib(i) + " " );
		}
	}
}