#include<stdio.h>

int nhap(int *arr, int n){
	int i;
		for(i=0 ; i<n; i++){
		scanf("%d", &arr[i]);
	}
}
void xapsep(int *arr, int n){
	int i, j;
	for(i=0 ; i<n ; i++){
		for(j=n-1 ; j>i ;j--){
			if(arr[j]<arr[j-1]){
				int tmp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=tmp;
			}
		}
	}
}
void hienthi(int *arr, int n){
	int i;
	for(i=0 ; i<n ; i++){
		printf("%d ", arr[i]);
	}
}

 int main() { 
     int n;
	  int arr[1000];
	   scanf("%d",&n);
	    nhap(arr, n);
        xapsep(arr, n);
        hienthi(arr, n);
		return 0;
}


