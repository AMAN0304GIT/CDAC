import java.util.Scanner;
class gradeClassification{
	public static void main( String args[]){
	int marks;	
	Scanner scn = new Scanner(System.in);
	marks = scn.nextInt();
	
	if (marks >= 90) {
    System.out.println("Grade: A");
	} 
	else if (marks >= 80) {
    System.out.println("Grade: B");
	} 
	else if (marks >= 70) {
    System.out.println("Grade: C");
	} 
	else if (marks >= 60) {
    System.out.println("Grade: D");
	}
	else {
    System.out.println("Grade: F");
}
	}
}