import java.util.Scanner;
class checkPositive{
	public static void main( String args[]){
	int num;	
	Scanner scn = new Scanner(System.in);
	num = scn.nextInt();
	if(num > 0){
		System.out.println("the Number:" + num +"is positive");
		} 
	else{
		System.out.println("the Number:" + num +"is negative");
		}
	} 
}