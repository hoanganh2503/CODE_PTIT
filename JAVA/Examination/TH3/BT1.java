package TH3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BT1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        while(t-->0){
            int n = in.nextInt();
            Set<Long> chan = new TreeSet<>();
            Set<Long> le = new TreeSet<>();
            for(int i = 0;i < n;i++){
                long x = in.nextLong();
                if(x % 2==0){
                    chan.add(x);
                }else{
                    le.add(x);
                }
            }
            ArrayList<Long> rele = new ArrayList<>(le);
            for(long it:chan){
                System.out.print(it+" ");
            }
            System.out.println();
            for(int i = rele.size()-1 ; i >= 0;i--){
                System.out.print(rele.get(i) + " ");
            }
            System.out.println();
        }
    }
}
