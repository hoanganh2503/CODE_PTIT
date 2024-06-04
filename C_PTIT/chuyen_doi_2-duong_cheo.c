#include <stdio.h> 
#define ll long long

void nhap(int arr[][50], int n){
	int i, j;
	for( i = 0 ; i < n ; i++){
		for( j = 0 ; j < n ; j++){
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


void kiemtra(int arr[][50], int n){
	int i, j;
	int a=0;
	for(i = 0 ; i < n ; i++){
		for( j = 0 ; j < n ; j ++){
			if(i == a && j == a)
			swap(&arr[i][j], &arr[i][n-1-j]);
		
		}
	a++;
	}
}
void hienthi(int arr[][50], int n){
	int i, j;
	for(i = 0 ; i  < n ; i++){
		for( j = 0 ; j < n ; j++){
			printf("%d ", arr[i][j]);
		}
		printf("\n");
		
	}
}

int main() {
	int  n;
	scanf("%d", &n);
	int arr[50][50];
	nhap(arr, n);
	kiemtra(arr, n);
	hienthi(arr, n);
   
	
	
return 0;	
}

