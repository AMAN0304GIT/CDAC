class q3{
    public static void main(String[] args){
        char currentchar = 'A';
        for(int i= 1; i<=5; i++){
            
            // printing spaces
            for(int j= i; j<5; j++){
                System.out.print(" ");
            }

            // printing alphabet
            for(int k=1; k<=(2*i-1); k++){
                System.out.print(currentchar);
                currentchar++;   
                
            }
            if(i==5){
                System.out.print('Z');
            }
            
            
            System.out.println();
        }
       
    }
}