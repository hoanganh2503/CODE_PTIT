#include<stdio.h>
#include<math.h>

void swap(int *a, int *b){
    int tmp = *a;
    *a = *b ;
    *b = tmp;
}
void nhap(int arr[][50], int n, int m){
    int i, j;
    for( i = 0 ; i < n ; i++){
        for(j = 0 ; j < m ; j++){
            scanf("%d", &arr[i][j]);
        }
    }
}
void sx(int arr[][50], int n, int m){
    int i, j, k, l;
     for(i=0;i<n;i++) {
          for(j=0;j<m;j++) {
               for(k=i;k<n;k++) { 
                   for(l=j;l<m;l++) { 
                       if(arr[i][j]>arr[k][l])
                       swap(&arr[i][j], &arr[k][l]);
                   }
               }
          }
     }
    

}
void hienthi(int arr[][50], int n, int m){
    int i, j;
    for( i = 0 ; i < n ; i++){
        for( j = 0 ; j< m ; j++){
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
}

int main(){
    int x;
    int k = 1;
    scanf("%d", &x);
    while(x--){
        int n, m;
        scanf("%d%d", &n, &m);
        int arr[50][50];
        nhap(arr, n, m);
        sx(arr, n, m);
        printf("Test %d:\n", k);
        hienthi(arr, n, m);
        printf("\n");
    }
    return 0;
}
