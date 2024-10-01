import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();
        
        int[] arr = new int[n + 1];  // Extra space to avoid boundary checks
        
        System.out.println("Enter the queries as (start, end, value):");
        for (int i = 0; i < q; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int value = sc.nextInt();
            arr[start - 1] += value;
            arr[end] -= value;
        }
        
        // Applying the range update effect
        int max = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
        }
        
        System.out.println("Maximum value after manipulation: " + max);
        
        sc.close();
    }
}
