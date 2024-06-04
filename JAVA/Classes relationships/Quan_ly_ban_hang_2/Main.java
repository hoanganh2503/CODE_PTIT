package Quan_ly_ban_hang_2;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df1 = new DecimalFormat("KH000");
        DecimalFormat df2 = new DecimalFormat("MH000");
        DecimalFormat df3 = new DecimalFormat("HD000");
        int a = sc.nextInt();
        sc.nextLine();
        KH kh1[] = new KH[a];
        for(int i = 0; i < a; i++) kh1[i] = new KH(df1.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        
        int b = sc.nextInt();
        MH mh1[] = new MH[b];
        for(int i = 0; i < b; i++){
            sc.nextLine();
            mh1[i] = new MH(df2.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        
        int t = sc.nextInt();
        KQ kq[] = new KQ[t];
        for(int i = 0 ; i < t ; i++){
            sc.nextLine();
            String maKH = sc.next().trim();
            String maHD = sc.next().trim();
            int sl = sc.nextInt();

            for(KH it1:kh1){
                if(it1.getMa().equals(maKH)){
                    for(MH it2:mh1){
                        if(it2.getMa().equals(maHD)){
                            double gia = (double)sl*(double)it2.getBan();
                            // System.out.printf("%s %s %s %s %s %d %d %d %.0f\n", df3.format(i+1), 
                            // it1.getTen(), it1.getDC(), it2.getTen(), it2.getDV(), it2.getMua(), it2.getBan(),
                            // sl, gia);
                            kq[i] = new KQ(df3.format(i+1), it1.getTen(), it1.getDC(), it2.getTen(), sl, sl*it2.getBan(), sl*(it2.getBan() - it2.getMua()));
                        }
                    }
                }
            }

        }
        Arrays.sort(kq);
        for(KQ it:kq) System.out.println(it);

    }
}
