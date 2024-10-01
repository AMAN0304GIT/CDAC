import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int reversed = 0;
        int sign = (number < 0) ? -1 : 1;
        number = Math.abs(number);
        
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        
        reversed *= sign;
        System.out.println("Reversed number: " + reversed);
        
        sc.close();
    }
}
