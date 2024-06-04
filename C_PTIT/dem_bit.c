#include<stdio.h>
#include<math.h>

void chen(int *arr, int n, int x, int y, int z){
    int i;
    for( i = x+3 ; i < n ; i++){
         arr[i] = arr[i - 2];
    }
    arr[x]= y;
    arr[x+1] = z;
    arr[x+2] = y;
}
void hienthi(int *arr, int n){
    int i;
    for( i=0 ; i< n ; i++){
        printf("%d ", arr[i]);
    }
}
void tach(int *arr, int n, int a){
    int y, z;
    int b = a;
    int i;
    for(i = a-1 ; i >= 0 ; i--){
        if(arr[i] > 1){
            y = arr[i]/2;
            z = arr[i]%2;
            b+=2;
            chen(arr, b, i, y, z);
            
            //continue;
        }

    }
    hienthi(arr, b);
            printf("\n");
}



int main(){
    int x;
    scanf("%d", &x);
    while (x--){
        int arr[1000];
        int n, l, r;
        scanf("%d%d%d", &n, &l, &r);
        int a = 1;
        arr[0]= n;
        int i;
        
        while(arr[0]>1){
            tach(arr, n, a);
            a+=2;
        }
        hienthi(arr, a);
    
    /*int count = 0;
    int i;
    for(i = l-1 ; i < r ; i++){
        if(arr[i]==1){
            count++;
        }
    }
    printf("%d", count);*/
    printf("\n");
    }
    return 0;
}