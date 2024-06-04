import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.DataInputStream;
public class So_khac_nhau_trong_file_2 {
    public static void main(String[] args) throws IOException{
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.in"));
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int j = 0; j < 5 ; j++){
            int i = sc.readInt();
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else map.put(i, 1);
        }
        Set<Integer> set = map.keySet();
        for(int it:set){
            System.out.println(it + " "  + map.get(it));
        }
    }
}
