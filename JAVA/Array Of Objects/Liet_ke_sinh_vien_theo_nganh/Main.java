package Liet_ke_sinh_vien_theo_nganh;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SV sv[] = new SV[n];
        for(int i = 0; i < n; i++){
            sv[i] = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        } 
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String lop = sc.nextLine();
            lop = lop.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + lop +":");            
            for(int i = 0; i < n ; i++) {
                if(lop.equals(sv[i].nganh))
                System.out.printf("%s %s %s %s\n", sv[i].ma, sv[i].ten, sv[i].lop, sv[i].email);
            }            
        }

    }
}
