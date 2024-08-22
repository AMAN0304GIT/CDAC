import java.util.Scanner;
class checkOddEven{
	public static void main( String args[]){
	int num;	
	Scanner scn = new Scanner(System.in);
	num = scn.nextInt();
	if(num %2 == 0){
		System.out.println("the Number:" + num +"is even");
		} 
	else{
		System.out.println("the Number:" + num +"is odd");
		}
	} 
}