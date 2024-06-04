#include<stdio.h>
#include<math.h>

int  fibo(int n){
	if(n==0)
	   return 0;
	if(n==1||n==2){
		return 1;
	}else
	    return fibo(n-1)+fibo(n-2);
}

int kiemtra(int n){
	int i;
	for(i=1; i<=n ; i++){
		if(fibo(i)==n){
			return 1;
			break;
		}if(fibo(i)>n){
			return 0;
			break;
		}
	}
	return 0;
}


int main(){
		long  a;
		scanf("%ld", &a);
        int i;
        
        for(i=0; i<a ; i++){
		printf("%d ", fibo(i));
	}
        	
	return 0;
}


