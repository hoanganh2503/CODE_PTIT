#include<stdio.h>
#include<math.h>

int nhap(int *arr, int n){
	int i;
	for(i=0 ; i<n ; i++){
		scanf("%d", &arr[i]);
	}
}
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
int kiemtra(int *arr, int n){
	int i;
	for(i = 0 ; i< n ; i++){
		if(nguyento(arr[i])){
			printf("%d ", arr[i]);
		}
	}
}



int main() {
	int x;
	scanf("%d", &x);
	while(x--){
	 int n;
    scanf("%d", &n);
    int arr[n];
    nhap(arr, n);
	kiemtra(arr, n);
	printf("\n");	
	}
   

	return 0;
}

