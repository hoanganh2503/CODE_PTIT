package TH3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("INSTITUTION.in"));
        Scanner in2 = new Scanner(new File("REGISTER.in"));
        int t1 = in.nextInt();
        ArrayList<INSTITUTION> schname = new ArrayList<>();
        in.nextLine();
        while(t1-->0){
            String s = in.nextLine();
            String[] insData = s.split("\\s+",2);
            String vt = insData[0];
            String name = insData[1];
            schname.add(new INSTITUTION(vt, name));
        }
        int t2 = in2.nextInt();
        in2.nextLine();
        ArrayList<ICPC> ds = new ArrayList<>();
        while(t2-->0){
            String s = in2.nextLine();
            String[] data2 = s.split("\\s+");
            String insVT = data2[0];
            int numTeam = Integer.parseInt(data2[1]);
            INSTITUTION ins = findSchool(schname, insVT);
            for(int j = 0;j < numTeam;j++){
                String teamName = in2.nextLine();
                ds.add(new ICPC(teamName, ins.getName()));
            }
        }
        Collections.sort(ds, new Comparator<ICPC>() {
            public int compare(ICPC a, ICPC b){
                if(a.getSchool().equals(b.getSchool())) return a.getName().compareTo(b.getName());
                return a.getSchool().compareTo(b.getSchool());
            }
        });
        String idt = "team";
        for(int i = 1;i <= ds.size();i++){
            System.out.println(setMhs(i, idt) + " " + ds.get(i-1));
        }
    }
    public static INSTITUTION findSchool(ArrayList<INSTITUTION> ins,String insVT){
        for(INSTITUTION it: ins){
            if(it.getVt().equals(insVT)) return it;
        }
        return null;
    }
    public static String setMhs(int i,String mt){
        if(i < 10) {
            mt += "0" + Integer.toString(i);
        }else mt += Integer.toString(i);
        return mt;
    }
}
class ICPC{
    private String name,school;
    public ICPC( String name,String school){
        this.name = name;
        this.school = school;
    }
    public String getSchool(){
        return school;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name + " " + school;
    }
}
class INSTITUTION{
    private String vt;
    private String name;
    public INSTITUTION(String vt, String name){
        this.vt = vt;
        this.name = name;
    }
    public String getVt(){
        return vt;
    }
    public String getName(){
        return name;
    }
}