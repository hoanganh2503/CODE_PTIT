import java.util.*;
import java.io.*;
public class Bt1 {
    public static void main(String[] args) throws IOException , ClassNotFoundException{
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) sc1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) sc2.readObject();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        Set<Integer> set = new TreeSet<>();
        for(int it:list1){
            set.add(it);
            list3.add(it);
        }
        for(int it:list2){
            set.add(it);
            list3.add(it);
        }
        int cnt = 0;
        for(int it:set){
            if(list1.contains(it) && list2.contains(it) && check(it)){
                System.out.println(it + " " + Collections.frequency(list3, it));
                cnt++;
            }
            if(cnt == 10) break;
        }
        // int str = 1357531;
        // System.out.println(check(str));
    }

    public static boolean check(int n){
        if(n < 10) return false;
        String str = String.valueOf(n);
        int m = str.length();
        if(str.length() % 2 == 0) return false;
        for(int i = 0 ; i <= m/2 ; i++){
            if((str.charAt(i) - '0') %2 == 0) return false;
            if(str.charAt(i) != str.charAt(m-i-1)) return false;
        }
        return true;
    }
}
