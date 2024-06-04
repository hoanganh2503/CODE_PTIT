import java.util.Scanner;
public class Chu_so_4_va_chu_so_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        int ans = 0;
        for(int i =  0 ; i< charArray.length ; i++){
            if(charArray[i] == '4' || charArray[i] == '7') ans++;
        }
        if(ans == 4 || ans == 7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
