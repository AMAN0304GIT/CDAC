/*
q18.18. Write a program to print the following pattern:
		  *
		 ***
		*****
	   *******
		*****
		 ***
		  * 

*/

class pattern7{
	
	public static void main(String args[]){
		int rows1 = 4;
	for(int i = 1; i<=rows1; i++){
			// printing spaces
			for(int j = i; j<rows1; j++){
				System.out.print(" ");
			} 
			// printing stars
			for(int j = 1 ; j<=2*i-1; j++){
				System.out.print("*");
			}
		System.out.println();	
			
		}
	for(int i = rows1-1; i>=1; i--){
		for(int j = rows1; j>i; j-- ){
			System.out.print(" ");
		}
		
		for(int j = 1; j<=2*i-1; j++){
			System.out.print("*");
		}
		
		System.out.println();
	}
		
	}
	
}