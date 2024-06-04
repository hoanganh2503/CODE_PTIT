package Lop_hoc_phan_1;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HP hp[] = new HP[n];
        for(int i = 0; i < n; i++){
            hp[i] = new HP(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(hp, (a, b)->{
            return a.getGroup().compareTo(b.getGroup());
        });
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < m; i++){
            String ma = sc.nextLine();
            String ten = "";
            for(int j = 0; j < n; j++){
                if(ma.equals(hp[j].getId()))
                    ten = hp[j].getName();
            }
            System.out.println("Danh sach nhom lop mon " + ten + ":");
            for(int j = 0; j < n; j++){
                if(ma.equals(hp[j].getId())){
                    System.out.printf("%s %s\n", hp[j].getGroup(), hp[j].getTeacherName());
                }

            }
        }
    }
    
}
