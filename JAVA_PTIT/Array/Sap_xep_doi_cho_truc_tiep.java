import java.util.*;
public class Sap_xep_doi_cho_truc_tiep {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            boolean check = true;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[i]){
                    check = false;
                    int tmp = arr[i];
                    arr[i] = arr[j]; 
                    arr[j] = tmp;
                }
            }
            if(check) break;
            System.out.print("Buoc " + (i+1) + ": ");
            for(int k=0; k<n; k++) System.out.print(arr[k] + " ");
            System.out.println();
        }
    }

}
