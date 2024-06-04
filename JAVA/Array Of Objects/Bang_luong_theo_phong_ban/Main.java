package Bang_luong_theo_phong_ban;
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
            String ma_phong = "";
            for(int j = 0; j < n; j++){
                if(ma.substring(3).equals(pb[j].getId())){
                    phong = pb[j].getName();
                    ma_phong = pb[j].getId();
                }
            }
            nv[i] = new NV(ma, sc.nextLine(), phong, ma_phong, sc.nextDouble(), sc.nextDouble());
        }
        sc.nextLine();
        String phong = sc.nextLine();
        String phong1 = "";
        for(int j = 0; j < n; j++){
            if(phong.equals(pb[j].getId())){
                phong1 = pb[j].getName();
            }
        }
        System.out.println("Bang luong phong " + phong1  + ":");
        for(NV it:nv) {
            if(phong.equals(it.getDepartmentId()))
            System.out.printf("%s %s %.0f\n", it.getId(), it.getName(), it.getSalary());
        }
    }
}
