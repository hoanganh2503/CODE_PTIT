import java.io.*;
import java.util.*;
public class Cap_SNT_trong_file_2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        Set<Integer> list1 = new TreeSet<>((ArrayList) sc1.readObject());
        Set<Integer> list2 = new TreeSet<>((ArrayList) sc2.readObject());

        for (Integer i : list1)
            if (i < 1000000 - i && isPrime(i) && list1.contains(1000000 - i) && isPrime(1000000 - i) && !list2.contains(i) && !list2.contains(1000000-i))
                System.out.println(i + " " + (1000000 - i));

        
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
