#include <stdio.h> 
#define ll long long

void nhap(int arr[][50], int n, int m){
	int i, j;
	for( i = 0 ; i < n ; i++){
		for( j = 0 ; j < m ; j++){
			scanf("%d", &arr[i][j]);
		}
	}
}

void swap(int *a, int *b)
{
	int x = *a;
	*a = *b;
	*b = x;
}

void doi(int arr[][50], int a, int b, int n, int m){
	int i, j;
	for(i = 0 ; i < n ; i++){
		for(j = 0 ; j < m ; j++){
			if(j==a-1){
				swap(&arr[i][j], &arr[i][b-1]);
			}
		}
	}
}

void hienthi(int arr[][50], int n, int m){
	int i, j;
	for(i = 0 ; i  < n ; i++){
		for( j = 0 ; j < m ; j++){
			printf("%d ", arr[i][j]);
		}
		printf("\n");
		
	}
}

int main() {
	int m, n;
	scanf("%d%d", &n, &m);
	int arr[50][50];
	nhap(arr, n, m);
	int a, b;
	scanf("%d%d", &a, &b);
	doi(arr, a, b, n, m);
	hienthi(arr, n, m);
	
return 0;	
}

