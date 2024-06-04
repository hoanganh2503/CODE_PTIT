package Tim_thu_khoa_cua_ki_thi;

public class SV {
    public String ten, ngaysinh, stt;
    public Double diem;

    public SV(String stt, String ten, String ngaysinh, double diem) {
        this.stt = stt;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.diem = diem;
    }

    public void Ans(){
        System.out.printf("%s %s %s %.1f\n", this.stt, this.ten, this.ngaysinh, this.diem);
    }
}
