#include<stdio.h>
#include<math.h>


int main(){
    int n;
    scanf("%d", &n);
	int i, j;
	for(i = 1 ; i <= n ; i++){
		 int k = 2, h;
		for(j = 1 ; j <= 2*i - 1 ; j++){
			if(j <= i){
			printf("%d", k);
			h =k-2;
			k+=2;	
			}
			
			else{
				printf("%d", h);
					h-=2;
			}
			
		}
		printf("\n");
	}
	return 0;
}



