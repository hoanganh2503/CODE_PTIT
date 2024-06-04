// Khai báo lớp Point (điểm trong không gian hai chiều) có mô tả như sau: 
// Viết chương trình nhập 3 điểm p1, p2, p3. Hãy tính diện tích tam giác được tạo bởi 3 điểm đó.
// Công thức Heron tính diện tích tam giác khi biết độ dài 3 cạnh là a,b,c:

package Dien_tich_tam_giac;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            TG A = new TG(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            A.printTG();
        }
    }
}
