import java.util.*;
import java.io.*;
public class Nguyen_to_thuan_va_nghich {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) sc1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) sc2.readObject();
        Set<Integer> set = new TreeSet<Integer>();

        for(int it:list1){
            if(check(it) && isPrime(it)) set.add(it);
        }

        for(int it:set){
            System.out.println(it + " " + Collections.frequency(list1, it) + " " + Collections.frequency(list2, it));
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

    public static boolean check(int n) {
        String str = String.valueOf(n);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        }
        return true;
    }
}
