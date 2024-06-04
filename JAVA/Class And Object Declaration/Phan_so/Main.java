package Phan_so;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PS A = new PS(sc.nextLong(), sc.nextLong());
        long a = A.UCLN(A.getTS(), A.getMS());
        System.out.println(A.printAnser(a));
    }
}
