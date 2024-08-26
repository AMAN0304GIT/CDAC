/*
q15. Write a program to print the following pattern:
    *
   * *
  * * *
 * * * *
* * * * *
*/

class pattern4{
	public static void main(String args[]){
		//for printing empty spaces
		for(int i= 1; i<=5; i++){
			for(int j= i; j<5; j++){
				System.out.print(" ");
			}
			
		// printing stars
			for(int j= 1; j<=i; j++){
				System.out.print("*");
				if(j<i){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}