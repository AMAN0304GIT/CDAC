// q11. Write a Java program to demonstrate the use of both pre-increment and post-decrement
//        operators in a single expression 
class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Using both pre-increment and post-decrement in a single expression
        int result = ++a + b--;

        System.out.println("Result of the expression (++a + b--): " + result);
        System.out.println("Value of a after the expression: " + a);
        System.out.println("Value of b after the expression: " + b);
    }
}
