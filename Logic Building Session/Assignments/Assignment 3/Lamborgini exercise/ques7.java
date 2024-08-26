//q7. Write a program to calculate the sum of the digits of the number 9876. The output should be
//    30 (9 + 8 + 7 + 6). 

class sum{
	public static void main(String args[]){
		int number = 9876;
		int total_digit = 4;
		int sum = 0;
		int rev_digit = 0;
		
		for(int i= 0; i<total_digit;i++){
			rev_digit = number%10;
			number = number/10;
			sum = sum+rev_digit;
		}
		System.out.println(sum);
	}
}