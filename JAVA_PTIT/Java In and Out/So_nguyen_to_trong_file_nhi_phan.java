import java.util.*;
import java.io.*;
public class So_nguyen_to_trong_file_nhi_phan {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) sc.readObject();
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int it:list){
            if(isPrime(it)){
                if(map.containsKey(it)) map.put(it, map.get(it)+1);
                else map.put(it, 1);                
            }

        }
        Set<Integer> set = map.keySet();
        for(Integer it : set){
            System.out.println(it + " " + map.get(it));
        }
    }

    public static boolean isPrime(int prime) {
        if(prime < 2) return false;
        if(prime == 2) return true;
        if(prime % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(prime); i++){
            if(prime % i == 0) return false;
        }
        return true;
    }
}
