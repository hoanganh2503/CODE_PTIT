#include<stdio.h>
#include<math.h>

int main(){
	int n;
	scanf("%d", &n);
	int i, j;
    int a=1;
    int max=1;
    	int k;
    for(i=1 ; i<=n ; i++){
    	 k=max;
    		 int count=0;
    	for(j=1 ; j <= n ; j++){
    		
    		
    			if(a%2==1){
    				if(j<=a){
    			printf("%c ", 96+k);
				k++;
				max=k;
				count++;
			}
				}else{
					if(j<=a){
				printf("%c ", 96+k);
				k--;
				count++;
				}
    			
			}
			
		}
		
		
		if(a%2==1)
		max+=a;
		else
		max++;
		a++;
		printf("\n");
	}
	return 0;
}


