#include <stdio.h> 

void hienthi(int *arr, int n){
	int i;
	for(i = 0 ; i < n ; i++){
		printf("%d ", arr[i]);
	}
}

int main() {
    int n, A[100], min;
	scanf("%d", &n);
	int i, j;
	for( i = 0; i < n; i++) { 
	    scanf("%d", &A[i]);
	 }
	 
	 
	 for( i = 0; i < n-1; i++) {
	 	min = i;
	    for( j = i+1; j < n; j++) {
	    	
		if (A[j] < A[min]){
			min= j;
		   } 
		   
	    }
	    int tmp = A[i];
		   A[i] = A[min]; 
		   A[min] = tmp; 
	 hienthi(A, n);
	   
	  printf("\n");
	}
	
	
}


