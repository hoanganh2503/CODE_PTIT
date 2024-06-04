#include<stdio.h>
#include<math.h>

int main(){
	int m, n;
	scanf("%d%d", &m, &n);
    int i, j;
    for(i=1 ; i<= n ; i++){
    	for(j=1 ; j<=m ; j++){
    		if(i==1 || i==n || j==1 || j==m){
    			printf("*");
			}else 
			    printf(" ");
			
		}
		printf("\n");
		
	}
	return 0;
}

