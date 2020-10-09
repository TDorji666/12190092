import java.util.Scanner;
public class insertion{

	public static int[] inserting(int[] array){
		array=array;
		for (int i=1; i<array.length  ;i++ ) {
			for (int j=i;j>0 && compare( j,  j-1,  array) ;j-- ) {
				swap(j, j-1, array);
				
			}
			
		}
		return array;

	}

	public static boolean compare(int a, int b, int[] array){
		if (array[b]>array[a]) {
			return true;
			
		}
		return false;

	}
	public static void swap(int a, int b, int[] array)
	{
		int x=array[a];
		array[a]=array[b];
		array[b]=x;
	}



	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int length=obj.nextInt();
		int[] arr= new int[length];
		System.out.println("The size of the array is: " + length);

		System.out.println("Enter the values: ");
		for (int i=0;i<length ; i++ ) {
			int a=obj.nextInt();
			arr[i]=a;			
		}
		System.out.print("The unsorted array is : " );
		for (int j=0;j<length ;j++ ) {
			System.out.print(arr[j]+ " ");
		}
		System.out.println(" ");
		

		System.out.print("Sorted array: ");
		insertion obj1=new insertion();
		int[] x=obj1.inserting(arr);
		for (int i=0; i<length ;i++ ) {
			System.out.print(x[i]+ " ");
		}


	}
}