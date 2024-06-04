import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class So_0_va_so_9 {
    public static void show(Queue<Long> q) {
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.poll();
        }
        System.out.println();
    }

    public static void handle(int n) {
        Queue<Long> q = new LinkedList<>();
        q.add(9L);
        if (9 % n == 0) {
            System.out.println(9);
            return;
        }
        while (true) {
            long top = q.peek();
            q.poll();

            if ((10 * top + 0) % n == 0) {
                System.out.println(10 * top + 0);
                break;
            } else {
                q.add(10 * top);
            }

            if ((10 * top + 9) % n == 0) {
                System.out.println(10 * top + 9);
                break;
            } else {
                q.add(10 * top + 9);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 1;
        t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            handle(n);
        }
    }
}