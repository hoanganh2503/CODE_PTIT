package Bang_diem_hoc_sinh;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int n = sc.nextInt();
        HS hs[] = new HS[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String ma = "HS" + df.format(i+1);
            hs[i] = new HS(ma, sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(),
                             sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), 
                             sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(hs, (a, b) -> {
            return a.diem.compareTo(b.diem) > 0 ? -1 : a.diem.compareTo(b.diem) == 0 ? a.ma.compareTo(b.ma) : 1;
        });
        for(int i = 0; i < n ; i++){
            System.out.printf("%s %s %s %s\n", hs[i].ma, hs[i].ten, hs[i].diem, hs[i].hk);
        }

    }
}
