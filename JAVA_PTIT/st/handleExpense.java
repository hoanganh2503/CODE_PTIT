import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class ChiTieu{
    public int ID;
    public String ngay, noiDung;
    public float tien;

    public ChiTieu(int ID, String ngay, float soTien, String nd){
        this.ID = ID;
        this.ngay = ngay;
        this.tien = soTien;
        this.noiDung = nd;
    }

    public void hienThi(){
        System.out.print(this.ID);
        System.out.println('\t' + this.ngay + '\t' + this.tien + '\t' + this.noiDung);
    }
    
}

public class handleExpense {
    public static void main(String[] args) {
        int n = -1;
        List<ChiTieu> list = new ArrayList<ChiTieu>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");

        while(n != 4){
            System.out.println("Menu");
            System.out.println("1. Add an expense");
            System.out.println("2. Display all expense");
            System.out.println("3. Delete an expense");
            System.out.println("4. Quit");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            sc.nextLine();
            switch(n){
                case 1:
                    System.out.println("Nhap ngay (dd-MMM-yyyy)");
                    String ngay = sc.nextLine();
                    try {
                        dateFormat.setLenient(false);
                        dateFormat.parse(ngay); 
                    } catch (ParseException e) {
                        System.out.println("Ngay nhap khong dung dinh dang, hay nhap lai.");
                        continue;
                    }
                    System.out.println("Nhap so tien:");
                    float tien = sc.nextFloat();
                    sc.nextLine();
                    System.out.println("Nhap noi dung:");
                    String noiDung = sc.nextLine();
                    ChiTieu a = new ChiTieu(list.get(list.size() - 1).ID + 1, ngay.toString(), tien, noiDung);
                    list.add(a);
                    break;
                case 2:
                    float total = 0;
                    System.out.println("ID" + '\t' + "Date" + "\t\t" + "Amount" + '\t' + "Content");
                    for(ChiTieu x: list){
                        x.hienThi();
                        total += x.tien;
                    } 
                    System.out.println("Total: " + total);
                    break;
                case 3:
                    System.out.println("Nhap ID can xoa:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;
                    for(int i=0; i<list.size(); i++){
                        if(list.get(i).ID == id){
                            list.remove(i);
                            found = true;
                            break;
                        }
                    }
                    if(!found) System.out.println("Khong tim thay chi tieu nao.");
                    break;
                case 4:
                    break;
            }
        }
    }
}
