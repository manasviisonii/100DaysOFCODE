import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt(); 

        int count = 0;

        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) != 0) {
                count++;
            }
        }

        System.out.println("Hamming weight of " + n + " is: " + count);


    }
}
