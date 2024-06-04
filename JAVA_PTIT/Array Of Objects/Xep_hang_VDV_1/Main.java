package Xep_hang_VDV_1;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int n = sc.nextInt();
        int arr[] = new int[n];
        VDV vdv[] = new VDV[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            vdv[i] = new VDV("VDV" + df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr[i] = vdv[i].thanhtich;
        }
        Arrays.sort(arr);
        for(int i = 0 ; i < n ; i++){
            int dem = 0;
            for(int j = 0 ; j < n ; j++){
                if(arr[i] == vdv[j].thanhtich){
                    dem +=1;
                    vdv[j].rank = i+1;
                } 
            }
            i+=dem-1;
        }

        for (int i = 0 ; i < n ; i++){
            System.out.printf("%s %s %s %s %s %d\n", vdv[i].ma, vdv[i].ten, vdv[i].tttt, vdv[i].uu_tien, vdv[i].kq, vdv[i].rank);
        }
    }
}
