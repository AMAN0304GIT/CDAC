import java.util.Queue;

class queue {
int size = 5; 
int Q[] = new int[size];
int front , rear;

queue(){
    front  = -1;
    rear = -1;
}

boolean isEmpty(){
    return(front == -1);   // should check front instead of rear
}

boolean isFull(){
    return (rear == size-1);
}

// insertion --> enqueue operation
void enqueue(int x){
    if(isFull()){
        System.out.println("Queue is full !");
    }
    else{ // checks if first element in being inserted in the queue
        if(front == -1){
            front = 0; // set front to 0 if queue is empty
        }
        rear++; // rear ko age bhadaya
        Q[rear] = x;  // x ko insert kia
        System.out.println(x + " Inserted");
    }
}


// deletion --> dequeue operation
int dequeue(){
    if(isEmpty()){
        System.out.println("Queue is empty !");
        return -1;
    }
    else{
        int x = Q[front];
        System.out.println(x + " Deleted");
        if(front > rear){  // this means queue is empty  
            front  = -1;   //resetting the front and rear
            rear = -1;
        }
        else{
            front++;
        }
        return x;
    }
}

void display(){
    if(isEmpty()){
        System.out.println("Empty queue ");
    }
    else{
        System.out.println("Queue elements : ");
        for(int i = front; i<= rear; i++){
            System.out.print(Q[i]+ " ");
        } 
    }
    System.out.println();
}


    public static void main(String[] args) {
        queue q1 = new queue();
        q1.enqueue(11);
        q1.enqueue(12);
        q1.enqueue(13);
        q1.enqueue(14);
        
        q1.display();

        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.display();

        q1.dequeue();
        q1.display();



        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        
    }
}
