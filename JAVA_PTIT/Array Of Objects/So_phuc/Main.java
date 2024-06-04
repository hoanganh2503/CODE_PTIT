package So_phuc;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Phuc A = new Phuc(sc.nextInt(), sc.nextInt());
            Phuc B = new Phuc(sc.nextInt(), sc.nextInt());
            A.ans1(B);
            A.ans2(B);
       }
    }
}
