#include<stdio.h>
#include<math.h>

int main(){
	long long n;
	scanf("%lld", &n);
	int a;
	int count =0;
    for(;n!=0;){ 
        a= n % 10;
        count++;
        n /= 10; 
        
    } 
	printf("%d", count);

	return 0;

