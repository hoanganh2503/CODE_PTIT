import java.util.*;
public class So_la_ma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            s+=" ";
            int ans = 0;
            for(int i=0;i<s.length()-1;i++){
                switch(s.charAt(i)){
                    case 'M':
                        ans += 1000;
                        break;
                    case 'D':
                        ans += 500;
                        break;
                    case 'C':
                        if(s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M') ans -= 100;
                        else ans += 100;
                        break;
                    case 'L':
                        ans += 50;
                        break;
                    case 'X':
                        if(s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C') ans -= 10;
                        else ans += 10;
                        break;
                    case 'V':
                        ans += 5;
                        break;
                    case 'I':
                        if(s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X') ans -= 1;
                        else ans += 1;
                        break;  
                }
            }
            System.out.println(ans);
        }
    }
}
