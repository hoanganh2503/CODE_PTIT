#include<stdio.h>
#include<math.h>




int main(){
	int x;
	scanf("%d", &x);
	while(x--){
		int a, b, c, d;
    scanf("%d%d%d%d", &a, &b, &c, &d);
    if(c-a==d-b)
	   printf("YES\n");
	else
	   printf("NO\n");
	}
    
	return 0;
}


