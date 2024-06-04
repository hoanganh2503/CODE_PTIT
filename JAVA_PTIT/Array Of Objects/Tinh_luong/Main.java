package Tinh_luong;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PB pb[] = new PB[n];
        sc.nextLine();
        for (int i = 0; i < n; i++){
            pb[i] = new PB(sc.next(), sc.nextLine());
        }

        int m = sc.nextInt();
        NV nv[] = new NV[m];
        for(int i = 0; i < m; i++){
            sc.nextLine();
            String ma = sc.nextLine();
            String phong = "";
            for(int j = 0; j < n; j++){
                if(ma.substring(3).equals(pb[j].getId())){
                    phong = pb[j].getName();
                }
            }
            nv[i] = new NV(ma, sc.nextLine(), phong, sc.nextDouble(), sc.nextDouble());
        }
        for(NV it:nv) {
            System.out.printf("%s %s %s %.0f\n", it.getId(), it.getName(), it.getDepartment(), it.getSalary());
        }
    }
}
