#include<stdio.h>

int nhap(int *arr, int n){
	int i;
		for(i=0 ; i<n; i++){
		scanf("%d", &arr[i]);
	}
}

int min(int *arr, int n ){
	int min=arr[0];
	int i;
	for(i=0; i < n ; i++){
		if(arr[i]>min)
		  min=arr[i];
	}
	return min;
}

int max(int *arr, int n ){
	int max=arr[0];
	int i;
	for(i=0; i < n ; i++){
		if(arr[i]<max)
		  max=arr[i];
	}
	return max;
}
int min2(int *arr, int n ){
	int min2=max(arr, n);
	int i;
	int a=min(arr, n);
	for(i=0; i < n ; i++)
	if(arr[i]!=a){
		
		if(arr[i]>min2)
		  min2=arr[i];
	}
	
	return min2;
}


 int main() { 
     int n;
	  int arr[1000];
	   scanf("%d",&n);
	    nhap(arr, n);
	    printf("%d %d", min(arr, n), min2(arr, n));
		return 0;
}


