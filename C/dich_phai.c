#include<stdio.h>
#include<math.h>

void nhap(int *arr, long n){
	long i;
	for(i=0 ; i<n ; i++){
		scanf("%ld", &arr[i]);
	}
}

void dichPhai(int *arr, long n, int k){
	while(k>0){
		int tam=arr[n-1];
		long i;
		for(i=n-1 ; i>0 ;i--){
			arr[i]=arr[i-1];
		}
		arr[0]=tam;
		k--;
	}
    

}
void hienthi(int *arr, long n){
	long i;
		for(i=0 ; i<n ; i++){
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
	dichPhai(arr, n, k);
    hienthi(arr, n);
    
	return 0;
}

