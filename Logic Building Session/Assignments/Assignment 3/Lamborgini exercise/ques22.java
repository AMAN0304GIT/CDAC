/*
q22. Write a program to print the following pattern:
		*********
		 *******
		  *****
		   ***
		    *
		   ***
		  *****
		 *******
		*********
*/

class pattern11{
	public static void main(String args[]){
		int row= 5;
		
		for(int i= 0; i<row; i++){
			for(int j= 0; j<i; j++){
				System.out.print(" ");
			}
			
			for(int j= 0; j<2*(row-i)-1; j++){
				System.out.print("*");
			}
		System.out.println();		
		}
		
		for(int i= 1; i<row; i++){
			for(int j= 0; j<(row-i-1);j++){
				System.out.print(" ");
			}
			for(int j= 0; j<(2*i+1); j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}