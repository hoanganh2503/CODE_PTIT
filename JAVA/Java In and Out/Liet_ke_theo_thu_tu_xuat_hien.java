import java.util.*;
import java.io.*;
public class Liet_ke_theo_thu_tu_xuat_hien {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> list = (ArrayList<String>) sc2.readObject();

        Set<String> s1 = new LinkedHashSet<String>();
        Set<String> s2 = new LinkedHashSet<String>();

        while(sc.hasNext()){
            s1.add(sc.next().toLowerCase());
        }

        for (String i : list)
            s2.addAll(Arrays.asList(i.trim().toLowerCase().split("\\s+")));
        s1.retainAll(s2);
        for(String it:s1) System.out.println(it);


    }
}
