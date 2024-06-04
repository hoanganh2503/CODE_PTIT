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
		if(arr[i]==arr[i-1])
		count++;
	}
	printf("%d ", count);
}


int main() {
	int x;
	scanf("%d", &x);
	while(x--){
		 int n;
    scanf("%d", &n);
    int arr[n];
    nhap(arr, n);
    dem(arr, n);
    printf("\n");
	}
   
    
	return 0;
}
