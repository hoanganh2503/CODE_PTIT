package Tinh_tien;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DM dm[] = new DM[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            dm[i] = new DM(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(dm, (a, b)->{
            return (int)(b.getTong()-a.getTong());
        });
        for(DM it:dm){
            System.out.printf("%s %s %.0f %.0f %.0f %.0f\n", it.getMa(), it.getTen(), it.getSLMua(), it.getDonGia(), it.getCK(), it.getTong());
        }
    }
}
