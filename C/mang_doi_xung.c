#include<stdio.h>
#include<math.h>


int main(){
	int x;
	scanf("%d", &x);

	     while(x--){
	     	int n;
	     	int a[10000];
	     	scanf("%d", &n);
	          int i, dem=0;;
	          for(i=1 ; i <= n ; i++){
	          	scanf("%d", &a[i]);
			  }
			  for(i=1 ; i <= n ; i++){
	          	if(a[i]==a[n+1-i])
	          	   dem++;
			  }
			  if(dem==n)
			      printf("YES");
			  else
			      printf("NO");
	     	 printf("\n");  
		}
				

	return 0;
}


