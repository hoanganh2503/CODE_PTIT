import java.util.Scanner;

public class So_lien_ke {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0){
            t--;
            String str = sc.nextLine();
            if(checkStr(str)) System.out.println("YES");
            else System.out.println("NO");
        }
   }

   static boolean checkStr(String str){
        char[] charArray = str.toCharArray();
        for(int i=1; i<charArray.length-1; i++){
            if(Math.abs(charArray[i] - charArray[i+1]) != 1 || Math.abs(charArray[i] - charArray[i-1]) != 1) return false;
        }
        return true;
   }
}
