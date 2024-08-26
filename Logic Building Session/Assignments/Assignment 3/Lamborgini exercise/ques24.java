/*
q24. Write a program to print the following pattern:
1
22
333
4444
55555
*/

class pattern13{
	public static void main(String args[]){
		for(int i= 0; i<5; i++){
			for(int j = 1 ; j<=i+1; j++){
				System.out.print(i+1);
			}
		System.out.println();	
		}
	}
}