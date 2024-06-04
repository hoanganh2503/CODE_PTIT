#include<stdio.h>
#include<math.h>

int nguyento(long n){
	long i;
	if(n<=1)
	     return 0;
    else
        
        for(i=2; i<=sqrt(n) ; i++){
        	if(n%i==0)
        	   return 0;
		}
		return 1;
}

int main(){
	long x;
	scanf("%ld", &x);
	long i;
	for(i=2; i<=x; i++){
     	if(nguyento(i))
		printf("%d\n", i); 
		 }
	
    

	return 0;
}

