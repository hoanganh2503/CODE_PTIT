#include<stdio.h>
#include<math.h>

int main(){
    int n, m;
    scanf("%d%d", &n , &m);
	    int i, j;

    for(i=1 ; i<=n ;i++){
    	int c=i;
    			for(j=1 ; j<= i; j++){
    				if(j<=m){
    					printf("%d", c);
					}
			         
					c--;
	}
	c=c+2;
	for(j=i+1 ; j<= m; j++){
    	    
			printf("%d", c);
			c++;
		}	
		
	printf("\n");
    }
	
	return 0;
}

