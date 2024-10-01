class DQueue{
	
	int size = 5;
	int DQ[] = new int[size];
	int front , rear;
	
	DQueue(){
		front = -1;
		rear = 0;
	}
	boolean isEmpty(){
		return(front == -1);
	}
	
	boolean isFull(){
		return((front == 0 && rear == size-1) || front == rear+1);
	}
	
	void insertFront(int key){
		if(isFull()){
			System.out.println("Overflow");
			return;
		}
		
		// if queue is initailly empty
		if(front== -1){
			front = 0;
			rear = 0;
		}
		
		else if(front == 0)
			front = size-1;
		
		else
			front = front - 1;

		DQ[front] = key;
	}
	
	void insertRear(int key){
		if(isFull()){
			System.out.println("Overflow");
			return;
		}
		
		if(front == -1){
			front = 0;
			rear = 0;
		}
		
		else if(rear == size-1)
			rear = 0;
		else
			rear = rear+1;
		
		DQ[rear] = key;
	}
	
	void deletefront() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        // Deque has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1)
            front = 0;

        else
            front = front + 1;
    }

    void deleterear() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }

        // Deque has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0)
            rear = size - 1;

        else
            rear = rear - 1;
    }

    int getFront() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        return DQ[front];
    }

    int getRear() {
        if (isEmpty() || rear < 0) {
            System.out.println("Underflow");
            return -1;
        }
        return DQ[rear];
    }
	
	
	public static void main(String args[]){
		
		DQueue DQ = new DQueue();
		System.out.println("Insert at rear end: 12");
        DQ.insertRear(12);

        System.out.println("Insert at rear end: 14");
        DQ.insertRear(14);

        System.out.println("Get rear element: " + DQ.getRear());

        DQ.deleterear();
        System.out.println("After delete rear element new rear becomes: " + DQ.getRear());

        System.out.println("Inserting element at front end");
        DQ.insertFront(13);

        System.out.println("Get front element: " + DQ.getFront());

        DQ.deletefront();
        System.out.println("After delete front element new front becomes: " + DQ.getFront());
		
	}
}