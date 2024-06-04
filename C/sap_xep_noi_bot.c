#include<stdio.h>
#include<math.h>

void nhap(int *arr, int n){
    int i;
    for( i = 0 ; i< n  ; i++){
        scanf("%d", &arr[i]);
    }
}
void swap(int *a, int *b){
    int tmp = *a;
    *a = *b;
    *b = tmp;
}
void hienthi(int *arr, int n){
    int i;
    for(i = 0 ; i< n ; i++){
        printf("%d ", arr[i]);
    }
}
void thuchien(int *arr, int n){
    int i, j;
    int k = 1;
    for( i =0 ; i <n ;i++){
        int count =0 ;
        for(j = 0 ; j< n-1-i ; j++){
            if(arr[j] > arr[j+1]){
                swap(&arr[j], &arr[j+1]);
                count = 1;
            }
            
        }
        if(count == 1){
            printf("Buoc %d: ", k);
        k++;
        hienthi(arr, n);
        printf("\n");
        }
        

    }
}
int main(){
    int n;
    scanf("%d", &n);
    int arr[100];
    nhap(arr, n);
    thuchien(arr, n);
}