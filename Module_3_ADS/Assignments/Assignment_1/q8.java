import java.util.*;

class FirstNRC{
	
	static Character findFirstNonRepeatedChar(String str){
		int[] charCount = new int[256];
	
	for(char c : str.toCharArray()){
		charCount[c]++;
	}
	
	for (char c : str.toCharArray()) {
        if (charCount[c] == 1) {
				return c;
            }
        }
		return ' ';
	
	}
	
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		
		String txt = sc.nextLine();
		
		char res = findFirstNonRepeatedChar(txt);
		if(res != ' '){
			System.out.println("'"+res+"'");
		}
		else{
			System.out.println("No non-repeated character found.");
		}
	}
}