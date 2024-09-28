class Recursion1{
	static void show(){
		System.out.println("Hello welcome to infinite loop");
		show();
	}


public static void main(String args[]){
	show();
}
}