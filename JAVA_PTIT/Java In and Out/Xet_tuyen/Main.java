package Xet_tuyen;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        DecimalFormat df = new DecimalFormat("PH00");
        int n = sc.nextInt();
        TS ts[] = new TS[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            ts[i] = new TS(df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        for(TS it:ts){
            System.out.printf("%s %s %.0f %.0f %s\n", it.getMa(), it.getTen(), it.getTuoi(), it.getTB(), it.getXl());
        }

    }
}
