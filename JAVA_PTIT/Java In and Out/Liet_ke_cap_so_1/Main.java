package Liet_ke_cap_so_1;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> list = (ArrayList<Pair>) sc.readObject();
        Set<String> set = new HashSet<String>();
        Collections.sort(list);
        for (Pair it : list) {
            if(it.getFirst() >= it.getSecond()) continue;
            String str = "(" + it.getFirst() + ", " +it.getSecond() + ")";
            if(set.contains(str)) continue;
            set.add(str);
            System.out.println(str);

        }
    }

}
