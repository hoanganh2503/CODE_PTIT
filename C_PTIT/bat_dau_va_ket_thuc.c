#include<stdio.h>
#include<math.h>

int main(){
	int v;
	scanf("%d", &v);
	int sum=0; 
	int a; 
	int i;
	for(i=1 ; i <= v ; i++){
		int n;
		scanf("%d", &n);
		int b=n%10;
		while(n>10){
			int a;
			a=n%10;
			n/=10;
		}
	    if(b==n){
	    	printf("YES");
		}
		else
		   printf("NO");
		   printf("\n");
	}

	return 0;
}



