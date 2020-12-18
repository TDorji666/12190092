public class BinarySTTest{
	public static void main(String[] args) {
		BinaryST <String, Integer> obj=new BinaryST <String,Integer>();
		obj.put("Ada" ,1);
		obj.put("Ballerina", 3);
		System.out.println(obj.get("Ada"));
		obj.put("HTML", 5);
		obj.put("Java", 7);
		System.out.println(obj.get("Java"));
		System.out.println(obj.size());
		System.out.println(obj.min());
		System.out.println(obj.floor("Ballerina"));
		obj.select(3);
		System.out.println(obj.keys("Ada","Java"));
		obj.put("Java", 8);
		obj.put("Dart", 9);
		System.out.println(obj.get("Java"));
		System.out.println(obj.size());
		// System.out.println(obj.delete(Min));
		System.out.println(obj.keys("Ballerina", "Java"));
		// obj.delete("Java");
		
		}
}


























