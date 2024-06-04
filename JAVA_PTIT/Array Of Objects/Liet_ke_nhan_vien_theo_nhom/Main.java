package Liet_ke_nhan_vien_theo_nhom;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        NV nv[] = new NV[n];
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String ma = sc.next();
            String ten = sc.nextLine();
            String chuc_vu = ma.substring(0, 2);
            if(chuc_vu.equals("GD")){
                if(map.containsKey(chuc_vu)){
                    if(map.get(chuc_vu) >= 1) ma = ma.replace("GD", "NV");
                    else map.put(chuc_vu, map.get(chuc_vu) + 1);                    
                }else{
                    map.put(chuc_vu, 1);                    
                }
            }else if(chuc_vu.equals("TP")){
                if(map.containsKey(chuc_vu)){
                    if(map.get(chuc_vu) >= 3) ma = ma.replace("TP", "NV");
                    else map.put(chuc_vu, map.get(chuc_vu) + 1);                    
                }else{
                    map.put(chuc_vu, 1);                    
                }
            }else if(chuc_vu.equals("PP")){
                if(map.containsKey(chuc_vu)){
                    if(map.get(chuc_vu) >= 3){
                       ma = ma.replace("PP", "NV"); 
                    } 
                    else map.put(chuc_vu, map.get(chuc_vu) + 1);                    
                }else{
                    map.put(chuc_vu, 1);                    
                }
            }
            nv[i] = new NV(ma, ten);
            
        }
        Arrays.sort(nv);
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String str = sc.nextLine();
            for(NV it:nv){
                if(str.equals(it.getCV())){
                    System.out.println(it);
                }
            }
            System.out.println();
        }
    }
}
