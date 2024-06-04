#include<stdio.h>
#include<math.h>


int main(){
    int n;
    scanf("%d", &n);
    int i, j;
    int h=1;
    for(i=1 ; i <= n ; i++){
    	int k=2*h-1;
    	int l=1;
    	for(j = 1 ; j <= 2*n-1 ; j++){
    		
    	if(j<=h){
    	   if(j<=i){
    	   	printf("%d", l);
    	   l+=2;
		}else{
			printf("%d", l-4);
			l-=2;
		}

		}else
		   printf(" ");
	
		}
        h+=2;
		printf("\n");
	}
	
	return 0;
}



