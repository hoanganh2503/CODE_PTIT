package Tinh_gia_cuoc_dien_thoai_co_dinh_2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TT tt[] = new TT[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            tt[i] = new TT(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        int t = sc.nextInt();
        sc.nextLine();
        Cuoc cuoc[] = new Cuoc[t];
        int i = 0;
        while(t-->0){
            String sdt = sc.next();
            String vao = sc.next();
            String ra = sc.next();
            int phut = getMinutes(vao, ra);
            if(sdt.charAt(0) != '0'){
                // System.out.println(sdt + " Noi mang " + (int)(Math.ceil(phut/3.0)) + " " + (int)(Math.ceil(phut/3.0)*800));
                cuoc[i++] = new Cuoc(sdt, "Noi mang", (int)(Math.ceil(phut/3.0)), (int)(Math.ceil(phut/3.0)*800));
            }else{
                for(TT it:tt){
                    if(it.getMa().equals(sdt.substring(1, 3))){
                        // System.out.println(sdt + " " + it.getTen() + " " + phut + " " + it.getGia()*phut);
                        cuoc[i++] = new Cuoc(sdt, it.getTen(), phut, it.getGia()*phut);
                        break;
                    }
                }
            }
        }

        Arrays.sort(cuoc);

        for(Cuoc it:cuoc){
            System.out.println(it);
        }
    }

    public static int getMinutes(String s1, String s2) {
        String str1[] = s1.trim().split(":");
        String str2[] = s2.trim().split(":");
        return (Integer.parseInt(str2[0].trim())*60 + Integer.parseInt(str2[1].trim())) - (Integer.parseInt(str1[0].trim())*60 + Integer.parseInt(str1[1].trim()));
    }
}
