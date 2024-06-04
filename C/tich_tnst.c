#include<stdio.h>

int chuaXH(int *b, int n, int x){
	int i;
	for(i=0 ; i < n ; i++){
		if(b[i]==x)
		return 0;
	}
	return 1;
}
int tich(int *b, int n){
	int i; 
	int sum=1;
	for(i=0 ; i< n; i++){
		sum*=b[i];
	}
	return sum;
}

int main() { 
int x;
scanf("%d", &x);
    while(x--){
    		int n;
	scanf("%d", &n);
	int i=2;
	int j=0;
	int b[1000];
	
	while(n>1){
		if(n%i==0){
			if(chuaXH(b, j, i)){
			b[j]=i;
			j++;	
			}
			n/=i;
		}else
		 i++;
	}
	printf("%d\n", tich(b, j));
	}

	
	return 0;
}

