#include <stdio.h> 
#include <math.h>
#define ll long long


int nhap1(int b[][100], int n){
	int i, j;
	for(i = 1 ; i <= n ; i++){
		for(j = 1 ; j <= 2 ; j++){
			scanf("%ld", &b[i][j]);
		}
	}
}
int tang(ll arr[][1000], long m, long n){
	long i, j;
	for(i = 1 ; i <= m ; i++){
		for( j = 1 ; j <= n; j++){
			arr[i][j]++;
		}
	}
}
int gan(int b[][100], ll arr[][1000], int n ){
	int i;
	for(i = 1 ; i <= n ; i++){
			tang(arr, b[i][1], b[i][2]);
		
	}
}
int max(int arr[][100],  int n){
	int max = arr[1][1];
	int i, j;
	for(i = 1 ; i <= n ; i++){
		for( j = 1 ; j <= 2 ; j++){
			if(arr[i][j] > max)
			max = arr[i][j];
		}
	}
	return max;
}
int hienthi(ll arr[][1000], int b[][100], int n){
	long i, j;
	long k= arr[1][1];
	int count = 0;
	for(i = 1 ; i<= max(b, n) ; i++){
		for( j = 1; j <= max(b, n) ; j++){
        if(arr[i][j] == k)
		count ++;
	    }
		
	}
	return count;
}



int main() {
	int n;
	scanf("%d", &n);
	ll arr[1000][1000];
	int b[100][100];
	nhap1(b, n);
    gan(b, arr, n);
	int x = hienthi(arr, b,  max(b, n));
     printf("%d\n", x);

return 0;	
}
