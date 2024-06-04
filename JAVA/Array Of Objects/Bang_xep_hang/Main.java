package Bang_xep_hang;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SV sv[] = new SV[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            sv[i] = new SV(sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(sv, (a, b) ->{
            return a.dung > b.dung ? -1 : a.dung == b.dung ? a.nop-b.nop != 0 ? a.nop-b.nop : a.ten.compareTo(b.ten) : 1;
        });
        for(int i = 0; i < n ; i++) {
            System.out.printf("%s %d %d\n", sv[i].ten, sv[i].dung, sv[i].nop);
        }
    }
}
