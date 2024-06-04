#include <stdio.h> 

void nhap(int *arr, int n){
	int i; 
	for(i =  0  ; i  <  n ; i ++){
		scanf("%d", &arr[i]);
	}
}

void hienthi(int *arr, int n){
	int i;
	for(i = 0 ; i < n ; i++){
		printf("%d ", arr[i]);
	}
}
void xapxep( int *arr, int n){
	int i, j;
	for( i = 0 ; i < n ; i++){
		for(j=n-1 ; j > i ; j--){
			if(arr[j]<arr[j-1]){
				int tmp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = tmp;
			}
		}
	}
}

void xapxep1( int *arr, int n){
	int i, j;
	for( i = 0 ; i < n ; i++){
		for(j=n-1 ; j > i ; j--){
			if(arr[j]>arr[j-1]){
				int tmp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = tmp;
			}
		}
	}
}

int main() {
	int x;
	int f=1;
	scanf("%d", &x);
	while(x--){
		int n, a[100], b[100], c[201];
	scanf("%d", &n);
	nhap(a, n);
	nhap(b, n);
	xapxep(a, n);
	xapxep1(b, n);
	int i;
	for(i=0 ; i< 2*n ; i++){
		if(i%2==0)
		  c[i]=a[i/2];
		else
		  c[i]=b[(i-1)/2];
	}
	printf("Test %d:\n", f);	
		
		hienthi(c, 2*n);
		printf("\n");
		f+=1;
	}
    

	  
	
	
return 0;	
}

