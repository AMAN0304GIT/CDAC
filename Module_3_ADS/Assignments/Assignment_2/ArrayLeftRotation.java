import java.util.Scanner;

class LeftRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the number of rotations (d): ");
        int d = sc.nextInt();
        
        // Rotate the array by d positions to the left
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + d) % n];
        }
        
        // Display the rotated array
        System.out.println("Array after " + d + " left rotations:");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}
