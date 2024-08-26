// q5. Write a program to print the Fibonacci sequence up to the number 21. 

class fibonacci{
	public static void main( String args[]){
		int number = 21;
		int firstNo = 0;
		int secondNo = 1;
		
		for(int i= 0; i<number; i++){
			System.out.println(firstNo+ " ");
			
			int next = firstNo +secondNo;
			firstNo = secondNo;
			secondNo = next;
		}
	}
}