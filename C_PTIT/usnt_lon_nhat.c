#include<stdio.h>
#include<math.h>

long nguyento(long n){
	long i;
		for(i=2 ; i<= sqrt(n) ; i++){
			if(n%i==0){
			   return 0;
			}
		}
		return 1;
		
}
long long function(long long n)
{
 long long  maxPrime;
while(n%2==0)
{ maxPrime=2;
n/=2;
}
long long i;
for(  i=3;i<=sqrt(n);i+=2)
{ while(n%i==0)
n/=i;
maxPrime=i;
}
if(n>1) maxPrime=n;
return maxPrime;
}
int main(){
	int x;
	scanf("%d", &x);
	while(x--){
		long long n;
		scanf("%lld", &n);
		printf("%lld\n", function(n));
	}
    
	return 0;
}





