#include<stdio.h>
#include<math.h>

int gt(int n){
	if(n==0|| n==1)
	   return 1;
	else
	   return n*gt(n-1);
}

int main(){
	long long n;
	scanf("%lld", &n);
	long long m;
	m=n;
    int a;
    int dem=0;
    for( ; n>0 ; ){
    	   a=n%10;
           dem += gt(a);   
		   n/=10; 		
		}
	if(m==dem)
	    printf("1");
	else
	    printf("%d", 0);
    
	
	return 0;
}

