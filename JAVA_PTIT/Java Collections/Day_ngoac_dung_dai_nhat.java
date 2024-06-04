import java.util.Scanner;
import java.util.Stack;

public class Day_ngoac_dung_dai_nhat {
    public static void show(Stack<Character> st) {
        Stack<Character> st2 = new Stack<>();
        st2.addAll(st);
        while (!st2.empty()) {
            System.out.print(st2.peek());
            st2.pop();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int ans = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    st.push(i);
                } else {
                    st.pop();
                    if (st.size() > 0) {
                        ans = Math.max(ans, i - st.peek());
                    }
                    if (st.size() == 0) {
                        st.push(i);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}