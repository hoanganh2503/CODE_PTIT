import java.util.*;

public class Day_con_co_tong_nguyen_to {

    static class CompareHandle implements Comparator<List<Integer>> {
        @Override
        public int compare(List<Integer> list1, List<Integer> list2) {
            int size = Math.min(list1.size(), list2.size());

            for (int i = 0; i < size; i++) {
                int element1 = list1.get(i);
                int element2 = list2.get(i);

                if (element1 != element2) {
                    return Integer.compare(element1, element2);
                }
            }

            return Integer.compare(list1.size(), list2.size());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for(int i = 0; i < n; i++) arr.add(sc.nextInt());
           Collections.sort(arr, Collections.reverseOrder());
            List<List<Integer>> ans = handle(arr, sum(arr));
 
            Collections.sort(ans, new CompareHandle());
            for (List<Integer> it : ans) {
                for (int it1 : it) {
                    System.out.print(it1 + " ");
                }
                System.out.println();
            }
        }

    }

    public static List<List<Integer>> handle(List<Integer> arr, int targetSum) {
        List<List<Integer>> subsequences = new ArrayList<>();
        backtrack(arr, 0, 0, targetSum, new ArrayList<>(), subsequences);
        return subsequences;
    }

    public static int sum(List<Integer> arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static void backtrack(List<Integer> arr, int start, int currentSum, int targetSum,
                                 List<Integer> currentSequence, List<List<Integer>> subsequences) {
        if (isPrime(currentSum)) {
            subsequences.add(new ArrayList<>(currentSequence));
        }

        for (int i = start; i < arr.size(); i++) {
            int num = arr.get(i);
            if (currentSum + num <= targetSum) {
                currentSequence.add(num);
                backtrack(arr, i + 1, currentSum + num, targetSum, currentSequence, subsequences);
                currentSequence.remove(currentSequence.size() - 1);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}