import java.util.*;

class RepeatedCharacter{
	
	static void findRepeatedCharacter(String str){
	
	int[] charCount = new int[256];
	
	for(char c : str.toCharArray()){
		charCount[c]++;
	}
	
	System.out.print("Repeated characters: [");
    boolean first = true;
	for (char c = 0; c < charCount.length; c++) {
        if (charCount[c] > 1) {
            if (!first) {
				System.out.print(", ");
            }
                System.out.print("'" + c + "'");
                first = false;
            }
        }
    System.out.println("]");
}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String text  = sc.nextLine();
		
		findRepeatedCharacter(text);
	}
}