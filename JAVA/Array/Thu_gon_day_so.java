import java.util.*;
public class Thu_gon_day_so {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean[] check = new boolean[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            if(check[i]==false){
                if((arr[i]+arr[i+1])%2==0){
                    check[i] = true;
                    check[i+1] = true;
                    int a = i-1, b = i+2;
                    while(a >= 0 && check[a] == true) a--;
                    while(b < n && check[b] == true) b++;
                    while(a >=0 && b < n && check[a]==false && check[b]==false && (arr[a]+arr[b])%2==0){
                        check[a] = true;
                        check[b] = true;
                        a = a-1;
                        b = b+1;
                        while(a >= 0 && check[a] == true) a--;
                        while(b < n && check[b] == true) b++;
                    }
                }
            }
        }
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(check[i] == false) cnt++;
        }
        System.out.println(cnt);
    }
}
