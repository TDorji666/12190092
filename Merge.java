public class Merge {

    
    private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k]; 
        }

       
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if(i > mid){
                a[k] = aux[j++];
            }              
            else if(j > hi) {
                a[k] = aux[i++];
            }                
            else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            }
            else {
                a[k] = aux[i++];
            }
        }
    }

    
    private static void sort(int[] a, int[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = (lo + hi) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);

    }

    
    public static void sort(int[] a) {
        int[] aux = new int[a.length];
        int lo = 0;
        int hi = a.length - 1;

        sort(a,aux,lo,hi);
    }


  
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
        

    private static boolean isSorted(int[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    private static boolean isSorted(int[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) {
                return false;
            }
        return true;
    }

  
    private static void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }

    
    public static void main(String[] args) {
        int[] a = {12,21,1,43,23,0,4,2,7};
        System.out.println("Before Sorting: " );
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        Merge.sort(a);

         System.out.println("");
        System.out.println("ELEMENTS AFTER SORTING: ");
        show(a);
         System.out.print(" ");
    }
}