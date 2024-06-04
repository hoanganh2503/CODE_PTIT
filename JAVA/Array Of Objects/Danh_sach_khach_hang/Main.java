package Danh_sach_khach_hang;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("000");
        int n = sc.nextInt();
        sc.nextLine();
        KH kh[] = new KH[n];
        for(int i = 0; i < n; i++){
            kh[i] = new KH("KH" + df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(kh, (a, b)->{
            return a.getYear().compareTo(b.getYear()) > 0 ? 1 : a.getYear().compareTo(b.getYear()) == 0 ? a.getMonth().compareTo(b.getMonth()) > 0 ? 1 : a.getMonth().compareTo(b.getMonth()) ==0 ? a.getDay().compareTo(b.getDay()): -1 : -1; 
        });
        for(KH it:kh){
            System.out.printf("%s %s %s %s %s\n",
            it.getId(), it.getName(), it.getGender(), it.getAddr(), it.getBirthday());
        }
    }
}
