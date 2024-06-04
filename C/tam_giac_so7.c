#include<stdio.h>
#include<math.h>
int main(){
	  int i, j;
    int k=1;
    int n;
    scanf("%d", &n);
    for(i=1 ; i <= n ; i++){
    	int m=0;
    	for(j = 1 ; j <= 2*n-1 ; j++){
    		
    	if(j<=k){
        printf("%d ", i+m);
        m=m+n-j;

		}else
		   printf(" ");
	
		}
		k++;
		printf("\n");
	}
	
	return 0;
}




