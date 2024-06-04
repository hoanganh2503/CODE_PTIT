#include<stdio.h>
#include<math.h>

int arr[2000000] = {};
int main() {
    int n, max = -99999;
    long long tong = 0;
    scanf("%d",&n);
    int a[n];
    int i, j;
    for( i=0;i<=n - 1;i++) {
        scanf("%d",&a[i]);
        if(a[i] > max) 
        max = a[i];
        } 
        arr[0] = arr[1] = 1; 
        for(i=2;i<=sqrt(max);i++) 
        if(!arr[i]) 
        for(j = i * i; j <= max; j += i) 
        if(!arr[j]) arr[j] = i; for( i=2;i<=max;i++) 
        if(!arr[i]) arr[i] = i; for(i=0;i<=n-1;i++)
        { int x = a[i];
        while(x != 1) 
        { tong += arr[x];
        x /= arr[x];
        } 
            
        } 
        printf("%lld",tong);
        return 0; 
    
}
