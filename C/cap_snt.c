#include<stdio.h>
#include<math.h>

int nguyento(int n){
	if(n<=1)
	   return 0;
	else{
		int i;
		for(i=2 ; i<= sqrt(n) ; i++){
			if(n%i==0){
			   return 0;
			}
		}
		return 1;
	}		
}

int main(){
	int n;
	scanf("%d", &n);

	     while(n--){
	     	int a;
	     	scanf("%d", &a);
		        int i;
		        int c, d;
		        for(i=2 ; i<=a/2 ; i++){
		        	c=nguyento(i);
		        	d=nguyento(a-i);
		        	if(c==1&&d==1)
		        	    printf("%d %d ", i, a-i);
				}
				printf("\n");
     	}

	return 0;
}


