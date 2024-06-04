#include<stdio.h>
#include<math.h>
long nguyento(long n){
	if(n<=1)
	   return 0;
	else{
		long i;
		for(i=2 ; i<= sqrt(n) ; i++){
			if(n%i==0){
			   return 0;
			}
		}
		return 1;
	}
	
		
} 

int nhap(int *arr, int n){
	int i;
	for(i=0 ; i<n ; i++){
		scanf("%d", &arr[i]);
	}
}

int dem(int *arr, int n){
	int i;
	int count=0;
	for(i=0 ; i<n ; i++){
		if(nguyento(arr[i]))
		count++;
	}
	printf("%d ", count);
}
int lietke(int *arr, int n){
	int i;
	for(i=0 ; i< n ; i++){
		if(nguyento(arr[i]))
		   printf("%d ", arr[i]);
	}
}


int main() {
    int n;
    scanf("%d", &n);
    int arr[n];
    nhap(arr, n);
    dem(arr, n);
    lietke(arr, n);
    
	return 0;
}

