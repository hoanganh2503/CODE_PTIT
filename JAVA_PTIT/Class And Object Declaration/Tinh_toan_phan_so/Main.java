package Tinh_toan_phan_so;

import java.util.Scanner;

public class Main {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            PS A = new PS(sc.nextLong(), sc.nextLong());
            PS P = new PS(A.getTS(), A.getMS());
            PS B = new PS(sc.nextLong(), sc.nextLong());
            PS C = new PS();
            PS D = new PS();
            P.Plus(B);       
            long x = P.UCLN(P.getTS(), P.getMS());
            C.setTS((P.getTS()/x)*(P.getTS()/x)); 
            C.setMS((P.getMS()/x)*(P.getMS()/x)); 
            System.out.print(C.printAnser(1) + " "); 
            D.setTS(A.getTS()*B.getTS()*C.getTS());                          
            D.setMS(A.getMS()*B.getMS()*C.getMS());
            long y = D.UCLN(D.getTS(), D.getMS());
            System.out.println(D.printAnser(y)); 
       }   
   
    }
}
