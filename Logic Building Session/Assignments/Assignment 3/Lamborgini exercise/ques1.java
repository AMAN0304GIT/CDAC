// q1.Write a program to calculate the sum of the first 50 natural numbers. 

class sum{
	public static void main(String args[]){
		int sum = 0;
		for(int i= 0; i<=50; i++ ){
			sum = sum+i;
		}
		System.out.println("The sum of first 50 natural numbers are: " + sum);
	}
}