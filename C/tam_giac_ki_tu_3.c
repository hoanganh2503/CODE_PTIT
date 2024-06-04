#include<stdio.h>
#include<math.h>


int main(){
    int n;
    scanf("%d", &n);
    int i, j;
    int k=1;

    for(i=1 ; i <= n ; i++){
    	int m=0;
    	for(j = 1 ; j <= 2*n-1 ; j++){
    		
    	if(j<=k){
        printf("%c ", 64+i+m);
        m=m+n-j;

		}else
		   printf(" ");
	
		}
		k++;
		printf("\n");
	}
	
	return 0;
}





