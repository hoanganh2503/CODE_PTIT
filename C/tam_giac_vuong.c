#include<stdio.h>
#include<math.h>
#define ll long long

void nhap(int *arr, int n){
    int i;
    for( i = 0 ; i < n ; i++){
        scanf("%d", &arr[i]);
    }
}



int main(){
    int x;
    scanf("%d", &x);
    while(x--){
        int n ;
        scanf("%d", &n);
        int arr[n+1];
        nhap(arr, n);

    }
    return 0;
}
