#include<stdio.h>
#include<math.h>

int main(){
	int x;
	scanf("%d", &x);
	int i;
	for(i=1; i<= x ; i++){
		long long n;
		scanf("%lld", &n);
		int dem=0;
		int j=2;
		printf("Test %d: ", i);
		while(n>1){
			if(n%j==0){
				dem++;
				if(n==j){
					printf("%d(%d) ", j, dem);
				}
				n/=j;
			}
				
			else{
				if(dem>0){
					printf("%d(%d) ", j, dem);
			         dem=0;  
				}
				       		j++;
			}
		}
		printf("\n");
	}
	return 0;
}

