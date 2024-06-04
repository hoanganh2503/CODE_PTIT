package Examination.FOLDER.Vananh;

public class myMatrix {
    public int arr[][], n;

    public myMatrix(int n, int arr[][]) {
        this.n = n;
        this.arr = arr;
    }

    public int getEvenRow() {
        int cnt = 0;
        for(int i = 0; i < this.n ; i++){
            boolean ok = true;
            for(int j = 0; j < n ; j++){
                if(this.arr[i][j] % 2 == 1) ok = false;
            }
            if(ok) cnt ++;
        }
        return cnt;
    }
}
