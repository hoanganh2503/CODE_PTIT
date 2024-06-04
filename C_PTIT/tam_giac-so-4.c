#include<stdio.h>
#include<math.h>


int main(){
    int n;
    scanf("%d", &n);
    int i, j;
    int h=1;
    int k=n-1;
    for(i=1 ; i <= n ; i++){
    	int l=1;
    	for(j = 1 ; j <= 2*n-1 ; j++){
    		
    	if(j<=n+i-1){
    	   if(j<=k){
    	   	printf("~");
		}else{
			if(j<n){
				printf("%d",l);
				l+=2;
			}else{
				printf("%d", l);
			    l-=2;
			}
			    
		
		}

		}else
		   printf(" ");
	
		}
		k--;
        h+=2;
		printf("\n");
	}
	
	return 0;
}



