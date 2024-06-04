#include <stdio.h> 
#include <math.h>
#define ll long long

void nhap(int arr[][100]){
	int i, j;
	for( i = 1 ; i <= 100 ; i++){
		for(j = 1 ; j <= 100 ; j++){
		arr[i][j]  = 0;	
		}
		
	}
}
int nhap1(int b[][100], int n){
	int i, j;
	for(i = 1 ; i <= n ; i++){
		for(j = 1 ; j <= 2 ; j++){
			scanf("%d", &b[i][j]);
		}
	}
}
int tang(int arr[][100], int b[][100], int n){
	int i, j, k = 1, h = 1;
	for(i = 1 ; i < b[k][h] ; i++){
		for( j = 1 ; j < b[k][h+1]; j++){
			arr[i][j]++;
		}
		k++;
		h=1;
	}
}
int max(int arr[][100], int n){
	int max = arr[1][1];
	int i, j;
	for(i = 1 ; i <= n ; i++){
		for( j = 1 ; j <=2 ; j++){
			if(arr[i][j] > max)
			max = arr[i][j];
		}
	}
	return max;
}
void hienthi(int arr[][100], int n){
	int i, j;
	for(i = 1 ; i<= n ; i++){
		for( j = 1; j <= n ; j++){
        printf("%d ", arr[i][j]);
	    }
		printf("\n");
	}
}



int main() {
	int n;
	scanf("%d", &n);
	int arr[100][100];
	int b[100][100];
	nhap(arr);
	//nhap1(b, n);
	//tang(arr, b, n);
	hienthi(arr, 5);
	

return 0;	
}
