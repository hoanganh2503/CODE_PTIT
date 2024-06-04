#include<stdio.h>
#include<math.h>


long soHoanHao(long n){
	int m=n;
    int i;
    int dem=0;
    for(i=1 ; i< n ; i++){
    	if(n%i==0){
           dem += i;    		
		}
	}
	if(m==dem)
	    return 1;
	else
	    return 0;
}

int main(){
		long  a, b;
		scanf("%ld%ld", &a, &b);
		if(a>b){
			long tmp=a;
			a=b;
			b=tmp;
		}
		long j;
		for(j=a ; j<= b ; j++){
			if(soHoanHao(j)==1){
        	printf("%ld ", j);
		}
	}	
	return 0;
}

