import java.util.*;
public class So_loc_phat {

    public static Stack<String> q = new Stack<String>();
    public static int ans[] = new int[20];
    public static int count = 0, n;

    public static void Jprint(){
        String s = "";
        for(int i = 1 ; i <= n ; i++){
            if(ans[i] == 0) s+= 6;
            else s+=8;
        };
        q.add(s);
    }

    public static void handle(int i){
        for(int j = 0; j <= 1 ; j++){
            ans[i] = j ;
            if(i == n){
               Jprint();
               count ++; 
            } 
            else handle(i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while(t-->0){
            q.clear();
            for(int i = 0 ; i < 20 ; i++) ans[i] = 0;
            count = 0;
            int m = sc.nextInt();
            for(int k = 1 ; k <= m; k++){
                n = k;
                handle(1);
            }
            System.out.println(count);
            while(!q.isEmpty()){
                System.out.printf(q.peek() + " ");
                q.pop();
            }
         System.out.println();   
       }   
    }
}
