#include<stdio.h>



int main() { 
	int n;
	scanf("%d", &n);
	int i=2;
	while(n>1){
		if(n%i==0){
			if(n!=i)
			printf("%dx", i);
			 else{
				printf("%d", i);
			}
			n/=i;
		}else
		 i++;
	}
	
	return 0;
}
