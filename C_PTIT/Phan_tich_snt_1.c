#include<stdio.h>
#include<math.h>



int main(){
    int n;
	scanf("%d", &n);
	int i, j;
	for(i=1; i <= n  ; i++){
		int a; 
		int b=2;
		scanf("%d", &a);
		while(a>1){
			if(a%b==0){
				printf("%d  ", b);
				a/=b;
			}else{
				b++;
			}
			   
		}
		printf("\n");
	}
	return 0;
}



