#include<stdio.h>
#include<math.h> 

int main(){
     int x; 
	 scanf("%d",&x); 
	     while(x--){
		  long N;
		  int A[1000];
		   scanf("%ld",&N);
		    long i=0;
			    for(i=0;i<N;i++){
				 scanf("%ld",&A[i]);
				  } 
			long j; 
			for(i=0;i<N;i++){
			     long sodungdau = A[i];
			     int is_max = 1; 
			for (j=i+1;j<N;j++){
			      if (A[j] >= A[i]){
				   is_max = 0;
				    break;
					 } 
			} 
			if (is_max) 
			    printf("%ld ",sodungdau);
			 } 
			 printf("\n");
		} 
}
