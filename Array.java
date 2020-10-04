public class Array
{
	double newLength1 = 0.25;
	double newLength2 = 0.75;
	int capacity = 4;
	static int x;

	int remove;
	int top = 0;
	static double length;
	static int Arr[];
	public Array()
	{
		Arr = new int[capacity];
	}
	public void add(int e)
	{
		Arr[top] = e;
		top++;
	}
	public void pop()
	{
		top--;
		remove = Arr[top];
		Arr[top] = 0;
		int count = 0;
		for(int i = 0; i < Arr[i]; i++) {
			count++;
		}
		x = count;
		length = (double)x/capacity;
		System.out.println("The removed digit is: " +remove);
		System.out.println("Size of the new array is: " + x);
	}
	public void resize()
	{
		if(length == newLength1 ) {
			int newArray[] = new int[(capacity/2)*2];
			for(int i = 0; i < Arr.length; i++) {
				newArray[i] = Arr[i];
			}
			Arr = newArray;
			capacity = capacity/2;
			for(int n : newArray) {
				System.out.print(n + " ");
				}	
		}
		else if(length == newLength2) {
			int newArray[] = new int[capacity*2];
			for(int i = 0; i < Arr.length; i++) {
				newArray[i] = Arr[i];
			}
			capacity = capacity * 2;
			Arr = newArray;
			for(int j : newArray) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("Error");
		}
	}
	public int size()
	{
		return capacity;
	}
	public String toString()
	{
		String s = Integer.toString(capacity);
		return s;
	}
	
}