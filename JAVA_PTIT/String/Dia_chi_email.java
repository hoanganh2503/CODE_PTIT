    import java.util.*;
    public class Dia_chi_email {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            Set<String> noname = new HashSet<String>();
            Set<String> set = new LinkedHashSet<String>();
            while(t-->0){
                String str = sc.nextLine();
                set.add(str.replaceAll("\\s\\s+", " ").trim().toLowerCase());
            }
            for(String it:set){
                String ans[] = it.split(" ");
                String res = "";
                res+=ans[ans.length-1];
                for(int i = 0 ; i < ans.length-1 ; i++){ 
                    res+=ans[i].charAt(0);
                }
                while(noname.contains(res)){
                    int a = res.charAt(res.length()-1) - '0';
                    if(a >= 2 && a <= 9){
                        res  = res.substring(0, res.length()-1) + String.valueOf(a+1);
                    }
                    else res += String.valueOf(2);
                }
                System.out.println(res + "@ptit.edu.vn");
                noname.add(res);
            }
        }
    }
