package Danh_sach_doi_tuong_nhan_vien;

public class NV {
    public String maSV, ten, gt, ngaysinh, diachi, msthue, ngayki;

    public NV(String maSV, String ten, String gt, String ngaysinh, String diachi, String msthue, String ngayki) {
        this.maSV = maSV;
        this.ten = ten;
        this.gt = gt;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.msthue = msthue;
        this.ngayki = ngayki;
    }

    public void ans(){
        System.out.printf("%s %s %s %s %s %s %s\n", this.maSV, this.ten, this.gt, this.ngaysinh, this.diachi, this.msthue, this.ngayki);
    }
}
