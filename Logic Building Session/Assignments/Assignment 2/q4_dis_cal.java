import java.util.Scanner;
class discount_cal{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the total purchase amount: ");
		double totalAmt = scn.nextDouble();
		
		System.out.println("Do you have a membership card (Y/N):");
		String hasMembership = scn.next();
		
		double discount = 0.0;
		
		if(totalAmt>=1000){
			discount = 20.0;
		}
		else if(totalAmt>= 500 && totalAmt<1000){
			discount= 10.0;
		}
		else{
			discount= 5.0;
		}
		
		if(hasMembership.equalsIgnoreCase("Y")){
		discount = discount+5.0;
		
		}
		
		double discountAmt = (discount/100)*totalAmt;
		double finalAmt = totalAmt-discountAmt;
		
		
		System.out.println("total discount: "+ discount + "%");
		System.out.println("Discount amount: "+ discountAmt);
		System.out.println("final amount: "+ finalAmt );
		
	}
	
}