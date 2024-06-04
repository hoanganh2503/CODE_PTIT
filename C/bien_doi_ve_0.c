#include<math.h>
#include<stdio.h>

void nhap(int arr[][50], int n){
    int i, j;
    for( i = 1 ;i <= n ; i++){
        for(j = 1 ; j <= n ; j++){
            scanf("%d", &arr[i][j]);
        }
    }
}
void swap(int arr[][50], int m, int n){
    int i , j;
    for(i = 1; i <= m ; i++){
        for(j = 1 ; j <= n  ; j++){
            if(arr[i][j] == 1)
            arr[i][j] = 0;
            else
            arr[i][j] = 1;
        }
    }
}

void hienthi(int arr[][50], int n){
    int i, j;
    for( i = 1 ; i <= n ; i++){
        for(j = 1 ; j <= n ; j++)
        printf("%d ", arr[i][j]);
        printf("\n");
    }
}

int main(){
    int n;
    scanf("%d", &n);
    int arr[50][50];
    nhap(arr, n);
    swap(arr, n, n);
    hienthi(arr, n);

return 0;
}