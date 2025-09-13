import java.util.*;

public class MergeSortedArrays {
    public static int[] mergeArrays(int[] a, int[] b) {
        int m = a.length, n = b.length;
        int[] result = new int[m+n];
        int i=0, j=0, k=0;
        
        while (i<m && j<n) {
            if (a[i] < b[j]) result[k++] = a[i++];
            else result[k++] = b[j++];
        }
        while (i<m) result[k++] = a[i++];
        while (j<n) result[k++] = b[j++];
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();
        int[] a = new int[m];
        System.out.println("Enter first sorted array:");
        for (int i=0; i<m; i++) a[i] = sc.nextInt();
        
        System.out.print("Enter size of second array: ");
        int n = sc.nextInt();
        int[] b = new int[n];
        System.out.println("Enter second sorted array:");
        for (int i=0; i<n; i++) b[i] = sc.nextInt();
        
        int[] merged = mergeArrays(a, b);
        System.out.println("Merged Sorted Array: " + Arrays.toString(merged));
    }
}
