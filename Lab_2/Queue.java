public class Queue{
	int e;
	int arr[];
	int front;
	int rear;
	int size;
	public Queue(int e){
		arr=new int[e];
		size=0;
	}

	
public int len(){
	return size;
}
public boolean isEmpty(){
	if (size==0) {
		return true;
		
	}
	else{
		return false;
	}
} 

public void enqueue(int e){
	if (isEmpty()) {
		arr[0]=e;

	}
	else
	{
		arr[rear+1]=e;
		rear++;
		System.out.println("The enqueued digit is :"+e);
	}
size=size+1;

}
public int first(){
	if (isEmpty()) {
		return 0;
	}
	else{
		return arr[front+1];

	}
}
public int dequeue(){
	if (isEmpty()) {
		return 0;
			
	}
	else{
			
			
			size=size-1;

	
	return arr[front];
}
	



}
public static void main(String[] args) {
	Queue obj=new Queue(4);
	obj.enqueue(6);
	obj.enqueue(7); 
	obj.enqueue(8);
	obj.enqueue(29);
	obj.dequeue();
	System.out.println("The length of the queue is: " + obj.len());
	System.out.println("Empty(true or false): " +obj.isEmpty());
	System.out.println("The dequeued value is: "+obj.dequeue());
	System.out.println("The Front is: " + obj.first());

}

}

