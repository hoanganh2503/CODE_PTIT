#include <stdio.h> 

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

int main() {
    int n, A[100], min;
	scanf("%d", &n);
	int i, j;
	for( i = 0; i < n; i++) { 
	    scanf("%d", &A[i]);
	 }
	 
	int a=1; 
	 for( i = 0; i < n; i++) {	
	 
	xapxep(A, i+1);
	printf("Buoc %d: ", i);
	         hienthi(A, i+1);
     if(a<n-1)
     a++;
	    printf("\n"); 
	  
	}
	
	
}

