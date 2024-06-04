import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Go_ban_phim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedList<Character> ans = new LinkedList<>();
        ListIterator<Character> iterator = ans.listIterator();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == '>') {
                if (iterator.hasNext()) {
                    iterator.next();
                }
            } else if (ch == '<') {
                if (iterator.hasPrevious()) {
                    iterator.previous();
                }
            } else if (ch == '-') {
                if (iterator.hasPrevious()) {
                    iterator.previous();
                    iterator.remove();
                }
            } else {
                iterator.add(ch);
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (char ch : ans) {
            result.append(ch);
        }
        
        System.out.println(result.toString());
    }
}