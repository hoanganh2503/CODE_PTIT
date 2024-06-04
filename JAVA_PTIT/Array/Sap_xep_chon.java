import java.util.*;
public class Sap_xep_chon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            int mark = i;
            boolean check = true;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[mark]){
                    mark = j;
                    check = false;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[mark]; 
            arr[mark] = tmp;
            System.out.print("Buoc " + (i+1) + ": ");
            for(int k=0; k<n; k++) System.out.print(arr[k] + " ");
            System.out.println();
        }

    }
}