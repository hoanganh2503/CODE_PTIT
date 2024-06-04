#include<stdio.h>
#include<math.h>


int kiemtra(int *arr , int n){
	int i;
	int count=1;
	int a=arr[0];
	for(i=1; i < n ; i++){
		if(arr[i]>a){
			a=arr[i];
			count++;
		}
		
	}
	return count;
}
int nhap(int *arr, int n){
	int i;
		for(i=0 ; i<n; i++){
		scanf("%d", &arr[i]);
	}
}

 int main() { 
 int x;
 scanf("%d", &x);
 while(x--){
 	int n;
	  int arr[1000];
	   scanf("%d",&n);
	    nhap(arr, n);
	    printf("%d\n", kiemtra(arr, n));
 }
     
		return 0;
}

