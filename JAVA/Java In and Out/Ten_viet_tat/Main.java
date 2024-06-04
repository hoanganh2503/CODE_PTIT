package Ten_viet_tat;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        Name name[] = new Name[n];
        for(int i = 0; i < n; i++){
            name[i] = new Name(sc.nextLine());
        }

        Arrays.sort(name, (a, b)->{
            return a.getTen().compareTo(b.getTen()) > 0 ? 1 : a.getTen().equals(b.getTen()) ? a.getHo().compareTo(b.getHo()) : -1;
        });

        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s = sc.nextLine();
            for(Name it : name){
                if(it.getSet().contains(s))
                    System.out.println(it.getName());
            }
        }


    }
}
