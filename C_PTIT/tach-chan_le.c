#include<stdio.h>
 int main() { 
     int n;
	  int a[1000];
	   scanf("%d",&n);
	   int i, j;
	    for(i=0;i<n;i++){ 
		scanf("%d",&a[i]);
		 }
	    for(i=0;i<n;i++){
		if (a[i]%2==0){
		     printf("%d ",a[i]);
			  } 
		} 
		printf("\n");
		 for(j=0;j<n;j++){
		     if (a[j]%2!=0){ 
			     printf("%d ",a[j]);
				   }
		} 
		return 0;
}

