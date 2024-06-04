import java.util.*;
public class Bien_so_dep {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            int arr[] = new int[5];
            arr[0] =  s.charAt(5)-'0';
            arr[1] =  s.charAt(6)-'0';
            arr[2] =  s.charAt(7)-'0';
            arr[3] =  s.charAt(9)-'0';
            arr[4] =  s.charAt(10)-'0';
            if(check(arr)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean check(int[] arr) {
        // check increasing
        boolean check_inc = true;
        for(int i = 1 ; i <= 4 ; i++){
            if(arr[i] - arr[i - 1] != 1)  check_inc = false;
        }
        if(check_inc) return true;

        // check equal
        boolean check_equal = true;
        for(int i = 1 ; i <= 4 ; i++){
            if(arr[i] != arr[i - 1])  check_equal = false;
        }
        if(check_equal) return true;

        // check 3-2
        if(arr[0] == arr[1] && arr[1] == arr[2] && arr[3] == arr[4]) return true;

        // check 6-8
        boolean check_68 = true;
        for(int i = 0 ; i <= 4 ; i++){
            if(arr[i] != 6 && arr[i] != 8)  check_68 = false;
        }
        if(check_68) return true;
        return false;
    }
}
