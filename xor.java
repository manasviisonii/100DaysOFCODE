public class xor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 4, 1, 5, 5, 6};
        int xor = 0;

        for (int num : arr) {
            xor ^= num; // XOR all elements
        }

        System.out.println("The number without a pair is: " + xor);
    }
}
