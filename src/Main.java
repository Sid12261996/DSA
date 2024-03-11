import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n + 1];
        arr[0] = scn.nextInt();

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + scn.nextInt();
        }
        
        int noOfQueries = scn.nextInt();

        for (int i = 0; i < noOfQueries; i++) {
            int l_r = scn.nextInt();
            int r = scn.nextInt();
            int l = l_r - 1;
            if (l_r == 0)
                System.out.println(arr[r]);
            else
                System.out.println(arr[r] - arr[l]);
        }
    }
}