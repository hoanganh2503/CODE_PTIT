package Practice.Quan_ly_giao_dich;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        ListGD ans = new ListGD();
        selectOptions();

        while(n!=0){
            ans.sapXepByNgay();            
            switch (n) {
                case 0:
                    break;

                case 1:
                    ans.themGDVang();
                    break;

                case 2:
                    ans.themGDTT();
                    break;

                case 3:
                    ans.hienthiDS();
                    break;

                case 4:
                    ans.getSoLuong();
                    break;

                case 5:
                    sc.nextLine();
                    System.out.println("Nhap ngay: ");
                    String ngaygd = sc.nextLine();
                    ans.getByDate(ngaygd);
                    break;

                case 6:
                    System.out.println("Nhap ngay: ");
                    sc.nextLine();
                    String ngay =sc.nextLine();
                    ans.getContainDate(ngay);
                    break;

                case 7:
                    System.out.println("Nhap nam bat dau va nam ket thuc: ");
                    sc.nextLine();
                    int bd = sc.nextInt();
                    int kt = sc.nextInt();
                    ans.getByYear(bd, kt);
                    break;
                case 8:
                    int ma = sc.nextInt();
                    ans.findByMa(ma);
                    break;
                case 9:
                    sc.nextLine();
                    String findngay = sc.nextLine();
                    ans.findByNgay(findngay);
                    break;
                case 10:
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    ans.timKiemSoLuongTrongKhoang(a, b);
                    ans.hienthiDS();
                    break;
                case 11:
                    ans.sapXepByNgayGD();
                    ans.hienthiDS();
                    break;
                case 12:
                    ans.sapXepSL();
                    ans.hienthiDS();
                    break;
                case 13:
                    ans.sapXepByTongTien();
                    ans.hienthiDS();
                    break;
            }
            System.out.println("\n\nNhap n: ");
            n = sc.nextInt();
        }
    }

    public static void selectOptions(){
        System.out.println("Options:");
        System.out.println("0. Thoat");
        System.out.println("1. Them Giao Dich Vang");
        System.out.println("2. Them Giao Dich Tien Te");
        System.out.println("3. Hien Thi Danh Sach Giao Dich");
        System.out.println("4. Xem Tong So Luong cua cac Giao Dich");
        System.out.println("5. Hien Thi Danh Sach Giao Dich theo ngay");
        System.out.println("6. Hien Thi DS Giao Dich co chua ngay");
        System.out.println("7. Hien Thi DS Giao Dich theo Tu nam den Nam");
    }
}
