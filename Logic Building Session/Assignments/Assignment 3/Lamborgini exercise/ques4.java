//q4.Write a program to reverse the digits of the number 1234. The output should be 4321. 
class reverse_digit{
	public static void main(String args[]){
		int num = 1234;
		int total_digit = 4;
		int temp = 0;
		
		for(int i= 0; i<total_digit; i++){
			int remainder = (num)%10;
			temp = remainder;
			num = num/10;
			System.out.print(temp+ "");
		}
	}
}
