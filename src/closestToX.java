import java.util.Scanner;

public class closestToX {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 7, 8, 8, 10, 12, 12, 66, 98, 98, 98, 343, 1223, 1223, 1223};
        int target = 1223;
        int closest = closestToX(arr, target);
        System.out.println("closest number is :" + closest);
    }

    private static int closestToX(int[] nums, int target) {
        int hi = nums.length - 1;
        int lo = 0;
        int lastOcc = 0;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == target) lastOcc = mid;
            if (nums[mid] <= target) lo = mid + 1;
            else hi = mid - 1;
        }
        return lastOcc < nums.length - 1 ? lastOcc + 1 : nums.length - 1;
    }
}
