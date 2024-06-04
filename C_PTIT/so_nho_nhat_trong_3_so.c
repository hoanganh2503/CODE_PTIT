#include<stdio.h>
#include<math.h>

int main(){
    long long a, b, c;
    scanf("%lld%lld%lld", &a, &b, &c);
    long long min;
    min =a;
    if(min >= b){
    	int tmp=min;
    	min =b; 
    	b=tmp;
	}
	 if(min >= c){
    	int tmp=min;
    	min =c; 
    	c=tmp;
	}
	
	printf("%d", min);
	
	return 0;
}
