/*
q16. 16. Write a program to print the following pattern:
    *
   ***
  *****
 *******
********* 

*/

class pattern5{
	
	public static void main(String args[]){
		int rows = 5;
	for(int i = 1; i<=rows; i++){
			// printing spaces
			for(int j = i; j<rows; j++){
				System.out.print(" ");
			} 
			// printing stars
			for(int j = 1 ; j<=2*i-1; j++){
				System.out.print("*");
			}
		System.out.println();	
			
		}
	}
	
}