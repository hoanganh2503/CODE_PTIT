#include<stdio.h>
#include<math.h>

void nhap(int *arr, long n){
	long i;
	for(i=0 ; i<n ; i++){
		scanf("%ld", &arr[i]);
	}
}

void dichTrai(int *arr, long n, int k){
	long i;
	
	for(i=n ; i<n+k ;i++){
		arr[i]=arr[i-n];
	}

}
void hienthi(int *arr, long n, int k){
	long i;
		for(i=k ; i<n+k ; i++){
		printf("%ld ", arr[i]);
	}
}

int main() {

		 long n;
    scanf("%ld", &n);
    int arr[n];
    nhap(arr, n);
    int k;
    scanf("%d", &k);
	dichTrai(arr, n, k);
    hienthi(arr, n, k);
    
	return 0;
}
