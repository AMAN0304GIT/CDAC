
import java.util.*;

class bmi{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float weight = sc.nextFloat();
        float height = sc.nextFloat();

        height = height/100;

        float bmi = (weight/(height*height));
        System.out.println("the bmi is : " + bmi);
        if(bmi>40.0){
            System.out.println("the person is obese");
        }
        else if(bmi>25.0){
            System.out.println("the person is overweight");
        }
        else if(bmi >18.5){
            System.out.println("the person is normal");
        }
        else{
            System.out.println("the person is underweight");
        }

    }
}