import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class Object {
    public String ma, ten, hthuc;

    public Object(){
        this.ma = "";
        this.ten = "";
        this.hthuc = "";
    }

    public Object(String ma, String ten, String hthuc){
        this.ma = ma;
        this.ten = ten;
        this.hthuc = hthuc;
    }

    public void getInfo(){
        System.out.printf("%s %s %s\n", this.ma, this.ten, this.hthuc);
    }
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("D:/DANHSACH.in");
        Scanner sc = new Scanner(f);
        List<Object> objects = new ArrayList<>();

        while (sc.hasNextLine()) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String hthuc = sc.nextLine();
            Object obj = new Object(ma, ten, hthuc);
            objects.add(obj);
        }

        Object[] P = objects.toArray(new Object[0]);

        Arrays.sort(P, (a, b) -> a.ma.compareTo(b.ma));

        for (Object o : P) {
            o.getInfo();
        }
        sc.close(); // Đóng Scanner sau khi sử dụng
    }
}