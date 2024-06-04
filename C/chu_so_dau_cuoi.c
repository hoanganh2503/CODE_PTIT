#include<stdio.h>
#include<math.h>

int main(){
	long long n;
	scanf("%lld", &n);
    int a;
    int dem=n%10;
    for( ; n>10 ; ){
    	   a=n%10;
		   n/=10; 		
		}

	    printf("%d %d", n, dem);
    
	
	return 0;
}
