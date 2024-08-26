//q9. Write a program to find and print the largest digit in the number 4825.

class largest_digit{
	public static void main(String args[]){
		int number = 4825;
		int largest = 0;
		
		while(number>0){
			//extract last digit
			int digit = number%10;
			if(digit>largest){
				largest = digit;
			}
			number = number/10;
		}
		System.out.println(largest);
	}
}