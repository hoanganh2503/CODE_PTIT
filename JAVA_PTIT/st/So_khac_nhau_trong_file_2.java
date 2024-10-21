// give binary file DATA.in has 100000 positive integers, each integer < 1000. List different numbers appear in the file and sequentially

import java.io.*;
import java.util.*;

public class So_khac_nhau_trong_file_2 {
    public static void main(String[] args) throws IOException {
        // read data from file
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("DATA.in"))) {
            String line;
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
        }

        // sort the numbers
        Collections.sort(numbers);

        // find different numbers and print them
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) != numbers.get(i - 1)) {
                System.out.println(numbers.get(i));
            }
        }
    }
}