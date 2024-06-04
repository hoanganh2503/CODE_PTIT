import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class LOG_thoi_gian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String logEntry = "";
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            logEntry += line;
            if(line.isEmpty()) break;
        }
        String pattern = "\\d{2}:\\d{2}:\\d{2}"; 

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(logEntry);

        Set<String> set = new TreeSet<String>();
        while (matcher.find()) {
            String time = matcher.group();
            set.add(time);
        }
        for(String it:set){
            System.out.println(it);
        }
    }
}
