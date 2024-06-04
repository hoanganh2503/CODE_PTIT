#include <stdio.h> 
#define ll long long

void nhap(int *arr, long n){
	long i;
	for( i = 0 ; i < n ; i++){
		scanf("%lld", &arr[i]);
	}
}

int  ktd(int *arr, long n){
	long  i;
	long max=arr[0];
	for(i = 0 ; i < n ; i++){
		if(arr[i]>max)
		max=arr[i];
	}
	return max;

}

ll kiemtra(int *arr, long  n){
	long i, j;
	int a=ktd(arr,n);
		if(a<0)
		return a;
		else{
				ll sum =0;
				ll res = arr[0];
	    for(i = 0 ; i < n ; i++){
	          if(sum+arr[i]<0){
	          	sum=0;
	          	continue;
			  }
			  sum+=arr[i];
			  if(res<sum)
			  res=sum;
	
		}
	return res;
}
}

int main() {
	int x;
	scanf("%d", &x);
	while(x--){
		long n;
		int arr[100001];
		scanf("%ld", &n);
		nhap(arr, n);
		printf("%ld", kiemtra(arr, n));
		
		printf("\n");
	}
	
return 0;	
}




