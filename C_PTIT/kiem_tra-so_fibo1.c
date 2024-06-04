#include<stdio.h>
#include<math.h>

int  fibo(int n){
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
			printf("%d ", kiemtra(a));
        	
	return 0;
}


