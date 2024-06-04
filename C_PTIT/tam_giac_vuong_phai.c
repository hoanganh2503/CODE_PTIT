#include<stdio.h>
#include<math.h>

int main(){
    int n;
    scanf("%d", &n);
	    int i, j;
	    int a=0;
    for(i=1 ; i<=n ;i++){
    	for(j=1 ; j<= n ; j++){
    		if(j < n-a){
    			printf("~");
			}else
    		printf("*");
    	
		}
		printf("\n");
			a++;
	}
	
	return 0;
}

