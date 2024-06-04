#include <stdio.h> 
#include <math.h>
#define ll long long

void nhap(int arr[][50], int n){
	int i, j;
	int a = 0;
	for( i = 0 ; i < n ; i++){
		int x=1;
		for( j = 0 ; j < n ; j++){
			if(j <= a){
			arr[i][j] = x;	
			x++;
			}
			
			else
			arr[i][j] = 0;
		}
		a++;
	}
}

void chuyenvi(int arr[][50], int b[][50], int n){
	int i, j;
	for( i = 0 ; i < n ; i++){
		for( j = 0; j < n ; j++){
			b[i][j] = arr[j][i];
		}
	}
}

void nhan(int arr[][50], int b[][50], int c[][50], int n){
	int i, j, k;
	int sum = 0;
	for(i = 0 ; i < n ; i++){
		for(j = 0 ; j < n  ;j++){
			sum=0;
         for (k = 0; k <n;  k++) {
          sum  += arr[i][k] * b[k][j];
         }
         c[i][j]=sum;
		}
	}
}

void hienthi(int arr[][50], int n){
	int i, j;
	for(i = 0 ; i  < n ; i++){
		for( j = 0 ; j < n ; j++){
			printf("%ld ", arr[i][j]);
		}
		printf("\n");
		
	}
}


int main() {
	int x;
	int z=1;
	scanf("%d", &x);
	while(x--){
	int  n;
	scanf("%d", &n);
	int arr[50][50];
	int b[50][50], c[50][50];
	nhap(arr, n);
	chuyenvi(arr, b, n);
	nhan(arr, b, c, n);
	printf("Test %d:\n", z);
    hienthi(c, n);
    printf("\n");
    z++;
	}

return 0;	
}


