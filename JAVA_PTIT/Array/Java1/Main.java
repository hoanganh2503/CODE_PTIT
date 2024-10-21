package Java1;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        VatTu vatTu1 = new VatTu("VT01", "Xi măng", LocalDate.of(2023, 2, 10), new Date(), 50000, 100);
        VatTu vatTu2 = new VatTu("VT02", "Cát", LocalDate.of(2023, 2, 20), new Date(), 100000, 50);
        VatTu vatTu3 = new VatTu("VT03", "Sắt thép", LocalDate.of(2023, 1, 25), new Date(), 200000, 30);

        // Tạo danh sách vật tư và thêm các vật tư vào danh sách
        ListVT listVT = new ListVT();
        listVT.themVatTu(vatTu1);
        listVT.themVatTu(vatTu2);
        listVT.themVatTu(vatTu3);

        // Sắp xếp theo ngày xuất
        listVT.sapXepTheoNgayXuat();
        System.out.println("Danh sách vật tư sau khi sắp xếp theo ngày xuất:");
        for (VatTu vatTu : listVT) {
            System.out.println(vatTu);
        }

        System.out.println("tong " + listVT.tinhTongTien());

        // Xuất danh sách vật tư đã nhập trong tháng 02/2023
        System.out.println("Danh sách vật tư đã nhập trong tháng 02/2023:");
        listVT.xuatVatTuThang02_2023();
    }
}