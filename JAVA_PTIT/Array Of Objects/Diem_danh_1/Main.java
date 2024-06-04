package Diem_danh_1;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DD dd[] = new DD[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            dd[i] = new DD(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        for(int i = 0; i < n; i++){
            String ma = sc.next();
            String diemdanh = sc.next();
            for(int j = 0; j < n; j++){
                if(ma.equals(dd[j].ma)){
                    int m = 0, v = 0;
                    for(int k = 0; k < 10; k++){
                        if(diemdanh.charAt(k) == 'm') m ++;
                        if(diemdanh.charAt(k) == 'v') v ++;
                    }
                    dd[j].diem_danh = 10 - m - 2*v > 0 ? 10-m-2*v : 0;
                    if(dd[j].diem_danh == 0) dd[j].xl = "KDDK";
                    else dd[j].xl ="";
                }
            }
        }
        for(DD it : dd){
            System.out.printf("%s %s %s %d %s\n", it.ma, it.ten, it.lop, it.diem_danh, it.xl);
        }
    }
}
