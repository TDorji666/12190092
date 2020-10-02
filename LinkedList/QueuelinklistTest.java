public class QueuelinklistTest{
	public static void main(String[] args) {
		Queuelinklist obj = new Queuelinklist();
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);

		assert(obj.size()==3);
		assert(obj.isEmpty()==false);
		assert(obj.first()==1);
		assert(obj.dequeue()==1);
		System.out.println("All Testcases are passed");


	}
}