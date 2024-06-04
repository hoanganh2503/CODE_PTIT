import java.util.Scanner;
import java.util.Stack;

public class Kiem_tra_day_ngoac_dung {
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
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Stack<Character> st = new Stack<>();
            boolean ok = true;
            if (s.length() % 2 == 1) {
                System.out.println("NO");
            } else {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                        st.push(s.charAt(i));
                    } else if (s.charAt(i) == ']') {
                        if (st.size() == 0) {
                            ok = false;
                        } else if (st.peek() == '[') {
                            st.pop();
                        }
                    } else if (s.charAt(i) == '}') {
                        if (st.size() == 0) {
                            ok = false;
                        } else if (st.peek() == '{') {
                            st.pop();
                        }
                    } else if (s.charAt(i) == ')') {
                        if (st.size() == 0) {
                            ok = false;
                        } else if (st.peek() == '(') {
                            st.pop();
                        }
                    }

                    if (!ok) {
                        break;
                    }
                }
                if (st.size() > 0) {
                    ok = false;
                }
                if (ok) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}