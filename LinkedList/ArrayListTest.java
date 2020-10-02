public class ArrayListTest
{
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.push(10);
		obj.push(20);

		assert(obj.size()==1);
		assert(obj.isEmpty()==false);
		assert(obj.top()==2);
		assert(obj.pop()==2);
		System.out.println("All TextCases are Passed");
	}
}