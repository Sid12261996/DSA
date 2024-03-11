import java.util.Scanner;

public class Bfrog2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Min: " + frogJump(arr, k));
    }

    // 10 20 10
    private static int frogJump(int[] arr, int k) {
        int[] dp = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= k && j <= i; j++) {
                min = Math.min(min, dp[i - j] + Math.abs(arr[i] - arr[i - j]));
            }
            dp[i] = min;
        }
        return dp[arr.length - 1];
    }
}
