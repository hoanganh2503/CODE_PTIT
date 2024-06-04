#include<stdio.h>
#include<math.h>

long long ucln(long long a, long long b){
	if(b==0)
	   return a;
	else 
	       return ucln(b, a%b);
}

long long bcnn(long long a, long long b){
	return (a*b)/ucln(a, b);
}
int main(){
	long long a, b;
	scanf("%lld%lld", &a, &b);
	long long x, y;
	x=ucln(a, b);
	y=bcnn(a, b);
	printf("%lld\n%lld", x, y);
	
	return 0;
}
