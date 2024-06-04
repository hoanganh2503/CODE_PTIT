#include<stdio.h>
#include<math.h>

int main(){
	int x;
	scanf("%d", &x);
	int i;
	for(i=1; i<=x; i++){
     	long long n;
        scanf("%lld", &n);
        int a, dem=0;
           for(;n>0;)	{
           	   a=n%10;
           	   dem+=a;
           	   n/=10;
		   }
		   if(dem%10==0)
		      printf("YES\n");
		    else
		      printf("NO\n");
		   
	}
    

	return 0;
}

