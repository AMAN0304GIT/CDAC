import java.util.*;

class LeapYear{
	
	static boolean isLeapYear(int year){
		return(year%4 == 0 && year%100 != 0)|| (year%400 == 0);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		
		boolean result = isLeapYear(year);
		System.out.println(result);
	}
}