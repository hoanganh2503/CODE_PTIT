import  java.util.Scanner;
public class So_tam_phan {
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

    static boolean checkStr(String str) {
        char[] charArray =  str.toCharArray();
        for(int i = 0; i < charArray.length ; i++){
            if(charArray[i] != '0' && charArray[i] != '1' && charArray[i] != '2') return false;
        }
        return true;
    }
}
