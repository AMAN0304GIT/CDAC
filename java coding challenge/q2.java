class q2 {
    public static void main(String[] args) {
        
        int rows = 5;
        for (int i = rows; i >=1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

                for (int j = 1; j <= (2 * i - 1); j++) {
                
                if (j == 1 || j == (2 * i - 1) || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
         System.out.println();
        }
    }
}
