import java.util.Scanner; 

                                            // using if- else


// class leapYear{
//     public static void main(String[] args){
//         Scanner scn = new Scanner(System.in);
//         int year = scn.nextInt();
        
        
//         if(year%400==0 || (year%4 == 0 && year%100 != 0)){
//             System.out.println(year + " is a leap year.");
//         }
//         else{
//             System.out.println(year+ " is not a leap year");
//         }
//     }
// }
                                            // using switch-case




                                            
class leapyear{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        int r = (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) ? 1 : 0;

        switch(r){
            case 1 : 
                    System.out.println("leap year");
                    break;
            case 0 :
                    System.out.println("Not a leap year");         
                    break;
            default :
                    System.out.println("Not a leap year");        
                    break;
                }
    }
}