import java.util.*;
public class Ma_tran_nhi_phan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            int cnt = 0;
            for(int j = 1 ; j <= 3 ; j++){
                int x = sc.nextInt();
                if(x==1) cnt++;;
            }
            if(cnt > 3-cnt) sum++;
        }
                    System.out.println(sum);
    }
}
