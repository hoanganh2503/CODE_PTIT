#include<stdio.h>
#include<math.h>

int check(int *arr, int n){
    int i, j;
    for(i = 0 ; i < n ; i++){
        for( j = i+1 ; j< n ; j++){
            if(arr[i] == arr[j]){
                return arr[i];
                break;
            }
        }
    }
    return 0;
}

int main(){
    int x;
    scanf("%d", &x);
    while(x--){
        int n;
        scanf("%d", &n);
        int arr[n+10];
        int i;
        for( i = 0 ; i < n ; i++){
            scanf("%ld", &arr[i]);
        }
        long k = check(arr, n);
        if(k>0)
        printf("%ld\n", k);
        else
        printf("NO\n");
    }
    return 0;
}