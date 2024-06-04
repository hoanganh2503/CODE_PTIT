#include<stdio.h>
#include<math.h>

int main(){
    long long n;
    scanf("%lld", &n);
    int a; 
    int le=0, chan=0;
    
    for( ;n>0; ){
    	a=n%10;
    	if(a%2==0){
    		chan++;
		}
		else
		   le++;
		   
		   n/=10;
    	
	}
	printf("%d %d", le, chan);
	return 0;
}

