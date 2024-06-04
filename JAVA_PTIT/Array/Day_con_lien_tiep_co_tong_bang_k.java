import java.util.HashMap;
import java.util.Scanner;

public class Day_con_lien_tiep_co_tong_bang_k {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            long[] arr = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = scanner.nextLong();
            }
            if (handle(arr, n, k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean handle(long[] arr, int n, long k) {
        HashMap<Long, Integer> map = new HashMap<>();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += arr[i];
            if (sum == k || map.containsKey(sum - k)) {
                return true;
            }
            map.put(sum, 1);
        }
        return false;
    }
}