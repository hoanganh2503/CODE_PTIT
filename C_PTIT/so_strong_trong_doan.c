#include<stdio.h>
#include<math.h>

int  gt(int a){
	if(a==1||a==0){
		return 1;
	}else
	    return a*gt(a-1);
}


int kiemtra(int a){
	int x, y=0;
	int l=a;
	while(a>0){
			x=a%10;
			y+= gt(x);
			a/=10;
	}
	if(y==l)
	   return 1;
	else
	   return 0;
}



int main(){
		long  x, y;
		scanf("%ld%ld", &x, &y);
		if(x>y){
			long tmp=x; 
			x=y;
			y=tmp;
		}
		long j;
		for(j=x ; j<= y; j++){
		   	
			if(kiemtra(j))
			printf("%ld ", j);
        	
	    }
	return 0;
}


