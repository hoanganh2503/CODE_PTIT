#include <stdio.h> 
#define ll long long

void nhap(int arr[][10], int n, int m){
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

int maxhang(int arr[][10], int n, int m){
	int i, j;
	int a, max=0, maxF;
	
	for(j = 0 ; j < m ; j++){
		max+=arr[0][j];
	}
	for(i = 1 ; i < n ; i++){
		maxF=0;
		for(j = 0 ; j < m ;j++){
			maxF+=arr[i][j];
		}
		if(maxF>max){
			max=maxF;
			a=i;
		}
	}
	return a;
}

int maxcot(int arr[][10], int n, int m){
	int i, j;
	int a , max=0, maxF;
	for(i = 0 ; i < n ; i++){
		max+=arr[i][0];
	    }

		for(j = 1 ; j < m ;j++){
			maxF=0;
			for(i = 0 ; i < n ; i++){
			maxF+=arr[i][j];
		}
		if(maxF>max){
			max=maxF;
			a=j;
		}
	}
	
	return a;
}

void xoahang(int arr[][10], int n, int m, int a){
	int i, j;
	for(i = 0 ; i < n ; i++){
		for(j = 0 ; j < m ; j++){
			if(i >= a)
		    swap(&arr[i][j], &arr[i+1][j]);
			}
		}
}

void xoacot(int arr[][10], int n, int m, int a){
	int i, j;
	for(i = 0 ; i < n ; i++){
		for(j = 0 ; j < m ; j++){
			if(j >= a)
		    swap(&arr[i][j], &arr[i][j+1]);
			}
		}
	}

void hienthi(int arr[][10], int n, int m){
	int i, j;
	for(i = 0 ; i  < n ; i++){
		for( j = 0 ; j < m ; j++){
			printf("%d ", arr[i][j]);
		}
		printf("\n");
		
	}
}

int main() {
	int x;
	scanf("%d", &x);
	int a=1;
	while(x--){
		int m, n;
	scanf("%d%d", &n, &m);
	int arr[10][10];
	nhap(arr, n, m);
    int x=maxhang(arr, n, m);
    xoahang(arr, n, m, x);
    int y=maxcot(arr, n-1, m);
    xoacot(arr, n-1, m, y );
    printf("Test %d:\n", a);
    hienthi(arr, n-1, m-1);
    printf("\n");
    a++;
	}
	
	
return 0;	
}

