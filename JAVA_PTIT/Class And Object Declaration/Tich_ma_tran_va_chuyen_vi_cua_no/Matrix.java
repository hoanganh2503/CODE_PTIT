package Tich_ma_tran_va_chuyen_vi_cua_no;
import java.util.*;
public class Matrix {
    private int n, m;
    private int arr[][] = new int[101][101];

    public Matrix(int n, int m){
        this.n = n;
        this.m = m;
    }

    public void nextMatrix(Scanner sc) {
        for(int i=0; i<this.n; i++) {
            for(int j=0; j<this.m; j++) {
                this.arr[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix trans(){
        return new Matrix(this.n, this.m);
    }

    public String mul(Matrix B){
        String s = "";
        for(int i = 0; i <n ; i++){
            for(int j = 0 ; j < n ; j++){
                int temp = 0;
                for(int l = 0; l < m ; l++){
                    temp += arr[i][l]*arr[j][l];
                }
                s+= temp +" ";
            }
            s += '\n';
        }
        return s;
    }
}