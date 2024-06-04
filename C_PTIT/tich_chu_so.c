#include<stdio.h>
#include<math.h>

int main(){

		long long n;
			int sum=1; 
        	int a;
		scanf("%lld", &n);
		for(;n!=0;){ 
        a = n % 10;
        sum *= a; 
        n /= 10; 
        
        } 
    printf("%d\n", sum); 
	

	return 0;
}
