import java.util.*;
import java.io.*;
public class So_dep_1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = new ArrayList<>((ArrayList) sc1.readObject());
        ArrayList<Integer> list2 = new ArrayList<>((ArrayList) sc2.readObject());

        Set<Integer> set = new TreeSet<>();
        for(int it:list1) {
            if(list1.contains(it) && handle(it)) set.add(it);
        }

        for(int it:set) {
            System.out.println(it + " " + Collections.frequency(list1, it) + " " +
                                          Collections.frequency(list2, it));
        }
    }

    public static boolean handle(int it) {
        String str = String.valueOf(it);
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) - str.charAt(-1) < 0) return false;
        }
        return true;
    }
}
