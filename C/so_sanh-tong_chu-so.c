#include<stdio.h>
#include<math.h>

long long tongChuSo(long long n){
	int dem=0;
	while(n>0){
		dem+=(n%10);
		n/=10;
	}
	return dem;
}

int main(){
	long long a, b;
	scanf("%lld%lld", &a, &b);
	int x=tongChuSo(a);
	int y=tongChuSo(b);
	    if(x<=y)
	       printf("%lld %lld", a, b);
	    else
	       printf("%lld %lld", b, a);
     
 
	return 0;
}

