package Examination.FOLDER.Cua_hang_quan_ao_thoi_trang;
import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SP sp[] = new SP[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            sp[i] = new SP(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        for(SP it:sp){
            System.out.printf("%s %s %s %.0f %.0f\n", it.getName(), it.getId(), it.getStt(),
                                                             it.getDiscount(), it.getTotal());
        }
    }
}
