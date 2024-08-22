import java.util.Scanner;
class largestOfThree{
	public static void main( String args[]){
	int num1, num2, num3;	
	Scanner scn = new Scanner(System.in);
	num1 = scn.nextInt();
	num2 = scn.nextInt();
	num3 = scn.nextInt();
	if(num1>num2 && num1>num3){
		System.out.println("Num1 is largest");
		}
	else if(num2 > num1 && num2 > num3){
		System.out.println("Num2 is largest");
		}
	else{
		System.out.println("Num3 is largest");
		}
  } 
}