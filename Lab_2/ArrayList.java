public class ArrayList{
		int size=0;
		int max=10;
		int top;
		int arr[]=new int[max];


	public void push(int e){
		if (top>max) {
			System.out.println("Stackoverflow");
			
		}
		else{
			arr[++top]=e;
			System.out.println("The value is: " +e);
		}
		size +=1;	
	}
	public void pop(){
		if (top==0) {
			System.out.println("Stackunderflow");
		}
		else{
			int e=arr[top--];
			System.out.println("The popped digit is: " +e);
		}
		size=size-1;
	}
	public boolean isEmpty(){
		if (size==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public int size(){
		return size;
	}
	public int top(){

		if (top<0) {
			return 0;
		}
		else{

			int e=arr[top];
			return e;

		}
	}
	public static void main(String[] args) {
		ArrayList obj=new ArrayList();

			obj.push(4);
			obj.push(3);
			obj.push(7);
			obj.push(50);
			obj.pop();
		

			System.out.println("The top value is " + obj.top());
			System.out.println("The size is after pop is: " + obj.size());
			System.out.println("Is it empty(True or False): " +obj.isEmpty());

	}

}
		
	
	
