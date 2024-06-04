#include<stdio.h>
#include<math.h>

int main(){
    int n, m;
    scanf("%d%d", &n, &m);
	    int i, j;
	    int a=0;
    for(i=1 ; i<=n ;i++){
    	for(j=1 ; j<= m+a ; j++){
    		if(j<=a){
    			printf("~");
			}
			else if(i==1 || i==n || j==a+1|| j==m+a){
				printf("*");
			}else
			   printf(".");
    	
		}
		printf("\n");
			a++;
	}
	
	return 0;
}

