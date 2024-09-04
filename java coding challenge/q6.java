class q6 {
    public static void main(String[] args) {
       
        int rows = 4;

        // Print the upper triangle
        
        for (int i = 1; i <= rows; i++) {
            
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
    System.out.println();
        }

        // Print the lower triangle
        
        for (int i = rows - 1; i >= 1; i--) {
            
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
           
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}
