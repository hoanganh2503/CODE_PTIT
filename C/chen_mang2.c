#include<stdio.h> 

void nhap(int *a, int n){
	int i;
	for(i=0 ; i<n ; i++){
		scanf("%d", &a[i]);
	}
}

void hienthi(int *a, int n){
	int i;
		for(i=0 ; i< n ; i++){
		printf("%d ",a[i]);
	}
}

void chen(int *a, int n, int *b, int m, int k){
	int i;
	for(i=m+n-1 ; i >=k ; i--){
		a[i]=a[i-m];
	}
	for(i=k ; i<k+m ;i++){
		a[i]=b[i-k];
	}
}
 
 
int main() {  
    int x;
    scanf("%d", &x);
    int y=x;
    while(x--){
    	 int n, m, k;
   scanf("%d%d%d", &n, &m, &k);
   int a[1000];
   int b[1000]; 
   nhap(a, n);
   nhap(b, m);
   printf("Test %d:\n", y-x);
   chen(a, n, b, m, k);
   hienthi(a ,m+n);
   printf("\n");
	}
  
   
   return 0; 
}

