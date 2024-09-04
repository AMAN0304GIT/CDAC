import java.util.*;

class area{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("select a shape based on number assigned to them:");
        System.out.println("Enter 1 for circle");
        System.out.println("Enter 2 for square");
        System.out.println("Enter 3 for Rectangle");
        System.out.println("Enter 4 for triangle");

        int shape = sc.nextInt();

        switch(shape){
            case 1: System.out.println("You selected circle, now enter the radius of the circle:");
                    int radius = sc.nextInt();
                    System.out.println("the area is: " + 3.14*radius*radius);
                    break;
            case 2: System.out.println("You selected Square, now enter the side of the square:"); 
                    int side = sc.nextInt();
                    System.out.println("the area is: " + side*side);
                    break;
            case 3: System.out.println("You selected Rectangle, now enter the length and breadth of the rectangle:"); 
                    int length = sc.nextInt();
                    int breadth = sc.nextInt();
                    System.out.println("the area is: " + length*breadth);
                    break;    
            case 4: System.out.println("You selected Triangle, now enter the height and base side of the triangle:"); 
                    int height = sc.nextInt();
                    int base_side = sc.nextInt();
                    System.out.println("the area is: " + (base_side*height)/2);
                    break; 

            default: System.out.println("Enter the correct shape");            
                }

    }
}