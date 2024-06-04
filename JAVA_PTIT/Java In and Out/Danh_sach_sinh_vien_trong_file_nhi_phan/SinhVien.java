package Danh_sach_sinh_vien_trong_file_nhi_phan;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.io.Serializable;

public class SinhVien implements Serializable {
    private String ma;
    private String ten;
    private String lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int id, String ten, String lop, String ngaysinh, float gpa) {
        DecimalFormat df = new DecimalFormat("B20DCCN000");
        this.ma = df.format(id+1);
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            this.ngaysinh = sdf.parse(ngaysinh);
        }
        catch (Exception e)
        {
            
        }        
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return this.ma + " " + this.ten + " " + this.lop + " " + sdf.format(this.ngaysinh) + " " + String.format("%.2f", this.gpa);
    }
}
