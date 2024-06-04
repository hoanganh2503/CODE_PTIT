import java.io.*;
import java.util.*;
public class So_khac_nhau_trong_file_3 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int it:a){
            if(map.containsKey(it)) map.put(it, map.get(it)+1);
            else map.put(it, 1);
        }
        Set<Integer> set = map.keySet();
        for(Integer it : set){
            System.out.println(it + " " + map.get(it));
        }
    }
}
