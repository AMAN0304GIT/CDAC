import java.util.Scanner;

public class array1 {

    static int search(int arr[], int size , int key){
        for(int i = 0; i<size; i++){
            if(key == arr[i]){
                return i;
            }
        }
        return -1;

    }
    static int delete(int arr[], int size, int key)
	{
		int pos = search(arr,size,key);
		if(pos == -1)
		{
			System.out.println("Not found");
			return size;
		}
		//element is present then shift remaining elements
		for(int i=pos;i<size-1;i++)
		{
			arr[i] = arr[i+1];
		}
			
		return size-1;
	}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1[]  = new int[100]; //capacity
        int size = 10;


        // insertion    
        System.out.println("Enter the array elements : ");
        for(int i = 0; i<size; i++){
            a1[i]= sc.nextInt();
        }

        // display elements
        System.out.println("Elements of the array are : ");
        for(int i = 0; i<size; i++){
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        // searching
        System.out.println("Enter the element you want to search in array : ");
        int key = sc.nextInt();

        int pos = search(a1, size, key);
        if(pos != -1){
            System.out.println("Element present ");
        }
        else{
            System.out.println("Element not found");
        }

        //deleting 

        System.out.println("Enter the key you want to delete " );
        int key2 = sc.nextInt();
        size = delete(a1, size, key);
        for(int i=0;i<size;i++)
		{
			System.out.print(a1[i]+ " ");
		}
		System.out.println();
    }
}
