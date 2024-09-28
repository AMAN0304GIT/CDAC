package Recursion;
import java.util.Scanner;

class Recursion6 {
    //tower of hanoi
    static void toh(int num , char s , char inter, char d){
        if(num ==1){
            System.out.println("Disk from " +s + " to " +d);
        }
        else{
            toh(num-1, s, d, inter);
            System.out.println("Disk from " +s + " to " +d);
            toh(num-1, inter, s, d);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks :  ");
        int num = sc.nextInt();

        toh(num , 'A', 'B' , 'C');
    }
}
