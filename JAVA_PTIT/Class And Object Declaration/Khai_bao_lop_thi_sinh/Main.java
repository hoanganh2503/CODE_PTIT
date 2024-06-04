package Khai_bao_lop_thi_sinh;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Thi_sinh A = new Thi_sinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        A.printCandidate();
    }
}
