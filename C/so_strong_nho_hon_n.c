#include<stdio.h>
#include<math.h>

int  gt(int n){
	if(n==1||n==0){
		return 1;
	}else
	    return n*gt(n-1);
}

int kiemtra(int n){
	int x, y=0;
	int l=n;
	while(n>0){
			x=n%10;
			y+= gt(x);
			n/=10;
	}
	if(y==l)
	   return 1;
	else
	   return 0;
}


int main(){
		long  a;
		scanf("%ld", &a);
	
		long j;
		for(j=1 ; j<= a ; j++){
		   	
			if(kiemtra(j))
			printf("%ld ", j);
        	
	    }
	return 0;
}


