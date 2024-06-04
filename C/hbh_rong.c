#include<stdio.h>
#include<math.h>

int main(){
    int n;
    scanf("%d", &n);
	    int i, j;
	    int m ;
	    m=n-1;
    for(i=1 ; i<=n ;i++){
    	for(j=1 ; j<= m+n ; j++){
    		if(j<=m){
    			printf("~");
			}
			else if(i==1||i==n|| j==m+1||j==m+n){
				printf("*");
			}else
			   printf(".");
    	
		}
		printf("\n");
			m--;
	}
	
	return 0;
}

