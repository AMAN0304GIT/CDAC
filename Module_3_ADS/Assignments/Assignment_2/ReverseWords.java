import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Reverse the order of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        
        // Trim the extra space at the end
        System.out.println("Reversed words: " + reversed.toString().trim());
        
        sc.close();
    }
}
