#include<stdio.h>
#include<math.h>

long thuannghich(long long n){
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

int tongChuSo(long long n){
	int sum=0;
	while(n>0){
		sum+=n%10;
		n/=10;
	}
	return sum;
}

int kiemTra(long long n){
	while(n>0){
		if((n%10)%2==0){
			return 0;
			break;
		}
		n/=10;
	}
	return 1;
}

int main(){
	int x;
	scanf("%d", &x);
	int i;
	while(x--){
		long long n;
		scanf("%lld", &n);
		if(kiemTra(n) && thuannghich(n)&& (tongChuSo(n)%2==1) ){
				printf("YES\n");
		}else
		    printf("NO\n");
			}
	
	return 0;
}
