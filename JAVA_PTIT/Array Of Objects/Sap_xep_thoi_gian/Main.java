package Sap_xep_thoi_gian;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Time1 times[] = new Time1[n];
        for(int i = 0; i < n ; i++){
            times[i] = new Time1(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(times, (a, b) -> {
            if(a.hour < b.hour) return -1;
            else if(a.hour == b.hour) {
                if(a.minute < b.minute) return -1;
                else if(a.minute == b.minute){
                    if(a.second < b.second) return -1;
                    else return 1;
                }
            }
            return 1;
        });

        for(int i = 0 ; i < n; i++) {
            System.out.println(times[i].hour + " " + times[i].minute + " " + times[i].second);
        }
    }
}
