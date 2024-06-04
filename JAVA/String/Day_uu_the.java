import java.util.*;
public class Day_uu_the {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String arr[] = s.split(" ");
            checkStr(arr);
        }
    }
    static void checkStr(String[] arr){
        int n = arr.length;
        int chan = 0, le = 0;
        for(int i = 0; i < n; i++){
            if(Integer.parseInt(arr[i]) % 2 == 0) chan++;
            else le++;
        }
        if((n % 2 == 0 && chan > le) || (n % 2 == 1 && chan < le)){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
