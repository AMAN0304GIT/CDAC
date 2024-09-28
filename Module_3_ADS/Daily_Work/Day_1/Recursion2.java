class Recursion2{
	static int i = 0;
	static void show(){ // recursion method
		i++;
		if (i<=5)// this is the base condition or we can say termination condition 
		{
			System.out.println("Hello ji");
			show(); // recursive call
		}
	}
	
	public static void main(String args[]){
		show();
	}
}