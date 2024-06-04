#include<stdio.h>
#include<math.h>

int main(){
	int v;
	scanf("%d", &v);
	int i;
	
	for(i=1 ; i <= v ; i++){
		long long n;
		scanf("%lld", &n);
		int count=0; 
		int j;
		for(j=1 ; j<= sqrt(n) ; j++){
			if(n%j==0){
				count ++;
			}
		}
		
		if(count==1)
			printf("YES");
		else
		   printf("NO");
	    printf("\n");
	
	}

	return 0;
}



