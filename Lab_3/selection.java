import java.util.Scanner;
public class selection{

	public static int[] sort(int[] array){
		array=array;
		for (int i=0;i<=array.length-1 ; i++ ) {
			for (int j=i+1;j<array.length; j++ ) {
				if (array[j]<array[i]) {
					swap(i,j , array);
				}
				
			}
			
		}
		return array;
	}

	public static void swap(int a, int b, int[] array){
		int x=array[a];
		array[a]=array[b];
		array[b]=x;

	}



	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("The size of array: ");
		int length=obj.nextInt();
		int[] arr=new int[length];
		System.out.println("The size of the array is: " + length);

		System.out.println("Enter the values: ");
		for (int i=0; i<length ;i++ ) {
			int a=obj.nextInt();
			arr[i]=a;

		 
		 	
		 }
		 System.out.print("The unsorted array: ");
		 for (int j=0;j<length ;j++ ) {
		 	System.out.print(arr[j] + " ");
			
		}
		System.out.println(" ");
		System.out.print("The sorted array: ");
		selection obj1=new selection();
			int[] x=obj1.sort(arr);
		for (int i=0; i<length ;i++ ) {
			System.out.print(x[i]+ " ");
		}
	}
}