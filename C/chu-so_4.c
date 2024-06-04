#include<stdio.h>
#include<math.h>

long thuannghich(long n){
	int a;
	long k=n;
	long l=0;
	while(n>0){
		  a=n%10;
		  l=10*l+a;
		  n/=10;
	}
	if(l==k)
	   return 1;
	else
	return 0;
}

int tongChuSo(long n){
	int sum=0;
	while(n>0){
		sum+=n%10;
		if(n%10==4){
			return -1;
			break;
		}
		n/=10;
	}
	return sum;
}


int main(){
	int x;
	scanf("%d", &x);
	while(x--){
	int a;
	scanf("%d", &a);
	int b=pow(10, a-1);
	int c=pow(10, a);
	int i, k;
	for(i=b; i<c ; i++){
		k=tongChuSo(i);
		if((k%10==0) && thuannghich(i))
		printf("%d ", i);
	}
	printf("\n");
	}
    
	return 0;
}


