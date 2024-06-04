package Xep_hang_hoc_sinh;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int n = sc.nextInt();
        double arr[] = new double[n];
        double a[] = new double[n+1];
        HS hs[] = new HS[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            double diem = sc.nextDouble();
            arr[i] = diem;
            hs[i] = new HS("HS" + df.format(i+1), ten, diem);
        }
        Arrays.sort(arr);
        int k = 1;
        for (int i = n-1; i >=0 ; i--) {
            a[k++] = arr[i];
        }
        for(int i = 0 ; i < n ; i++){
            int dem = 0;
            for(int j = 0 ; j < n ; j++){
                if(a[i+1] == hs[j].diem){
                    dem +=1;
                    hs[j].rank = i+1;
                } 
            }
            i+=dem-1;
        }

        for(int i = 0; i < n; i++){
            System.out.printf("%s %s %.1f %s %.0f\n", hs[i].ma, hs[i].ten, hs[i].diem, hs[i].hk, hs[i].rank);
        }
    }
}
