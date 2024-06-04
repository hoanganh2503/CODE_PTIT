package Chuan_hoa_va_sap_xep;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("d"));

        ArrayList<Name> name = new ArrayList<Name>();
        while(sc.hasNextLine()){
            Name a = new Name(sc.nextLine());
            name.add(a);
        }

        Collections.sort(name, (a, b)->{
            return a.getTen().compareTo(b.getTen()) > 0 ? 1 : a.getTen().equals(b.getTen()) ? a.getHo().compareTo(b.getHo()) > 0 ? 1 : a.getHo().equals(b.getHo()) ? a.getDem().compareTo(b.getDem()) : -1 : -1;
        });
        for(Name it : name){
            System.out.println(it.getName());
        }
    }
}
