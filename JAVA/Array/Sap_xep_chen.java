import java.util.*;
public class Sap_xep_chen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            Arrays.sort(arr, 0, i+1);
            System.out.print("Buoc " + (i) + ": ");
            for(int k=0; k<=i; k++) System.out.print(arr[k] + " ");
            System.out.println();
        }
    }
}
