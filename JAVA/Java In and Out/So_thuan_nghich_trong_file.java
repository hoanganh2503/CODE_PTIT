import java.io.*;
import java.util.*;
public class So_thuan_nghich_trong_file {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> list1 = (ArrayList<Integer>) sc1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) sc2.readObject();

        Set<Integer> set1 = new TreeSet<>(list1);
        Set<Integer> set2 = new TreeSet<>(list2);

        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int it:set1){
            if(set2.contains(it) && check(it)) ans.add(it);
            if(ans.size() == 10) break;
        }

        for (int it : ans)
        System.out.println(it + " " + (Collections.frequency(list1, it) + Collections.frequency(list2, it)));

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
