package Danh_sach_mat_hang;
import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product arr[] = new Product[n];
        DecimalFormat decimalFormat = new DecimalFormat("000");
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String formattedNumber = decimalFormat.format(i+1);
            arr[i] = new Product("MH" + formattedNumber, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(arr, (a, b)->{
            if(a.lai < b.lai) return 1;
            else if(a.lai == b.lai){
                return a.ma.compareTo(b.ma);
            }
            return -1;
        });

        for(int i = 0; i < n ; i++){
            System.out.printf("%s %s %s %d %d %d\n", arr[i].ma,
            arr[i].ten, arr[i].donvi, arr[i].giamua, arr[i].giaban, arr[i].lai);
        }
    }
}
