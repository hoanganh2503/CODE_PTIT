#include<stdio.h>
#include<math.h>

int main(){
    int n;
    scanf("%d", &n);
	    int i, j;
	    int a=1;
    for(i=1 ; i<=n ;i++){
    	for(j=1 ; j<= a ; j++){
    		if(i==1||i==n||j==1||j==a){
    			printf("*");
			}else
    		printf(".");
    	
		}
		printf("\n");
			a++;
	}
	
	return 0;
}

