#include <stdio.h>
#include<math.h>


int main() {
   int i, j; 
   int n;
   int a=0;
   int h;
   scanf("%d", &n);
   for(i=0 ; i<n ;i++){
   	   		h=1;
   	for(j=0; j<n ; j++ ){

   		if(j<=a)
		   printf("0 ");
	    else{
	    	printf("%d ", h);
	    	h++;
		}
   }
   a++;
   printf("\n");
   }
   
	return 0;
}

