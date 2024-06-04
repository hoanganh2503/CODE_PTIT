#include<stdio.h> 

void chen(int *a, int n, int *b, int m, int k){
	int i;
	for(i=m+n-1 ; i >=k ; i--){
		a[i]=a[i-m];
	}
	for(i=k ; i<k+m ;i++){
		a[i]=b[i-k];
	}
}
 

void hienthi(int *a, int n){
	int i;
		for(i=0 ; i< n ; i++){
		printf("%d ",a[i]);
	}
}

void nhap(int *a, int n){
	int i;
	for(i=0 ; i<n ; i++){
		scanf("%d", &a[i]);
	}
}


 
int main() {  
   int n, m;
   scanf("%d%d", &n, &m);
   int a[1000];
   int b[1000]; 
   nhap(a, n);
   nhap(b, m);
   int k;
   scanf("%d", &k);
   chen(a, n, b, m, k);
   hienthi(a ,m+n);
   
   return 0; 
}

