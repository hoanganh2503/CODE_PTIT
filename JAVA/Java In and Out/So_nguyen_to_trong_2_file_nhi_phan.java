import java.util.*;
import java.io.*;
public class So_nguyen_to_trong_2_file_nhi_phan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = new ArrayList<>((ArrayList) sc1.readObject());
        ArrayList<Integer> list2 = new ArrayList<>((ArrayList) sc2.readObject());
        Set<Integer> set1 = new TreeSet<>();
        for(int it:list1){
            if(isPrime(it))
            set1.add(it);
        }
        for(int it:set1){
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
}
