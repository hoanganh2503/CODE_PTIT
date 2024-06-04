package Danh_sach_sinh_vien_trong_file_nhi_phan;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> sv =(ArrayList<SinhVien>) sc.readObject();    
        for(SinhVien it:sv){
            System.out.println(it);
        }
    }
}
