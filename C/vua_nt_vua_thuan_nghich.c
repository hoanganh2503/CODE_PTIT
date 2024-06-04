#include<stdio.h>
#include<math.h>

long nguyento(long n){
	long i;
	int count =0;
		for(i=2 ; i<= sqrt(n) ; i++){
			if(n%i==0)
				return 0;
		}
		  return 1;
    }

long thuannghich(long n){
	int a;
	long k=n;
	long l=0;
	while(n>0){
		  a=n%10;
		  l=10*l+a;
		  n/=10;
	}
	if(l==k)
	   return 1;
	else
	return 0;
}

int main(){
	int x;
	scanf("%d", &x);
	int i;
	for(i=1; i<= x ; i++){
		long  a, b;
		scanf("%ld%ld", &a, &b);
		long j;
					int v=0;
		for(j=a ; j<= b ; j++){
			if(thuannghich(j)==1&&nguyento(j)==1){
        	printf("%ld ", j);
        	v++;
        	if(v==10){
               printf("\n");v=0;
			}
		}
        
	}
	    printf("\n");
	}
	
	return 0;
}

