#include<stdio.h>
#include<math.h>

void nhap(int *arr, int n){
	 int i; 
	 for(i = 0 ;i < n ; i++){
	 	scanf("%d", &arr[i]);
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

int main(){
	
		int n;
		scanf("%d", &n);
		int arr[101];
		nhap(arr, n);
		xapxep(arr, n);
		int i; 
		for(i = 0 ; i < n ; i++){
			if(arr[i]%2==0)
			printf("%d ", arr[i]);
		}
		for(i = 0 ; i < n ; i++){
			if(arr[i]%2!=0)
			printf("%d ", arr[i]);
		}
	
    
	return 0;
}

