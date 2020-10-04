public class ArrayTest{
	public static void main(String[] args) {
		Array obj=new Array();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.pop();
		obj.resize();
	
		System.out.println("toString " +obj.toString());
		
		System.out.println("Size of the new Array is: " +obj.size());
		assert(obj.size()==4);
	
		System.out.println("All Test Passed");
		
	}
}