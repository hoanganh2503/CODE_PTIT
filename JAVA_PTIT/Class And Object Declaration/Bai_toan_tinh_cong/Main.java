package Bai_toan_tinh_cong;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int day_salary = sc.nextInt(), day_working = sc.nextInt();
        sc.nextLine();
        NV A = new NV(name, day_salary, day_working, sc.nextLine());
        A.printInfo();
    }
}
