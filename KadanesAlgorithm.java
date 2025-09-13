import java.util.*;

public class KadanesAlgorithm {
    public static int maxSubArraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (currentSum + arr[i] > arr[i])
                currentSum = currentSum + arr[i];
            else
                currentSum = arr[i];

            if (currentSum > maxSoFar)
                maxSoFar = currentSum;
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(arr));
    }
}
