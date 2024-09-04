
import java.util.*;

class season{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number between 1-12 to know the weather: ");
        int month = sc.nextInt();

        switch(month){
            case 1:    System.out.println("Winter");
                        break;
            case 2:    System.out.println("Winter");
                        break;
            case 3:    System.out.println("Winter");
                        break;
            case 4:    System.out.println("Summer");
                        break;
            case 5:    System.out.println("Summer");
                        break;
            case 6:    System.out.println("Summer");
                        break;
            case 7:    System.out.println("Summer");
                        break;
            case 8:    System.out.println("Autumn");
                        break;
            case 9:    System.out.println("Spring");
                        break;
            case 10:    System.out.println("Spring");
                        break;
            case 11:    System.out.println("Winter");
                        break;
            case 12:    System.out.println("Winter");
                        break;
            default:    System.out.println("Enter the correct month");
                        break;
        }

    }
}