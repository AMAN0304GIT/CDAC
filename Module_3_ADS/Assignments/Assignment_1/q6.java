import java.util.*;
class Sqrt{
	
	static int findSquareRoot(int x){
		if(x<0){
			System.out.println("You entered a number for which sqaure root doesn't exist. ");
		}
		if(x==0||x==1){
			return x;
		}
		int result = x;
		while(result> x/result){
			result = (result+x/result)/2;
		}
		return result;
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number : ");
		int x = sc.nextInt();
		
		int sqrt  = findSquareRoot(x);
		
		System.out.println("The sqaure root of " +x + " is " +sqrt );
	}
}