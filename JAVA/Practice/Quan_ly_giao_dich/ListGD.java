package Practice.Quan_ly_giao_dich;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ListGD {
    private ArrayList<GiaoDich> list;
    private static int tonggdv, tonggdtt;

    public ListGD(){
        list = new ArrayList<GiaoDich>();
        tonggdv=0;
        tonggdtt=0;
    }

    private GiaoDich themGD(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap thong tin GD ");
        System.out.println("Ma GD (nhap so): ");
        int magd = in.nextInt();
        GiaoDich gd = new GiaoDich(magd);
        if(list.contains(gd)) return null;
        else{
            String ngaygd="";
            while(true){
                System.out.println("Ngay Giao Dich(dd-mm-yyyy): ");
                ngaygd = in.next();
                if(ngaygd.matches("\\d{2}-\\d{2}-\\d{4}$"))
                break;
            }
        
            gd.setNgaygd(ngaygd);
            System.out.println("Don Gia: ");
            double dongia = in.nextDouble();
            gd.setDongia(dongia);
            System.out.println("So Luong: ");
            int soluong = in.nextInt();
            gd.setSoluong(soluong);
            return gd;
        }
        
    }

    public boolean themGDVang(){
        Scanner in=new Scanner(System.in);
        GiaoDich gd = themGD();
        if(gd == null) return false;
        else{
            System.out.println("Loai Vang: ");
            String loaivang = in.next();
            GiaoDichVang gdv = new
            GiaoDichVang(gd.getMagd(), gd.getSoluong(), gd.getNgaygd(), gd.getDongia(), loaivang);
            gdv.setThanhtien();
            tonggdv += gdv.getSoluong();
            return list.add(gdv);
        }
    }

    public boolean themGDTT(){
        Scanner in=new Scanner(System.in);
        GiaoDich gd = themGD();
        if(gd == null) return false;
        else{
            System.out.println("Loai Tien Te(nhap 1:vnd, 2:ngoai te): ");
            int loaitiente = in.nextInt();
            double tigia;
            if(loaitiente == 1) tigia = 1;
            else{
                System.out.println("Ti Gia: ");
                tigia=in.nextDouble();  
            }
            
            GiaoDichTienTe gdtt = new GiaoDichTienTe(gd.getMagd(), gd.getSoluong(), gd.getNgaygd(), gd.getDongia(), tigia, loaitiente);
            tonggdtt += gdtt.getSoluong();
            gdtt.setThanhtien();
            return list.add(gdtt);
        }
    }

    public void hienthiDS(){
        System.out.println("---------------- DANH SACH GIAO DICH ----------------");
        System.out.println("MaGD\tSo Luong\tNgay GD\t\tDon Gia\t\tLoai vang/tygia\t\tTTien");
        double tt=0;
        for (GiaoDich gd: list){
            System.out.println(gd.toString());
            tt += gd.getThanhtien();
        }
        
        System.out.println("=================");
        System.out.println("Tong tien: "+Double.toString(tt));
    }

    public void getByDate(String ngaygd){
        System.out.println("---------------- DANH SACH GIAO DICH Ngay "+ngaygd+" ----------------");
        System.out.println("MaGD\tSo Luong\tNgay GD\t\tDon Gia\t\tLoai vang/tygia\t\tTTien");
        for (GiaoDich gd: list)
            if(gd.getNgaygd().equals(ngaygd))
                System.out.println(gd.toString());

        System.out.println("=============");
    }

    public void getContainDate(String ngaygd){
        System.out.println("=====DANH SACH GIAO DICH Ngay "+ngaygd+"=========");
        System.out.println("MaGD\tSo Luong\tNgay GD\t\tDon Gia\t\tLoai vang/tygia\t\tTTien");
        for (GiaoDich gd: list)
            if(gd.getNgaygd().indexOf(ngaygd)>=0)
                System.out.println(gd.toString());

        System.out.println("===============");
    }

    public void findByMa(int ma){
        System.out.println("=====DANH SACH GIAO DICH THEO MA "+ma+"=========");
        System.out.println("MaGD\tSo Luong\tNgay GD\t\tDon Gia\t\tLoai vang/tygia\t\tTTien");
        for (GiaoDich gd: list)
            if(gd.getMagd() == ma)
                System.out.println(gd.toString());

        System.out.println("===============");
    }

    public void findByNgay(String ngay){
        System.out.println("=====DANH SACH GIAO DICH CO CHUA "+ngay+"=========");
        System.out.println("MaGD\tSo Luong\tNgay GD\t\tDon Gia\t\tLoai vang/tygia\t\tTTien");
        for (GiaoDich gd: list)
            if(gd.getNgaygd().contains(ngay))
                System.out.println(gd.toString());

        System.out.println("===============");
    }

    public void timKiemSoLuongTrongKhoang(int a, int b){
        System.out.println("=====DANH SACH GIAO DICH CO So LUONG TU "+a+" DEN " + b + " =========");
        System.out.println("MaGD\tSo Luong\tNgay GD\t\tDon Gia\t\tLoai vang/tygia\t\tTTien");
        for (GiaoDich gd: list)
            if(gd.getSoluong() >= a && gd.getSoluong() <= b)
                System.out.println(gd.toString());

        System.out.println("===============");
    }

    public int tongGGVang(){
        return tonggdv; 
    }

    public int tongGGTienTe(){
        return tonggdtt; 
    }
        
    public void getBySoLuong(int from,int to){
        System.out.println("=====DANH SACH GIAO DICH voi so luong tu " + from + "toi" + to + "=========");
        System.out.println("MaGD\tSo Luong\tNgay GD\t\tDon Gia\t\tLoai vang/tygia\t\tTTien");
        for (GiaoDich gd: list)
            if((gd.getSoluong()>=from) && (gd.getSoluong()<=to))
                System.out.println(gd.toString());
        System.out.println("=====================================");

    }

    public void getSoLuong(){
        System.out.println("======= Tong so luong cua cac giao dich =======");
        int ans = 0;
        System.out.println("MaGD\tSo Luong\tNgay GD\t\tDon Gia\t\tLoai vang/tygia\t\tTTien");
        for (GiaoDich gd: list){
            ans += gd.getSoluong();
            System.out.println(gd);
        }
                
        System.out.println("Total: " + ans);
        System.out.println("=====================================");

    }
        
    public void getByYear(int from,int to){
        System.out.println("=====DANH SACH GIAO DICH tu" + from + "toi" + to + "=========");
        System.out.println("MaGD\tSo Luong\tNgay GD\t\tDon Gia\tLoai vang/tygia TTien");
        for (GiaoDich gd: list)
            if((Integer.parseInt((gd.getNgaygd().substring(6)))>=from) && Integer.parseInt((gd.getNgaygd().substring(6)))<=to)
                System.out.println(gd.toString());

        System.out.println("=====================================");
    }

    public void sapXepByNgay(){
        Collections.sort(list, new Comparator<GiaoDich>() {
            @Override
            public int compare(GiaoDich g1, GiaoDich g2) {
                return ((g1.getNgaygd().substring(6)+g1.getNgaygd().substring(3,5)
                        +g1.getNgaygd().substring(0,2)).compareTo((g2.getNgaygd().substring(6)
                        +g2.getNgaygd().substring(3,5)+g2.getNgaygd().substring(0,2))));
            }
        });
    }

    public void sapXepByNgayGD(){
        Collections.sort(list, new Comparator<GiaoDich>() {
            @Override
            public int compare(GiaoDich g1, GiaoDich g2) {
                SimpleDateFormat s1 = new SimpleDateFormat("dd-MM-yyyy");
                try{
                    Date date1 = s1.parse(g1.getNgaygd());
                    Date date2 = s1.parse(g2.getNgaygd()); 
                    return date1.compareTo(date2);                                       
                }catch(Exception e){
                    return 0;
                }
            }
        });
    }

    public void sapXepByTongTien(){
        Collections.sort(list, new Comparator<GiaoDich>() {
            @Override
            public int compare(GiaoDich g1, GiaoDich g2) {
                return (int)(g1.getThanhtien() - g2.getThanhtien());
            }
        });
    }

    public void sapXepSL(){
        Collections.sort(list, new Comparator<GiaoDich>() {
            @Override
            public int compare(GiaoDich g1, GiaoDich g2) {
                return (int)(g1.getSoluong() - g2.getSoluong());
            }
        });
    }
}
