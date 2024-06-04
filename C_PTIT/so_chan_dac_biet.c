#include<stdio.h>
#include<math.h>

long long tongChuSo(long long n){
	int a;
	while(n>0){
		a=(n%10);
		if(a%2==1)
		   return 0;
		n/=10;
	}
	return 1;
}

int main(){
	int x;
	scanf("%d", &x);
	int i;
	for(i=1; i<=x ; i++){
		long long a;
	scanf("%lld", &a);
	if(tongChuSo(a))
	   printf("YES\n");
	else
	   printf("NO\n");
	}
	
	return 0;
	
}

