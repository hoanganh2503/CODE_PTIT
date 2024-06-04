#include<stdio.h>

void nhap(int arr[][50], int n, int m){
     int i, j;
     for(i = 1 ; i <= n ; i++){
         for(j = 1 ; j <= m ; j++)
         scanf("%d", &arr[i][j]);
     }
}

void sx(int arr[][50], int n, int m){
    int i;
    int a[1000];
    int d = 1;
    int k = 0;
    int hang = n;
    int cot = m;
    while(k < m*n){
    for(i = d ; i <= cot ; i ++){
    	a[k] = arr[d][i];
    	k++;
    	
	}
        
    for(i = d+1 ; i <= hang ; i++){
    	a[k] = arr[i][cot];
    	k++;
	}
        
    for(i = cot -1 ; i >= d ; i--){
    	a[k] = arr[hang][i];
    	k++;
	}
        
    for(i = hang-1 ; i >= d+1 ; i--){
    	a[k] =  arr[i][d];
    	k++;
	}
    
    d++;
    hang --;
    cot --;
    }
    for(i = 0 ; i < m*n; i++)
    printf("%d ", a[i]);
}

int main(){
    int x;
    scanf("%d", &x);
    while(x--){
        int n, m;
        scanf("%d%d", &n, &m);
        int arr[50][50] ;
        nhap(arr, n, m);
    	sx(arr, n, m);
        printf("\n");
    }
    return 0;
}  			
