package Danh_sach_doi_tuong_sinh_vien_3;

public class SV {
    public String maSV, ten, lop, ngaysinh;
    public Double diem;

    public SV(String maSV, String ten, String lop, String ngaysinh, Double diem) {
        this.maSV = maSV;
        this.lop = lop;
        this.diem = diem;
        String str[] = ngaysinh.split("/");
        if(str[0].length() == 1) str[0] = "0" + str[0];
        if(str[1].length() == 1) str[1] = "0" + str[1];
        this.ngaysinh = str[0] + "/" + str[1] + "/" + str[2];
        String ten1[] = ten.replaceAll("\\s\\s+", " ").trim().toLowerCase().split(" ");
        String ansName = "";
        for(String s : ten1){
            ansName += s.substring(0, 1).toUpperCase() + s.substring(1) + " ";
        }
        this.ten = ansName;
    }

    public void ans(){
        System.out.printf("%s %s%s %s %.2f\n", this.maSV, this.ten, this.lop, this.ngaysinh, this.diem);
    }
}
