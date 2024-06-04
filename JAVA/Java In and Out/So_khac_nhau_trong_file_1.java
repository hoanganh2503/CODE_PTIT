import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class So_khac_nhau_trong_file_1 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        while(sc.hasNext()){
            int i = sc.nextInt();
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
