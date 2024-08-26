/*
q17. Write a program to print the following pattern:
   * * * * *
   |* * * *
   ||* * *
   |||* *
   ----* 
*/

class pattern6{
	public static void main(String args[]){
		int rows = 5;
		// iterating through rows
		for(int i= 0; i<rows; i++){
			// printing the leading spaces
			for(int j =0; j<i; j++){
				System.out.print(" ");
			}
			
			//printing the stars
			for(int j=0; j<(rows-i); j++){
				System.out.print("*");
				if(j<(rows-i-1)){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}