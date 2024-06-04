import java.util.Scanner;
public class Cat_doi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0){
            boolean check = false;
            t--;
            String str = sc.nextLine();
            char[] charArray = str.toCharArray();
            for(int i = 0; i < str.length(); i++){
                switch (charArray[i]){
                    case '0':
                        charArray[i] = '0';
                        break;
                    case '1':   
                        charArray[i] = '1';
                        break;
                    case '8':
                        charArray[i] = '0';
                        break;
                    case '9':
                        charArray[i] = '0';
                        break;
                    default:
                        check = true;
                        break;
                }
                if(check) break;
            }
            long ans = Long.parseLong(String.valueOf(charArray));
            if(check || ans == 0){
                System.out.println("INVALID");
            }else{
                System.out.println(ans);
            }

        }        
    }

}
