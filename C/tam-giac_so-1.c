#include<stdio.h>
#include<math.h>


int main(){
    int n;
    scanf("%d", &n);
    int i, j;
    int h=1;
    for(i=1 ; i <= n ; i++){
    	for(j = 1 ; j <= 2*n-1 ; j++){
    	if(j<=h)
		  printf("%d", j);
		else
		   printf(" ");
	
		}
        h+=2;
		printf("\n");
	}
	
	return 0;
}



