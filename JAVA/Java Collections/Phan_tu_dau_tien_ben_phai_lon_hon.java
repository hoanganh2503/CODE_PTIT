import java.util.*;

public class Phan_tu_dau_tien_ben_phai_lon_hon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Stack<Integer> stack = new Stack<Integer>();
            int n = sc.nextInt();
            int arr[] = new int[n], a[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = n-1; i >= 0; i--){
                while(!stack.empty() && arr[i] >= stack.peek()) stack.pop();
                    if(stack.empty()) a[i] = -1;
                    else a[i] = stack.peek();
                    stack.push(arr[i]);
            }
            for(int i = 0; i < n ; i++) System.out.print(a[i] + " ");
            System.out.println();
        }
    }

}
