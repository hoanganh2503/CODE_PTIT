#include<stdio.h>
#include<math.h>

int main(){
	int n;
	scanf("%d", &n);
	int i;
	for(i=1 ; i <= n ; i++){
		long a;
    scanf("%ld", &a);
    int b;
    b= sqrt(a);
    int c= b*b;
    
    if(c==a)
       printf("YES");
    else
    printf("NO");
    printf("\n");

	}
   	return 0 ;
}



