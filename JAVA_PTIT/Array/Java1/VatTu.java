
package Java1;
import java.time.LocalDate;
import java.util.Date;

public class VatTu {
    private String maVatTu;
    private String tenVatTu = "chưa cập nhật";
    private LocalDate ngayNhap;
    private Date ngayXuat;
    private double gia;
    private double soLuong;

    // Constructor
    public VatTu(String maVatTu, String tenVatTu, LocalDate ngayNhap, Date ngayXuat, double gia, double soLuong) {
        setMaVatTu(maVatTu);
        setTenVatTu(tenVatTu);
        setNgayNhap(ngayNhap);
        setNgayXuat(ngayXuat);
        setGia(gia);
        setSoLuong(soLuong);
    }

    // Getter và Setter với các ràng buộc theo yêu cầu
    public String getMaVatTu() {
        return maVatTu;
    }

    public void setMaVatTu(String maVatTu) {
        if (maVatTu != null) {
            this.maVatTu = maVatTu;
        } else {
            throw new IllegalArgumentException("Mã vật tư không được null");
        }
    }

    public String getTenVatTu() {
        return tenVatTu;
    }

    public void setTenVatTu(String tenVatTu) {
        if (tenVatTu != null && !tenVatTu.isEmpty()) {
            this.tenVatTu = tenVatTu;
        } else {
            this.tenVatTu = "chưa cập nhật";
        }
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        if (ngayNhap != null && !ngayNhap.isAfter(LocalDate.now())) {
            this.ngayNhap = ngayNhap;
        } else {
            throw new IllegalArgumentException("Ngày nhập không hợp lệ");
        }
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        if (ngayXuat != null && ngayXuat.after(java.sql.Date.valueOf(ngayNhap))) {
            this.ngayXuat = ngayXuat;
        } else {
            throw new IllegalArgumentException("Ngày xuất phải lớn hơn ngày nhập");
        }
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        if (gia > 0) {
            this.gia = gia;
        } else {
            throw new IllegalArgumentException("Giá phải lớn hơn 0");
        }
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        if (soLuong > 0) {
            this.soLuong = soLuong;
        } else {
            throw new IllegalArgumentException("Số lượng phải lớn hơn 0");
        }
    }

    // Phương thức tính Thành tiền
    public double thanhTien() {
        return this.soLuong * this.gia;
    }

    // Override phương thức toString
    @Override
    public String toString() {
        return "VatTu [maVatTu=" + maVatTu + ", tenVatTu=" + tenVatTu + ", ngayNhap=" + ngayNhap + ", ngayXuat=" + ngayXuat
                + ", gia=" + gia + ", soLuong=" + soLuong + ", thanhTien=" + thanhTien() + "]";
    }
}