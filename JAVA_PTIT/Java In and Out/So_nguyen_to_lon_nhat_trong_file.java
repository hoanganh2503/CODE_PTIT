import java.util.*;
import java.io.*;
public class So_nguyen_to_lon_nhat_trong_file {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) sc.readObject();
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int it:list){
            if(isPrime(it)){
                if(map.containsKey(it)) map.put(it, map.get(it)+1);
                else {
                    map.put(it, 1);  
                    a.add(it);
                }              
            }
        }
        Collections.sort(a, Collections.reverseOrder());
        for(int i = 0 ;  i < 10 ; i++){
            System.out.println(a.get(i) + " " + map.get(a.get(i)));
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
