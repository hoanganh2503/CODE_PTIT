#include<stdio.h>
#include<math.h>

long long ucln(long long a, long long b){
	if(b==0)
	   return a;
	else 
	       return ucln(b, a%b);
	   }
	


int main(){
    int x;
    scanf("%d", &x);
    int i;
    for(i=1; i<= x ; i++){
    	int a, b, c, d;
    	scanf("%d%d%d%d", &a, &b, &c, &d);
    	int g=ucln(a, b);
    	int h=ucln(c, d);
    	if(g==h)
    	   printf("YES\n");
    	else
    	   printf("NO\n");
    	
	}
		
	return 0;
}

