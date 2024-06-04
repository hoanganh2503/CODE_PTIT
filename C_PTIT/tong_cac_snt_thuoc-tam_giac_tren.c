#include <stdio.h> 
#include <math.h>
#define ll long long

void nhap(int arr[][50], int n){
	int i, j;
	for( i = 0 ; i < n ; i++){
		for( j = 0 ; j < n ; j++){
			scanf("%d", &arr[i][j]);
		}
	}
}

long nguyento(long n){
	long i;
	if(n<2)
	return 0;
	else{
		for(i=2 ; i<= sqrt(n) ; i++){
			if(n%i==0){
			   return 0;
			}
		}
		return 1;
	}
		
		
}


int kiemtra(int arr[][50], int n){
	int i, j;
	int a=0;
	int sum=0;
	for(i = 0 ; i < n ; i++){
		for( j = n-1 ; j >=a ; j --){
			if(nguyento(arr[i][j]))
			sum += arr[i][j];
		
		}
	a++;
	}
	return sum;
}


int main() {
	int  n;
	scanf("%d", &n);
	int arr[50][50];
	nhap(arr, n);
	printf("%d", kiemtra(arr, n));

return 0;	
}

