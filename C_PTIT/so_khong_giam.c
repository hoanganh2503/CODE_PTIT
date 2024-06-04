#include<stdio.h>
#include<math.h>

int main(){
	int x;
	scanf("%d", &x);
	int i;
	for(i=1 ; i<= x ; i++){
		long long n;
		scanf("%lld", &n);
		int a=n%10;
		n/=10;
		int b;
		int dem1=0, dem2=0;
		for(; n>0 ;){
			b =n%10;
			n/=10;
			dem1++;
			if(a<b){
				printf("NO\n");
				break;	
			}
			
			else{
				
				int tmp = a;
				    a =b; 
				    b=tmp;
				    dem2++;
				    
			}
		}
		if(dem1==dem2)
		printf("YES\n");
	}
	
	return 0;
}

