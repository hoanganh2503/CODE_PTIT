package Examination.FOLDER.Danh_sach_lien_lac;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("D:/MONHOC.in"));
        ArrayList<DS> list = new ArrayList<DS>();
        while(sc.hasNextLine()){
            DS a = new DS(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(a);
        }
        Collections.sort(list);
        for(DS d : list) System.out.println(d);
    }
}
