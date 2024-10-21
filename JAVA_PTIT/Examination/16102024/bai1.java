import java.util.*;
import java.io.*;

class DS implements Comparable<DS> {
    public String ma;
    public String ten;
    public String lop;
    public String mail;
    public String sdt;

    public DS(String ma, String ten, String lop, String mail, String sdt){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
        this.sdt = "0" + sdt;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.lop + " " + this.mail + " " + this.sdt;
    }

    @Override
    public int compareTo(DS o) {
        if(this.lop.compareTo(o.lop) > 0) return 1;
        else if(this.lop.compareTo(o.lop) == 0)
            return this.ma.compareTo(o.ma);
        
        return -1;
    }
}

public class bai1 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("D:/DANHSACH.in"));
        ArrayList<DS> list = new ArrayList<DS>();
        while(sc.hasNextLine()){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            String sdt = sc.nextLine();
            DS a = new DS(ma, ten, lop, mail, sdt);
            list.add(a);
        }
        Collections.sort(list);
        for(DS d : list) System.out.println(d);
    }

}
