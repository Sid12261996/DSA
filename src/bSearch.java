import java.util.Scanner;

public class bSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int t = scanner.nextInt();
        System.out.println(binarySearch(arr, t, 0, n));
    }

    private static int binarySearch(int[] nums, int target, int lo, int hi) {
        if (hi < lo) return -1;
        int mid = Math.min((hi / 2) + lo, hi);

        if (nums[mid] == target) return mid;
        else if (nums[mid] < target) return binarySearch(nums, target, lo, mid - 1);
        else return binarySearch(nums, target, mid + 1, hi);
    }
}
