#include<stdio.h>
#include<math.h>

int ucln(int a, int b){
	if(b==0)
	   return a;
	else if(a%b==0)
	      return b;
		  else 
		      return ucln(b, a%b);
}

int main(){
    int n;
	scanf("%d", &n);
	int i;
	for(i=1 ; i<= n ; i++){
		int a, b;
		scanf("%d%d", &a, &b);
		printf("%d", ucln(a, b));
		printf("\n");
	}
	return 0;
}



