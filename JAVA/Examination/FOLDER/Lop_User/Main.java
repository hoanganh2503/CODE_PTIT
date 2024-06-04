package Examination.FOLDER.Lop_User;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        User user[] = new User[n];
        for (int i = 0; i < n; i++) {
            user[i] = new User(sc.nextLine());
        }

        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s = sc.nextLine();
            for(int i = 0; i < n; i++) {
                if(s.trim().equals(user[i].getFull())) 
                    user[i].setTotal();
            }
        }

        for(User it:user) System.out.printf("%d ", it.getTotal());

    }
}
// 4
// tendangnhap matkhau
// username password
// nguoidung m4tm4rmm4f
// user2 password
// 6
// tendangnhap matkhau
// username matkhau
// b34f constest
// username password
// tendangnhap matkhau
// user2 password