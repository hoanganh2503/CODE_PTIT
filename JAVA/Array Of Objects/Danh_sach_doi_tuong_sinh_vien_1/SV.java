package Danh_sach_doi_tuong_sinh_vien_1;

public class SV {
    public String maSV, ten, lop, ngaysinh;
    public Double diem;

    public SV(String maSV, String ten, String lop, String ngaysinh, Double diem) {
        this.maSV = maSV;
        this.ten = ten;
        this.lop = lop;
        this.diem = diem;
        String str[] = ngaysinh.split("/");
        if(str[0].length() == 1) str[0] = "0" + str[0];
        if(str[1].length() == 1) str[1] = "0" + str[1];
        this.ngaysinh = str[0] + "/" + str[1] + "/" + str[2];
    }

    public void ans(){
        System.out.printf("%s %s %s %s %.2f\n", this.maSV, this.ten, this.lop, this.ngaysinh, this.diem);
    }
}
