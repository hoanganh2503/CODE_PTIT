package Thoi_gian_online_lien_tuc;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = sc.nextInt();
        sc.nextLine();
        DS ds[] = new DS[n];
        for(int i=0; i<n; i++){
            ds[i] = new DS(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(ds);
        for(DS it:ds) System.out.println(it);
    }
}
