package Java1;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;


public class ListVT {
    private ArrayList<VatTu> danhSachVatTu;

    public ListVT() {
        this.danhSachVatTu = new ArrayList<>();
    }

    // Phương thức thêm một vật tư vào danh sách
    public boolean themVatTu(VatTu vatTu) {
        for (VatTu vt : danhSachVatTu) {
            if (vt.getMaVatTu().equals(vatTu.getMaVatTu())) {
                return false; // Trùng mã vật tư
            }
        }
        this.danhSachVatTu.add(vatTu);
        return true;
    }

    // Phương thức sắp xếp theo ngày xuất tăng dần
    public void sapXepTheoNgayXuat() {
        this.danhSachVatTu.sort(Comparator.comparing(VatTu::getNgayXuat));
    }

    // Phương thức tính tổng tiền các vật tư đã nhập
    public String tinhTongTien() {
        double tongTien = 0;
        for (VatTu vatTu : danhSachVatTu) {
            tongTien += vatTu.thanhTien();
        }

        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        return currencyVN.format(tongTien);
    }

    // Phương thức xuất danh sách vật tư nhập trong tháng 02/2023
    public void xuatVatTuThang02_2023() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for (VatTu vatTu : danhSachVatTu) {
            if (vatTu.getNgayNhap().getMonthValue() == 2 && vatTu.getNgayNhap().getYear() == 2023) {
                System.out.println("Mã vật tư: " + vatTu.getMaVatTu() + ", Tên vật tư: " + vatTu.getTenVatTu()
                        + ", Ngày nhập: " + dateFormat.format(java.sql.Date.valueOf(vatTu.getNgayNhap()))
                        + ", Ngày xuất: " + dateFormat.format(vatTu.getNgayXuat()) + ", Thành tiền: " + vatTu.thanhTien());
            }
        }
    }
}