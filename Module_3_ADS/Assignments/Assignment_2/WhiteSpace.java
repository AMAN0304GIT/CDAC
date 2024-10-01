import java.util.Scanner;

class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Using replaceAll() to remove white spaces
        String result = input.replaceAll("\\s", "");
        
        System.out.println("String without white spaces: " + result);
        
        sc.close();
    }
}
