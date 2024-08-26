//q6. Write a program to find and print the first 5 prime numbers.

class Prime{
	public static void main(String args[]){
		int count = 0; 
		
		
		for(int i= 2; count<5; i++){
			if(i%2 != 0){
				System.out.println(i);
				count++;
			}
		}
	}
}