#include<stdio.h>
#include<math.h>

int main(){
	long long n;
	scanf("%lld", &n);
	int m=n;
    int i;
    int dem=0;
    for(i=1 ; i< n ; i++){
    	if(n%i==0){
           dem += i;    		
		}
	}
	if(m==dem)
	    printf("1");
	else
	    printf("0");
    
	
	return 0;
}
