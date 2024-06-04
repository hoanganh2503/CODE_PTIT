#include<stdio.h>
#include<math.h>

int main(){
	int v;
	scanf("%d", &v);
 
	int i;
	for(i=1 ; i <= v ; i++){
		long long n;
			int sum=0; 
        	int a;
		scanf("%lld", &n);
		for(;n!=0;){ 
        a = n % 10;
        sum += a; 
        n /= 10; 
        
        } 
    printf("%d\n", sum); 
	}

	return 0;
}
