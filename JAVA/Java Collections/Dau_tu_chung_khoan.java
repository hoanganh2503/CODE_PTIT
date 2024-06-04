import java.util.*;
public class Dau_tu_chung_khoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n], a[] = new int[n];
            Stack<Integer> st = new Stack<Integer>();
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            for(int i = 0; i < n; i++){
                while(!st.empty() && arr[i] >= arr[st.peek()]) st.pop();
                if(st.isEmpty()) a[i] = -1;
                else a[i] = st.peek();
                st.add(i);
            }
            for(int i = 0; i < n; i++){
                 System.out.print(i - a[i] + " ");
                // System.out.println(a[i]);
            }
            System.out.println();
        }
    }
}
