#include<stdio.h>
#include<math.h>


int main() {
    int  n;
    int a=0;
    scanf("%d", &n);
    int k;
    int i, j;
    for(i=1 ; i<=n ;i++){
        int h=0;
		for(j=1; j<=n-a;j++){
			
				k=65+a*i-a*(a-1); 
				
				printf("%c", k+h);
				h+=2;
			}
        
		
		a++;
	printf("\n");				
	}

	
	
	return 0;
}

