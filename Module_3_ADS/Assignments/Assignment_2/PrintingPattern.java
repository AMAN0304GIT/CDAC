import java.util.Scanner;

class RightTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows (n): ");
        int n = sc.nextInt();
        
        // Loop for rows
        for (int i = 1; i <= n; i++) {
            // Loop for columns (stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line after each row
        }
        
        sc.close();
    }
}
