package Bang_diem_thanh_phan_1;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SV sv[] = new SV[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            sv[i] = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(sv, (a, b)->{
            return a.ma.compareTo(b.ma);
        });
        for(int i=0; i<n; i++){
            System.out.printf("%d %s %s %s %.1f %.1f %.1f\n", i+1, sv[i].ma, sv[i].ten, sv[i].lop, sv[i].diem1, sv[i].diem2, sv[i].diem3);
        }
    }
}
