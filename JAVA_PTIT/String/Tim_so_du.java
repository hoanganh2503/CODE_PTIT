import java.util.*;
public class Tim_so_du {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            s = "00"+s;
            int a = handle2(s);
            int b = handle3(s);
            int c = handle4(s);
            System.out.println((a+b+c+1)%5);
        }
    }

    static int handle2(String s){
        int a = Integer.parseInt(s.substring(s.length()-2, s.length()));
        switch(a%4){
            case 1: return 2;
            case 2: return 4;
            case 3: return 3;
        }
        return 1;
    }

    static int handle3(String s){
        int a = Integer.parseInt(s.substring(s.length()-2, s.length()));
        switch(a%4){
            case 1: return 3;
            case 2: return 4;
            case 3: return 2;
        }
        return 1;
    }

    static int handle4(String s){
        int a = s.charAt(s.length()-1) -'0';
        if(a%2==1) return 4;
        return 1;
    }
}
