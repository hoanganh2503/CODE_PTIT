#include<stdio.h>
#include<math.h>


int main() {
    int  n;
    int a=0;
    scanf("%d", &n);

    int i, j;
    for(i=n ; i>=1 ;i--){
    /*	for(j=1; j<=n-a ;j++){
    	printf("%c ", 97+n-j-1);	
		}*/
		for(j=n; j>a ;j--){
    	printf("%c", 64+2*n-1-a-j);	
		}
		a++;
		printf("\n");
	}
	
	return 0;
}
