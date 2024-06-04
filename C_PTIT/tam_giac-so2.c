#include<stdio.h>
#include<math.h>


int main(){
    int n;
    scanf("%d", &n);
    int i, j;
    int h=1;
    for(i=1 ; i <= n ; i++){
    	for(j = 1 ; j <= 2*n-1 ; j++){
    	if(j<=h){
    		if(i%2==1)
    		printf("%d", 2*j-1);
    		else
    		printf("%d", 2*j);
		}
    	
		else
		   printf(" ");
	
		}
        h++;
		printf("\n");
	}
	
	return 0;
}



