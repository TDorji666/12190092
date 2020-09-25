public class LinkedListTest{
	public static void main(String[] args) {
		LinkedList obj1 = new LinkedList();


		obj1.addFirst(101);
		obj1.addLast(102);
		obj1.addLast(103);

		// System.out.println(obj1.size());
		assert(obj1.isEmpty() == false);
		assert(obj1.size() == 3);
		assert(obj1.first() == 101);
		assert(obj1.last() == 103);
		assert(obj1.removeFirst() == 101);
		assert(obj1.size() == 2);
		assert(obj1.first() == 102);
		System.out.println("All Test Cases Passed");
	}
}