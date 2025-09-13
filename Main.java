import java.util.*;

class Solution {
    public void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // create Solution object and sort
        Solution sol = new Solution();
        sol.sort012(arr);

        // print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
