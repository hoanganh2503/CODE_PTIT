package Examination.FOLDER.Vananh;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your selection: ");
        switch (sc.nextInt()) {
            case 1:
                sc.nextLine();
                myInteger int1 = new myInteger(sc.nextLine());
                break;
            
            case 2:
                sc.nextLine();
                myInteger int2 = new myInteger(sc.nextLine());
                System.out.println(int2.getMinPosition());
                break;
            
            case 3:
                sc.nextLine();
                myInteger int3 = new myInteger(sc.nextLine());
                System.out.println(int3.getSum());
                break;
            
            case 4:
                sc.nextLine();
                break;
            
            case 5:
                sc.nextLine();
                myString str = new myString(sc.nextLine());
                break;            
            case 6:
                sc.nextLine();
                myString str1 = new myString(sc.nextLine());
                System.out.println(str1.checkName());
                break;
            
            case 7:
                sc.nextLine();
                myString str2 = new myString(sc.nextLine());
                System.out.println(str2.getAge());
                break;
            
            case 8:
                sc.nextLine();
                int n = sc.nextInt();
                int arr[][] = new int[n][n];
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < n; j++)
                        arr[i][j] = sc.nextInt();
                }
                myMatrix matrix = new myMatrix(n, arr);
                break;
            case 9:
                sc.nextLine();
                int n1 = sc.nextInt();
                int arr1[][] = new int[n1][n1];
                for (int i = 0; i < n1; i++){
                    for (int j = 0; j < n1; j++)
                        arr1[i][j] = sc.nextInt();
                }
                myMatrix matrix1 = new myMatrix(n1, arr1);
                System.out.println(matrix1.getEvenRow());
                break;
            
        }
    }
}
