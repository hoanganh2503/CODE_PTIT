import  java.util.Scanner;

public class So_khong_lien_ke {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0){
            t--;
            String str = sc.nextLine();
            if(checkStr(str)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    static boolean checkStr(String str){
        char[] charArray = str.toCharArray();
        int sum = charArray[0] - '0' + charArray[charArray.length-1] -'0';
        for(int i=1; i<charArray.length-1; i++){
            sum+=charArray[i]-'0';
            if(Math.abs(charArray[i] - charArray[i+1]) != 2 || Math.abs(charArray[i] - charArray[i-1]) != 2) return false;
        }
        if(sum % 10 != 0) return false;
        return true;
   }
}
