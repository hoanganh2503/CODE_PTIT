#include<stdio.h>
#include<math.h>


int main(){
    int n;
    scanf("%d", &n);
    int i, j;
    int k=1;
    for(i=1 ; i <= n ; i++){
    	int h=2;
    	for(j = 1 ; j <= 2*n-1 ; j++){	
    	if(j<=2*i-1){
			if(j<i){
				printf("%c",65+h-3);
				h+=2;
			}else{
				printf("%c", 65+h-3);
			    h-=2;
			}
			    
		
		

		}else
		   printf(" ");
	
		}

        k+=2;
		printf("\n");
	}
	
	return 0;
}




