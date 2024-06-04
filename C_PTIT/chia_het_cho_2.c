#include<stdio.h>
#include<math.h>

int main(){
	int x;
	scanf("%d", &x);
	int i;
	while(x--){
		int n;
		scanf("%d", &n);
		int count=0;
		int j=1;
	    while (j<=n/j) { 
		if(n%j==0){ 
		    if(j%2==0) 
		         count++; 
			if(n/j%2==0) 
			    count++;  
			if (n/j==j && j%2==0) 
			    count--; 
			} 
			j++; 
			} 
			printf ("%d\n", count); 
			}
	
	return 0;
}


